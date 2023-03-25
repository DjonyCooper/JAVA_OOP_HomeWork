package Java.OOP_6.homework.util.impl;

import Java.OOP_6.homework.User;
import Java.OOP_6.homework.util.Reportable;

public class UserReporter implements Reportable<User> {
    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
