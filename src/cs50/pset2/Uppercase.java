package cs50.pset2;

import java.util.Scanner;

public class Uppercase
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("After: ");
        String s = scanner.nextLine();
        int n = s.length();

        //Reinventing the wheel
        for (int i = 0; i < n; i++)
        {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                System.out.printf("%c", s.charAt(i) - 32);
            }
            else
            {
                System.out.printf("%c\n", s.charAt(i));
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%c", s.toUpperCase().charAt(i));
        }
    }
}
