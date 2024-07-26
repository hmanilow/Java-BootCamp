import java.util.Scanner;

public class Program
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        if (!input.hasNextInt())
        {
            input.close();
            System.err.println("IllegalArgument");
            System.exit(-1);
        }

        int i = 2;
        int val = input.nextInt();

        if (val < 0 || val == 0 || val == 1)
        {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }

        for (; i * i <= val; i++)
        {
            if (val % i == 0)
            {
                System.out.printf("%b %d\n", false, i - 1);
                input.close();
                System.exit(0);
            }
        }

        System.out.printf("%b %d\n", true, i - 1);
        input.close();
    }
}