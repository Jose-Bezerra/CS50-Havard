package cs50.pset1;

import java.util.Scanner;

public class Pennies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dollar amount: ");
        float amount = scanner.nextFloat();
        float pennies = amount * 100;

        System.out.printf("Pennies: %.0f", pennies);
    }
}
