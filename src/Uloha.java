import java.util.Scanner;

public class Uloha {
    public static void main(String[] args) {
        // Get the initial deposit amount from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vklad: ");
        double initialDeposit = scanner.nextDouble();

        // Get the annual interest rate from the user
        System.out.print("Kolko sa ma urocit: ");
        double annualInterestRate = scanner.nextDouble();

        // Calculate the deposit sum in two years
        double depositSum = initialDeposit * Math.pow(1 + annualInterestRate, 2);

        // Print the deposit sum in two years
        System.out.printf("Vysledok: %.2f", depositSum);

        scanner.close();
    }
}