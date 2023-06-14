package test;

import domain.Dragon;
import domain.Animal;

public class TestAnimal {

      public static void main(String[] args) {
           Animal animal = new Animal("Tor", 25);
        animal.eat();
        animal.sleep();

        Dragon Dragon = new Dragon("Tesak", 35);
        Dragon.eat();
        Dragon.sleep();
        Dragon.cave();
        Dragon.run();
    }
}

