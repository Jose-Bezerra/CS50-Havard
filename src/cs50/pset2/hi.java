package cs50.pset2;

public class hi {
    public static void main(String[] args) {
        char c1 = 'H';
        char c2 = 'I';
        char c3 = '!';
        String s = "HI!";

        System.out.printf("%c%c%c\n", c1, c2, c3);
        System.out.printf("%d %d %d\n", (int)     c1, (int) c2, (int) c3);
        System.out.printf("%c%c%c\n", s.charAt(0), s.charAt(1), s.charAt(2));
    }
}
