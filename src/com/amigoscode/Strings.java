package com.amigoscode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        char c1 = 'H';
//        char c2 = 'I';
//        char c3 = '!';
//        int i1 = c1;
//        int i2 = c2;
//        int i3 = c3;
//
//        String s = "HI!";
//
//        System.out.printf("%c%c%c\n", c1, c2, c3);
//        System.out.printf("%d %d %d\n", i1, i2, i3);
//        System.out.printf("%s %s %s\n", s.charAt(0), s.charAt(1), s.charAt(2));
//
//        int i4 = s.charAt(0);
//        int i5 = s.charAt(1);
//        int i6 = s.charAt(2);
//
//        System.out.printf("%d %d %d\n", i4, i5, i6);

        System.out.println("Digite uma string: ");
        String s1 = new Scanner(System.in).nextLine();

        for (int i = 0; i < s1.length(); i++) {
            System.out.printf("%c", s1.charAt(i));

        }

    }
}
