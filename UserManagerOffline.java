package Base;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UserManagerOffline {
    private static Map<String, User> users = new HashMap<>();//Инициализация пустого ассоциативного массива пользователей

    //Регистрация пользователя
    //Args - набор аргументов {"username","имя_пользователя","password","пароль_пользователя","имя_доп_параметра","значение_доп_параметра", и т.д. }
    public static void SignUp(String[] Args) throws Exception {
        File file = new File("data.bin");
        if(file.exists()){
            FileInputStream fileInputStream = new FileInputStream(file);//Потоковое чтение сериализованного объекта из файла(для последующего добавления нового пользователя)
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);//Потоковая десериализация данных
            users = (Map<String, User>) objectInputStream.readObject();//Восстановление типа базы данных для возможности обращения к ее элементам
            fileInputStream.close();//Закрытие потока чтения данных
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);//Потоковая запись сериализованного объекта
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);//Потоковая сериализация базы данных(БД) - сохранение структуры данных объекта для хранения
        users.put(Args[1], new User(Args));//Добавление пользователя в ассоциативный массив для более эффективного поиска(Это и есть база данных пользователей)
        objectOutputStream.writeObject(users);//Сериализация БД
        objectOutputStream.flush();//Очистка буфера вывода перед закрытием потока
        objectOutputStream.close();//Закрытие потока сериализации
    }
    //Авторизация пользователя
    //Args - набор аргументов {"username","имя_пользователя","password","пароль_пользователя"}
    public static User SignIn(String[] Args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("data.bin");//Потоковое чтение сериализованного объекта из файла
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);//Потоковая десериализация данных
        users = (Map<String, User>) objectInputStream.readObject();//Восстановление типа базы данных для возможности обращения к ее элементам
        User user = users.get(Args[1]);//Поиск пользователя по логину
        if(!user.get(Args[2]).equals(Args[3])) throw new Exception("Incorrect password");//Проверка хешеризированных паролей
        return user;//В случае успеха метод возвращает пользователя с данным логином и паролем 
    }
}
