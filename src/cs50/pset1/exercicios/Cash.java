package cs50.pset1.exercicios;

import java.util.Scanner;

import static java.lang.Math.round;

public class Cash {

    static int pennie, nickel;
    static int dime, quarter;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float change_owed;
        //Prompt input user
        do {
            System.out.print("Enter the change owed ($): ");
            while (!scanner.hasNextFloat()){
                System.out.print("Enter the change owed ($): ");
                scanner.next();
            }
            change_owed = scanner.nextFloat();
        } while (change_owed <= 0);

        int coins = change_calculator(change_owed);
        System.out.printf("%d coins as described below: \n", coins);
        System.out.printf("%d quarter(s), %d dimes(s), %d nickle(s), %d penny(s)",
                quarter, dime, nickel, pennie);
    }

    private static int change_calculator(float change_owed) {
        int sum_coins = 0;
        int cents = round(change_owed * 100);
        System.out.printf("Pennies: %d\n", cents);

        while (cents > 0) {
            if (cents >= 25){
                quarter = cents / 25;
                cents = cents % 25;
            }
            if (cents >= 10){
                dime = cents / 10;
                cents = cents % 10;
            }
            if (cents >= 5){
                nickel = cents / 5;
                cents = cents % 5;
            }
            if (cents >= 1){
                pennie = cents;
                cents = 0;
            }

            sum_coins = quarter + dime + nickel + pennie;

        }
        return sum_coins;
    }
}
