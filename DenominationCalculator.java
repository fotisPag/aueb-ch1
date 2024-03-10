package gr.aueb.cf.ch1;

import java.util.Scanner;

public class DenominationCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        int[] denominations = {500, 200, 100, 50, 20, 10, 5};
        int[] counts = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            counts[i] = amount / denominations[i];
            amount %= denominations[i];
        }

        System.out.println("Denomination breakdown:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.printf("%d uses of %d\n", counts[i], denominations[i]);
        }

        scanner.close();
    }
}
