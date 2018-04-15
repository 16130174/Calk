package Base;

import java.io.Serializable;
import java.util.HashMap;

public class User extends HashMap<String, String> implements Serializable {
        public User(String[] Args ){
                for (int i = 0; i<Args.length; i+=2){
                        put(Args[i], Args[i+1]);
                }
        }
}
