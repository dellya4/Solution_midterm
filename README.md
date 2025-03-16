# Design Patterns Midterm Project

## Project Overview

This project consists of two independent tasks, each demonstrating classical design patterns:

- **Coffee Shop Simulator (Easy Level – 40 points)**
- **Online Payment Gateway (Medium Level – 60 points)**

Each task contains a console-based demo application and correct implementation of the required patterns.

---

## Task 1: Coffee Shop Simulator (40 points)

### Design Patterns Used:

- **Factory Method:**  
  Used to create various types of coffee (`Espresso`, `Cappuccino`, `Latte`, `Americano`).

- **Decorator Pattern:**  
  Dynamically adds toppings to the coffee:
  - Chocolate syrup
  - Salted caramel
  - Pistachio syrup
  - Whipped cream

---

### Architecture:

- **Coffee Interface:**  
  Contains methods `getCost()` and `getDescription()`.

- **Concrete Coffee Classes:**  
  Implement the `Coffee` interface, describing each type of coffee.

- **CoffeeFactory:**  
  Uses the Factory Method to return the appropriate coffee object based on user choice.

- **Topping Decorators:**  
  Wrap the `Coffee` object, modifying its description and cost dynamically.

---

### How It Works:

1. The user selects a base coffee (Espresso, Cappuccino, Latte, Americano).
2. The user may add any number of toppings.
3. The system displays the final customized coffee description and total cost.

---

# Task 2: Online Payment Gateway (60 points)

## Project Overview

This task demonstrates the use of classical design patterns to implement an online payment platform that supports multiple payment methods.

---

## Design Patterns Used:

- **Factory Method:**
  - Encapsulates creation of various payment methods:
    - Credit Card (`CreditCardPayment`)
    - PayPal (`PayPalPayment`)
    - Cryptocurrency (`CryptoPayment`)

- **Adapter Pattern:**
  - Integrates a fake external PayPal API (`ExternalPayPalAPI`) into the system.

---

## Additional Features:

- Transaction statuses:
  - **Pending**, **Success**, **Failed**

- **Transaction Logger:**
  - Keeps history of all transactions, showing:
    - Payment method
    - Transaction amount
    - Transaction status

- Basic error handling:
  - Payment limits exceeded
  - Invalid credentials
  - Failed transactions

---

## Architecture:

- **PaymentMethod Interface:**
  - Defines:
    - `processPayment()`
    - `validateCredentials()`

- **Concrete Payment Classes:**
  - `CreditCardPayment`
  - `PayPalPayment` (acts as Adapter)
  - `CryptoPayment`

- **PaymentFactory:**
  - Implements Factory Method pattern to return appropriate payment method based on user selection.

---

## How It Works:

1. The user selects a payment method:
   - Credit Card
   - PayPal
   - Cryptocurrency
2. For PayPal, the user is prompted to enter their email.
3. The user inputs the payment amount.
4. The system processes the payment:
   - Validates credentials
   - Applies payment limits
   - Logs the transaction
5. The user can view the transaction history anytime.

---

## Technologies Used:

- Java SE
- Console-based interface
- OOP principles
- Design Patterns: Factory Method, Adapter
- Basic error and transaction handling

---

Author: Student of Narxoz University, Adel Abdrakhmanova.

