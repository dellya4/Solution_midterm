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
        addSyrup();
        addTopping();
        showFinalCoffee();
        showEnd();
    }

    private void showWelcome() { // Hello words and type of coffee
        int espressoPrice = 900;
        int cappuccinoPrice = 1250;
        int lattePrice = 1250;
        int americanoPrice = 1050;
        System.out.printf("""
                Welcome to our Coffee Shop! ☕️
                Here, you can choose your favorite coffee \
                and customize it with a variety of ingredients and toppings.

                Please select your base coffee:
                1. Espresso. Strong black coffee with rich flavor (%d₸)
                2. Cappuccino. Coffee with milk foam and smooth taste (%d₸)
                3. Latte. Mild coffee with plenty of milk (%d₸)
                4. Americano. Light black coffee diluted with water (+%d₸)

                Please enter the name of your coffee:
                """,
                espressoPrice, cappuccinoPrice, lattePrice, americanoPrice
                );
    }

    private void selectCoffee() { // Select basic coffee
        String type = sc.nextLine();
        coffee = getCoffee(type);
        coffee.describe();
    }

    private void addSyrup() { // Add toppings
        int chocolatePrice = 250;
        int saltCaramel = 200;
        int Pistachio = 200;
        System.out.printf("""
                    You can add one of the following toppings to your coffee (+200₸ each):
                    0. Not adding syrup.
                    1. Chocolate syrup (+%d₸)
                    2. Salted caramel (+%d₸)
                    3. Pistachio syrup (+%d₸)

                    Please select an option (number):
                    """,
                chocolatePrice, saltCaramel, Pistachio);

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
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }


    private void addTopping() {
        int cinnamonPrice = 250;
        int whippedCreamPrice = 300;
        int honeyPrice = 150;
        System.out.printf("""
                    You can add one of the following toppings to your coffee:
                    0. Not adding toppings
                    1. Cinnamon (+%d₸)
                    2. Whipped cream (+%d₸)
                    3. Honey (+%d₸)

                    Please select an option (number):
                    """,
                cinnamonPrice, whippedCreamPrice, honeyPrice);

        int answer = sc.nextInt();
        switch (answer) {
            case 1:
                coffee = new CinnamonDecorator(coffee);
                System.out.println("Added: Cinnamon");
                break;
            case 2:
                coffee = new WhippedCreamDecorator(coffee);
                System.out.println("Added: Whipped cream");
                break;
            case 3:
                coffee = new HoneyDecorator(coffee);
                System.out.println("Added: Honey");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
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