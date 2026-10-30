package practice;

import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = input.nextLine();

        System.out.print("Enter a coffee shop: ");
        String coffeeShop = input.nextLine();

        System.out.print("Enter an animal: ");
        String animal = input.nextLine();

        System.out.print("Enter a drink: ");
        String drink = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter a past tense verb: ");
        String verb = input.nextLine();

        System.out.println("\n--- COFFEE SHOP DISASTER ---");
        System.out.println("\nOne mornig " + name + " arrived at " + coffeeShop);
        System.out.println("Suddenly, a " + adjective + " " + animal + " appeared!");
        System.out.println("The " + animal + " grabbed a " + drink + ".");
        System.out.println("Then it " + verb + " across the coffee bar.");
        System.out.println("\nTHE END!");

        input.close();
    }
}
