package task1_Coffee_shop.decorator;

import task1_Coffee_shop.factoryMethods.Coffee;

public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() { // Function which return price of coffee with syrup
        return super.getDescription() + "with whipped cream ";
    }

    @Override
    public int getCost() { // Function which return price of coffee with syrup
        return super.getCost() + 200;
    }

    @Override
    public void describe() { // Function which return price of coffee with syrup
        System.out.println("Description: " + getDescription()+"\nCost: " + getCost()+" ₸");
    }
}
