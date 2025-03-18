package task1_Coffee_shop.menu;

import task1_Coffee_shop.factoryMethods.*;
import task1_Coffee_shop.decorator.*;
import static task1_Coffee_shop.factoryMethods.CoffeeFactory.getCoffee;
import java.util.Scanner;

public class Menu {
    private final Scanner sc = new Scanner(System.in);
    private Coffee coffee;

    public void start() { // Start function
        showWelcome();
        selectCoffee();
        addToppings();
        showFinalCoffee();
        showEnd();
    }

    private void showWelcome() { // Hello words and type of coffee
        System.out.println("""
                Welcome to our Coffee Shop! ☕️
                Here, you can choose your favorite coffee \
                and customize it with a variety of ingredients and toppings.

                Please select your base coffee:
                1. Espresso. Strong black coffee with rich flavor
                2. Cappuccino. Coffee with milk foam and smooth taste
                3. Latte. Mild coffee with plenty of milk
                4. Americano. Light black coffee diluted with water

                Please enter the name of your coffee:""");
    }

    private void selectCoffee() { // Select basic coffee
        String type = sc.nextLine();
        coffee = getCoffee(type);
        coffee.describe();
    }

    private void addToppings() { // Add toppings
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
    }

    private void showFinalCoffee() { // Print information about final coffee
        coffee.describe();
    }

    private void showEnd() { // End information
        System.out.println("Thank you for your order! ☕️\n" +
                "Enjoy your coffee and visit us again!");
    }
}
