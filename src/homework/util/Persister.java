package homework.util;

import homework.User;

public class Persister implements Persisterable{

    public static void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}
