package task1_Coffee_shop.coffee;

import task1_Coffee_shop.factoryMethods.Coffee;

public class Cappuccino implements Coffee { // Create class Cappuccino
    public String description;
    public int cost;

    public Cappuccino(String description, int cost) { // Constructor for Americano
        this.description = description;
        this.cost = cost;
    }

    @Override
    public int getCost() { // Function which return cost of coffee
        return cost;
    }

    @Override
    public String getDescription() { // Function which return description of coffee
        return description;
    }

    @Override
    public void describe() { // Function which describes coffee
        System.out.println("Description: "+description+"\nPrice: "+cost +" ₸");
    }

    public static class CappuccinoFactory { // Static subclass which create this type
        public static Coffee createCoffee(String description, int cost) {
            return new Cappuccino(description, cost);
        }
    }
}
