package cs50.pset1;

import java.util.Scanner;

public class Agree {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you agree? ");
        //Prompt user for agree
        char c = scanner.next().charAt(0);
        if (c == 'y' || c == 'Y')
        {
            System.out.println("Agreed.");
        }
        else if (c == 'n' || c == 'N')
        {
            System.out.println("Not agreed.");
        }
    }
}
