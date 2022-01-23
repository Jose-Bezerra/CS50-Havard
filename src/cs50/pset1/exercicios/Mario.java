package cs50.pset1.exercicios;

import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h;

        //Prompt user for height
        do {
            System.out.println("Height: ");
            h = scanner.nextInt();
        } while (h > 8 || h < 1);

        printLeftAlignedPyramid(h);
    }

    private static void printLeftAlignedPyramid(int h) {
        //Print rows
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (i + j < h - 1){
                    System.out.printf(".");
                } else {
                    System.out.printf("#");
                }
            }
            System.out.println();
        }
    }

}
