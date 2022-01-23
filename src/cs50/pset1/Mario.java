package cs50.pset1;

import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Size: ");
            n = scanner.nextInt();
        } while (n < 1);

        //For each row
        for (int i = 0; i < n; i++) {
            //For each column
            for (int j = 0; j < n; j++) {
                //Print a brick
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
