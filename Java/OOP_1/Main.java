package OOP_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Мурзик"));
        animals.add(new Dog("Бобик"));
        animals.add(new Eagle("Гоша"));
        animals.add(new Duck("Дональд"));
        animals.add(new Dolphin("Флиппер"));
        animals.add(new Whale("Моби Дик"));

        for (Animal a: animals) a.toGo();
        System.out.println();

        for (Animal a: animals) a.fly();
        System.out.println();

        for (Animal a: animals) a.swim();
        System.out.println();
    }

}