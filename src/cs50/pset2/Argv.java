package cs50.pset2;

public class Argv {
    public static void main(String[] args)
    {
        if (args.length != 0)
        {
            System.out.printf("Hello, %s", args[0]);
        }
        else
        {
            System.out.println("Hello, World!");
        }

    }
}
