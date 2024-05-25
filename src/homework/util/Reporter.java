package homework.util;

import homework.User;

public class Reporter implements Reportable{
    public static void report(User user){
        System.out.println("Report for user: " + user.getName());
    }
}
