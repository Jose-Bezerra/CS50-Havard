package cs50.pset1;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        //Input Data
        Scanner scanner = new Scanner(System.in);

        //Prompt user for regular price
        System.out.println("Regular Price: ");
        float regular = scanner.nextFloat();

        //Prompt user for percent off
        System.out.println("Percent Off: ");
        int percent_off = scanner.nextInt();
        float sale = discount(regular, percent_off);
        System.out.printf("Sale Price: %.2f", sale);
    }

    private static float discount(float price, int percentage)
    {
        return (float) (price * (100 - percentage) / 100);
    }

}
