package Base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserManagerOfflineTest {

    //NOTE Thread.sleep(100) - Ожидание 100мс текущим потоком выполнения для сихронизации с потоком чтения и записи, т.к.
    //                                      носители информации типа HDD/SSD имеют гораздо более низкую скорость доступа к памяти
    @Test
    void signUp() throws Exception {
        UserManagerOffline.SignUp(new String[]{"username","root","password","rootpass","optional","optvalue"});
        Thread.sleep(100);
        UserManagerOffline.SignUp(new String[]{"username","root22","password","rootpass22","optional","optvalue22"});
        Thread.sleep(100);
        User user = UserManagerOffline.SignIn(new String[]{"root","rootpass"});
        assertEquals("optvalue",user.get("optional"));
        Thread.sleep(100);
    }

    @Test
    void signIn() throws Exception {
        User user = UserManagerOffline.SignIn(new String[]{"root22","rootpass22"});
        assertEquals("optvalue22",user.get("optional"));
    }
}