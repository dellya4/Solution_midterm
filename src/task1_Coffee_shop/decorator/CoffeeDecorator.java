package task1_Coffee_shop.decorator;

import task1_Coffee_shop.factoryMethods.Coffee;

public abstract class CoffeeDecorator extends Coffee { // Decorator for coffee with doping
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) { // Constructor for decorator
        super(coffee.getDescription(), coffee.getCost());
        this.coffee = coffee;
    }

    @Override
    public int getCost() { // Function which return price of coffee with syrup
        return coffee.getCost();
    }

    @Override
    public String getDescription() { // Function which return description of coffee with syrup
        return coffee.getDescription();
    }

    @Override
    public void describe() {
        System.out.println("Description: " + coffee.getDescription()+"/Price: "+coffee.getCost());;
    }
}
