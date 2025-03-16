package task1_Coffee_shop.factoryMethods;
import task1_Coffee_shop.coffee.*;

public class CoffeeFactory { // Class coffee factory
    public static Coffee getCoffee(String type){
        String desc = "";
        int price = 0;

        switch (type) { // Create the object to type of coffee
            case "Americano":
                desc = "Light black coffee diluted with water "; // Add description
                price = 1050; // Add price
                return Americano.AmericanoFactory.createCoffee(desc, price);
            case "Cappuccino":
                desc = "Coffee with milk foam and smooth taste "; // Add description
                price = 1250; // Add price
                return Cappuccino.CappuccinoFactory.createCoffee(desc, price);
            case "Espresso":
                desc = "Strong black coffee with rich flavor "; // Add description
                price = 900; // Add price
                return Espresso.EspressoFactory.createCoffee(desc, price);
            case "Latte":
                desc = "Mild coffee with plenty of milk "; // Add description
                price = 1250; // Add price
                return Latte.LatteFactory.createCoffee(desc, price);
            default:
                System.out.println("Invalid type"); // If write not correct type
                return null;
        }
    }
}
