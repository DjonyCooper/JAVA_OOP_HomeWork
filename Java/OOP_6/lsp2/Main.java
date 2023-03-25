package Java.OOP_6.lsp2;

import Java.OOP_6.lsp2.factory.OrderFactory;
import Java.OOP_6.lsp2.model.Order;
import Java.OOP_6.lsp2.model.Orderable;
import Java.OOP_6.lsp2.util.OrderCalculator;

public class Main {
    public static void main(String[] args) {
        OrderFactory creator = new OrderFactory();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2, false));
        calculator.add(creator.create(1, 3, true));

        for (Orderable order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Сумма заказа %d", calculator.calcAmount());
    }
}