import java.util.Scanner;

public class Program
{
    public static int ft_sum(int val)
    {
        int res = 0;

        while (val > 0)
        {
            res += val % 10;
            val /= 10;
        }
        return res;
    }

    public static boolean ft_isPrime(int val)
    {
        int i = 2;

        for (; i * i < val; i++)
        {
            if (val % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int search;
        int coffee = 0;

        while (true)
        {
            if (!input.hasNextInt())
            {
                System.exit(1);
            }
            search = input.nextInt();
            if (search == 42)
            {
                break;
            }
            if (ft_isPrime(ft_sum(search)))
            {
                coffee++;
            }
        }
        System.out.printf("Count of coffee-request - %d\n", coffee);
        input.close();
    }
}
