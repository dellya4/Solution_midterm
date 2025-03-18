package task1_Coffee_shop.factoryMethods;

public abstract class Coffee { // Abstract class Coffee
    public String description;
    public int cost;

    public Coffee(String description, int cost) {
        this.description = description;
        this.cost = cost;
    }

    public int getCost() { // Function which return cost of coffee
        return cost;
    }

    public String getDescription() { // Function which return description of coffee
        return description;
    }

    public void describe() { // Function which describes coffee
        System.out.println("Description: "+description+"\nPrice: "+cost +" ₸");
    }

}
