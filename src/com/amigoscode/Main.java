package com.amigoscode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int altura;

      do {
          System.out.println("informe a altura desejada: ");
          altura = sc.nextInt();
      } while (altura < 1 || altura > 8);

      imprime_piramide(altura);


    }

    private static void imprime_piramide(int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i + j < altura -1) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }

            System.out.print("..");


            for (int k = 0; k <= altura ; k++) {
                if (i + k > altura - 1) {
                    System.out.print("#");
                }
            }

            System.out.println();
        }
    }
}
