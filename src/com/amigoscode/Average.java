package com.amigoscode;

import java.util.Scanner;

import static java.lang.System.in;

public class Average {
    private static final int TOTAL = 3;

    public static void main(String[] args) {
        int[] scores = new int[3];

        for (int i = 0; i < TOTAL; i++) {
            System.out.println("Pontuação: ");
            scores[i] = new Scanner(in).nextInt();
        }

        System.out.printf("Média: %.2f", media(TOTAL, scores));
    }

    private static float media(int length, int[] array) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }
        return sum / (float) length;
    }
}
