package practice;

import java.util.Scanner;

public class CoffeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String name;
        double price;
        int quantity;
        char currency = '$';

        //User Input
        System.out.print("Enter your name: ");
        name=scanner.nextLine();

        System.out.print("Enter drink price: ");
        price=scanner.nextDouble();

        System.out.print("Enter quantity: ");
        quantity=scanner.nextInt();

        System.out.println("\n--- RECEIPT ---");

        //Group 1 name
        if(name.isEmpty()){
            System.out.println("You didn't enter a name!");
        }
        else{
            System.out.println("Customer: " + name);
        }

        // Group 2 price
        if (quantity <= 0) {
            System.out.println("Invalid quantity!");
        }
        else {
            double subtotal = price * quantity;
            double discountRate = 0.0;

            // Group 3 Discount
            if(quantity >= 10){
                discountRate = 0.10;
            }
            else if (quantity >=5) {
                discountRate = 0.05;
            }

            //Calculate final price
            double discount = subtotal * discountRate;
            double finalPrice = subtotal - discount;

            //Print receipt
            System.out.println("Subtotal: " + currency + subtotal);
            System.out.println("Discount: " + (discountRate * 100) + "%");
            System.out.println("Final total: " + currency + finalPrice);

            }
        scanner.close();
        }
    }

