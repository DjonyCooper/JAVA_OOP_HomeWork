package Java.OOP_6.lsp2.factory;

import Java.OOP_6.lsp2.model.Order;
import Java.OOP_6.lsp2.model.OrderBonus;
import Java.OOP_6.lsp2.model.Orderable;

public class OrderFactory {
    public Orderable create(int quantity, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(quantity, price);
        }
        return new Order(quantity, price);
    }
}