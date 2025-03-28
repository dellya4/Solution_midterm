package task1_Coffee_shop.decorator;

import task1_Coffee_shop.factoryMethods.Coffee;

public class WhippedCreamDecorator extends CoffeeDecorator {
    int toppingPrice;

    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
        this.toppingPrice = 300;
    }

    @Override
    public String getDescription() { // Function which return price of coffee with syrup
        return super.getDescription() + "with whipped cream ";
    }

    @Override
    public int getCost() { // Function which return price of coffee with syrup
        return super.getCost() + getToppingPrice();
    }

    @Override
    public void describe() { // Function which return price of coffee with syrup
        System.out.println("Description: " + getDescription()+"\nCost: " + getCost()+" ₸");
    }

    public int getToppingPrice() {
        return toppingPrice;
    }

    public void setToppingPrice(int toppingPrice) {
        this.toppingPrice = toppingPrice;
    }
}
