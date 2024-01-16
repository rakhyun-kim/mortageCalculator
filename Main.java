import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        double monthlyInterestRate = annualInterest / 100 / 12;

        System.out.println("Period (Years): ");
        int years = scanner.nextInt();
        int numberOfPayments = years * 12;


        double monthlyPament = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        // Result
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(monthlyPament);
        System.out.println("Mortgage: " + mortgageFormatted);

        scanner.close();
    }
}