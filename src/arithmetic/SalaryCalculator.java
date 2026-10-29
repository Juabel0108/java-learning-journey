package arithmetic;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee name: ");
        String name = input.nextLine();

        System.out.print("Hours worked: ");
        double hours = input.nextDouble();

        System.out.print("Hourly rate: ");
        double rate = input.nextDouble();

        double salary = hours * rate;

        System.out.println("\n--- SALARY SUMMARY ---");
        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Hourly rate: " + rate);
        System.out.println("Weekly salary: " + salary);

        input.close();
    }
}
