package cs50;

public class swap {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.printf("x: %d, y: %d\n", x, y);
        troca(x, y);
        System.out.printf("x: %d, y: %d\n", x, y);
    }
    //O que esta função devolve é um cópia de x e y
    private static void troca(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
        System.out.printf("Parametro x: %d\n", x);
        System.out.printf("Parametro y: %d\n", y);
    }
}
