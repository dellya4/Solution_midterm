package task1_Coffee_shop.coffee;

import task1_Coffee_shop.factoryMethods.Coffee;

public class Cappuccino extends Coffee { // Create class Cappuccino

    public Cappuccino(String description, int cost) { // Constructor for Americano
        super(description, cost);
    }

    public static class CappuccinoFactory { // Static subclass which create this type
        public static Coffee createCoffee(String description, int cost) {
            return new Cappuccino(description, cost);
        }
    }
}
