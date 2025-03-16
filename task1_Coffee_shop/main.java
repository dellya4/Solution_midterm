package task1_Coffee_shop;

import task1_Coffee_shop.factoryMethods.*;
import task1_Coffee_shop.decorator.*;
import static task1_Coffee_shop.factoryMethods.CoffeeFactory.getCoffee;
import java.util.Scanner;


public class main {
    public static void main(String[] args) { //
        Scanner sc = new Scanner(System.in);
        begin(); // Start info
        String type = sc.nextLine(); // Take type of coffee
        Coffee coffee = getCoffee(type); // Create coffee
        coffee.describe(); // Describe coffee
        coffee = addDoping(coffee); // Add doping
        coffee.describe(); // Describe coffee
        end(); // End info
    }


    public static void begin() { // Hello words and type of coffee
        System.out.println("""
                Welcome to our Coffee Shop! ☕️
                Here, you can choose your favorite coffee \
                and customize it with a variety of ingredients and toppings.

                Please select your base coffee:
                1. Espresso.\
                 Strong black coffee with rich flavor\s
                2. Cappuccino.\
                 Coffee with milk foam and smooth taste\s
                3. Latte.\
                 Mild coffee with plenty of milk\s
                4. Americano.\
                 Light black coffee diluted with water
                 
                 Please select an option (name):"""
        );
    }

    public static Coffee addDoping(Coffee coffee) { // Get information about doping and create decorators
        Scanner sc = new Scanner(System.in);
        boolean adding = true;
        while (adding) {
            System.out.println("""
                You can add one of the following toppings to your coffee (+200₸ each):
                1. Chocolate syrup
                2. Salted caramel
                3. Pistachio syrup
                4. Whipped Cream
                0. Done adding toppings or not adding toppings

                Please select an option (number):""");

            int answer = sc.nextInt();
            switch (answer) {
                case 1:
                    coffee = new ChocolateDecorator(coffee);
                    System.out.println("Added: Chocolate syrup");
                    break;
                case 2:
                    coffee = new SaltCaramelDecorator(coffee);
                    System.out.println("Added: Salted caramel");
                    break;
                case 3:
                    coffee = new PistachioDecorator(coffee);
                    System.out.println("Added: Pistachio syrup");
                    break;
                case 4:
                    coffee = new WhippedCreamDecorator(coffee);
                    System.out.println("Added: Whipped Cream");
                    break;
                case 0:
                    adding = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        return coffee;
    }


    public static void end() { // Finishing words
        System.out.println("Thank you for your order! ☕️\n" +
                "Enjoy your coffee and visit us again!");
    }
}
