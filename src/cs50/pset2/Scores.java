package cs50.pset2;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] scores = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Score%d: ", i + 1);
            scores[i] = scanner.nextInt();
        }

        System.out.printf("Average: %f", (scores[0] + scores[1] + scores[2]) / 3.00);
    }
}
