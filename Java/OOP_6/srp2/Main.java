package Java.OOP_6.srp2;

import Java.OOP_6.srp2.model.Order;
import Java.OOP_6.srp2.util.JSONSaver;
import Java.OOP_6.srp2.util.Saver;
import Java.OOP_6.srp2.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        ConsoleView consoleView = new ConsoleView();
        Order order = consoleView.inputFromConsole();
        Saver orderSaver = new JSONSaver(order);
        orderSaver.save();
    }
}