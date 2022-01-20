package com.amigoscode;

import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        System.out.println("Nome: ");
        String nome = new Scanner(System.in).nextLine();

        //Convertendo minúscula em maiúscula com base na tabela ASCCI
        for (int i = 0, n = nome.length(); i < n; i++) {
            if (nome.charAt(i) >= 'a' && nome.charAt(i) <= 'z') {
                System.out.printf("%c", nome.charAt(i) - 32);
            } else {
                System.out.printf("%c", nome.charAt(i));
            }
        }
        System.out.println();
        System.out.println(nome.toUpperCase());
    }
}
