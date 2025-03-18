package task1_Coffee_shop.coffee;

import task1_Coffee_shop.factoryMethods.Coffee;

public class Espresso extends Coffee { // Create class Espresso

    Espresso(String description, int cost) { // Constructor for Americano
        super(description, cost);
    }

    public static class EspressoFactory { // Static subclass which create this type
        public static Coffee createCoffee(String description, int cost) {
            return new Espresso(description, cost);
        }
    }
}
