package arithmetic;

import java.util.Scanner;

public class CupInventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total cups: ");
        int cups = input.nextInt();

        System.out.print("Cups per package: ");
        int cupsPerPackage = input.nextInt();

        int totalPackages = cups / cupsPerPackage;
        int remaining = cups % cupsPerPackage;

        System.out.println("\n--- INVENTORY SUMMARY ---");
        System.out.println("Complete packages: " + totalPackages);
        System.out.println("Remaining: cups: " + remaining);

        input.close();
    }
}
