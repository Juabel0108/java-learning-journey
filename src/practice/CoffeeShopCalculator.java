package practice;

import java.util.Scanner;

public class CoffeeShopCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        String drink;
        double price;
        int amount;
        char currency = '$';

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your drink: ");
        drink = input.nextLine();
        System.out.print("Enter drink price: ");
        price = input.nextDouble();
        System.out.print("Enter quantity: ");
        amount = input.nextInt();

        double total = price * amount;

        System.out.println("\n---Receipt---");
        System.out.println("Customer: " + name);
        System.out.println("Drink: " + drink + "/s");
        System.out.println("Quantity: " + amount);
        System.out.println("Total: " + currency + total);

        input.close();
    }
}
