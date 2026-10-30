package JavaWarmups;

import java.util.Scanner;

public class Warmup01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter how many hours you worked: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly rate: ");
        double rate = input.nextDouble();

        double salary = hours * rate;

        System.out.println("Name: " + name);
        System.out.println("Gross Salary: $" + salary);

        input.close();
    }
}
