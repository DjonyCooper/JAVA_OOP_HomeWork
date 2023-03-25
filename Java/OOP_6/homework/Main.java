package Java.OOP_6.homework;

import Java.OOP_6.homework.util.impl.UserSaver;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        user.report();
        UserSaver.save(user);
    }
}