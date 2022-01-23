package cs50.pset2;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String s = scanner.nextLine();
        int length = s.length();
        char[] chars = s.toCharArray();

        for (int i = 0; i < length; i++) {
            System.out.printf("%c\n", chars[i]);
        }
    }
}
