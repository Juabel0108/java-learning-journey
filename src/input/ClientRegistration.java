package input;

import java.util.Scanner;

public class ClientRegistration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter client name: ");
        String clietName = input.nextLine();

        System.out.print("Number of guests: ");
        int guests = input.nextInt();

        System.out.print("Price per guest: ");
        double price = input.nextDouble();

        System.out.println("\nClient: " + clietName);
        System.out.println("Guests: " + guests);
        System.out.println("Price: " + price);

    input.close();
    }

}
