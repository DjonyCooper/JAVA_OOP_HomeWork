package OOP_2;

import OOP_2.impl.*;
import veterinary.VetClinic;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();

        vetClinic
                .addAnimal(new Cat("Барсик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"))
                .addAnimal(new Eagle("Альберт"))
                .addAnimal(new Parrot("Гоша"))
                .addAnimal(new Dolphin("Флиппер"))
                .addAnimal(new Whale("Моби Дик"))
                .addAnimal(new Doctor("Василич"));

        System.out.println("All animals:");
        for (Animal a: vetClinic.getAllAnimals()) {
            System.out.println(a);
            a.speak();
        }

        System.out.println("\nRunning animals:");
        for (Runnable r: vetClinic.getRunningAnimals()) {
            System.out.println(r + "\n" + r.getRunningSpeed());
        }

        System.out.println("\nSwimming animals:");
        for (Swimmable s: vetClinic.getSwimmingAnimals()) {
            System.out.println(s + "\n" + s.getSwimmingSpeed());
        }

        System.out.println("\nFlying animals:");
        for (Flyable f: vetClinic.getFlyingAnimals()) {
            System.out.println(f + "\n" + f.getFlightSpeed());
        }

        System.out.println("\nSpeaking animals:");
        for (Speakable sp: vetClinic.getSpeakingAnimals()) {
            System.out.println(sp);
            sp.speak();
        }

        System.out.println("\nHead physician of this clinic:");
        System.out.println(vetClinic.getHeadPhysician());
        vetClinic.getHeadPhysician().speak();
        vetClinic.getHeadPhysician().work();
    }
}
