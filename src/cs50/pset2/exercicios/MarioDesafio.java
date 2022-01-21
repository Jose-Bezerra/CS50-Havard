package cs50.pset2.exercicios;

import java.util.Scanner;

public class MarioDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h;

        //Prompt user for height
        do {
            System.out.printf("Height: ");
            h = scanner.nextInt();
        } while (h > 8 || h < 1);

        printPyramid(h);
    }

    private static void printPyramid(int h) {
        //Print rows
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (i + j < h - 1){
                    System.out.printf(" ");
                } else {
                    System.out.printf("#");
                }
            }

            //Gap between left and right side
            System.out.printf("  ");

            for (int k = 0; k <= h; k++) {
                if (i + k >= h){
                    System.out.printf("#");
                }
            }
            System.out.println();
        }

    }

}
