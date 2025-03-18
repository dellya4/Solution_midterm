package task1_Coffee_shop.coffee;

import task1_Coffee_shop.factoryMethods.Coffee;

public class Latte extends Coffee { // Create class Latte

    public Latte(String description, int cost) { // Constructor for Americano
        super(description, cost);
    }

    public static class LatteFactory { // Static subclass which create this type
        public static Coffee createCoffee(String description, int cost) {
            return new Latte(description, cost);
        }
    }
}
