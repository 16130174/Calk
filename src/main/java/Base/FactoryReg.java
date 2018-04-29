package Base;

public class FactoryReg {
    /**
     * Вспомогательная точка входа в программу для создания и добавления пользователей
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        UserManagerOffline.SignUp(new String[]{"username","admin","password","admin","SomeData","Hello, World!"});
    }
}
