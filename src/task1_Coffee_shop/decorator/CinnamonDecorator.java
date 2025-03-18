package task1_Coffee_shop.decorator;

import task1_Coffee_shop.factoryMethods.Coffee;

public class CinnamonDecorator extends CoffeeDecorator {
    int toppingPrice;

    public CinnamonDecorator(Coffee coffee) {
        super(coffee);
        this.toppingPrice = 250;
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
