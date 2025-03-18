package task1_Coffee_shop.coffee;

import task1_Coffee_shop.factoryMethods.Coffee;

public class Americano extends Coffee { // Create class Americano

    public Americano(String description, int cost) { // Constructor for Americano
        super(description, cost);
    }

    public static class AmericanoFactory { // Static subclass which create this type
        public static Coffee createCoffee(String description, int cost) {
            return new Americano(description, cost);
        }
    }
}
