package task1_Coffee_shop.decorator;

import task1_Coffee_shop.factoryMethods.Coffee;

public class PistachioDecorator extends CoffeeDecorator { // Decorator for coffee with doping
    int syrupPrice;

    public PistachioDecorator(Coffee coffee) { // Constructor for decorator
        super(coffee);
        this.syrupPrice = 150;
    }

    @Override
    public String getDescription() { // Function which return description of coffee with syrup
        return super.getDescription() + "with salt caramel syrup ";
    }

    @Override
    public int getCost() { // Function which return price of coffee with syrup
        return super.getCost() + getSyrupPrice();
    }

    public int getSyrupPrice() {
        return syrupPrice;
    }

    public void setSyrupPrice(int syrupPrice) {
        this.syrupPrice = syrupPrice;
    }
}
