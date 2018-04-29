package Base;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Класс реализующий взаимодействия с базой данных в режиме "оффлайн"
 */
public final class UserManagerOffline {
    //Инициализация пустого ассоциативного массива пользователей
    private static Map<String, User> users = new HashMap<>();

    /**
     * Регистрация пользователя
     * Формирует базу данных основанную на таблице HashMap и сериализует ее в файл
     * Если файл уже создан, то предварительно считает из него данные
     * @param Args Массив аргументов/данные пользователя, Шаблон: {"username","имя_пользователя","password","пароль_пользователя","опциональный_параметр","его_значение", и т.д.}
     *             ВАЖНО!!! Первые 4 элемента обязательны
     * @throws Exception
     */
    public static void SignUp(String[] Args) throws Exception {
        File file = new File("data.bin");
        //Проверка существоавния файла БД
        if(file.exists()){
            FileInputStream fileInputStream = new FileInputStream(file);                    //Потоковое чтение сериализованного объекта из файла(для последующего добавления нового пользователя)
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);   //Потоковая десериализация данных
            users = (Map<String, User>) objectInputStream.readObject();                     //Восстановление типа базы данных для возможности обращения к ее элементам
            fileInputStream.close();                                                        //Закрытие потока чтения данных
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);                     //Потоковая запись сериализованного объекта
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);   //Потоковая сериализация базы данных(БД) - сохранение структуры данных объекта для хранения
        Args[3] = String.valueOf(Args[3].hashCode());
        users.put(Args[1], new User(Args));                                                 //Добавление пользователя в ассоциативный массив для более эффективного поиска(Это и есть база данных пользователей)
        objectOutputStream.writeObject(users);                                              //Сериализация БД
        objectOutputStream.flush();                                                         //Очистка буфера вывода перед закрытием потока
        objectOutputStream.close();                                                         //Закрытие потока сериализации
    }

    /**
     * Авторизация пользователя
     * Десериализует HashMap базу данных пользователей из файла, ищет заданного пользователя, сверяет результат результат хешфункции от пароля пользователя
     * @param Args Массив аргументов/данные пользователя, Шаблон: {"имя_пользователя","пароль_пользователя"}
     * @return Возвращает структуру HashMap пользователя
     * @throws Exception Ошибки при чтении данных и несовпадении результата хэш-функции от пароля
     */
    public static User SignIn(String[] Args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("data.bin");                    //Потоковое чтение сериализованного объекта из файла
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);               //Потоковая десериализация данных
        users = (Map<String, User>) objectInputStream.readObject();                                 //Восстановление типа базы данных для возможности обращения к ее элементам
        User user = users.get(Args[0]);                                                             //Поиск пользователя по логину
        if(!user.get("password").equals(String.valueOf(Args[1].hashCode())))
            throw new Exception("Incorrect password");                                              //Проверка хешеризированных паролей
        return user;                                                                                //В случае успеха метод возвращает пользователя с данным логином и паролем
    }
}
