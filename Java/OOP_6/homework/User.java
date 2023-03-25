package Java.OOP_6.homework;

import Java.OOP_6.homework.util.Reportable;
import Java.OOP_6.homework.util.impl.UserReporter;

public class User {
    private final String name;
    private final Reportable<User> reporter;

    public User(String name, Reportable<User> reporter){
        this.name = name;
        this.reporter = reporter;
    }

    public User(String name) {
        this(name, new UserReporter());
    }

    public String getName(){
        return name;
    }

    public void report(){
        reporter.report(this);
    }
}
