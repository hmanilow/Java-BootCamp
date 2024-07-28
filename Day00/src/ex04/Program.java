import java.util.Scanner;

class Program
{
    public static void main(String[] args)
    {
        int i = 0;
        int j;
        Scanner scanner =  new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();
        char str_char[] = str.toCharArray();
        int cod[] = new int[65536];
        int top[] = new int[10];
        int top_char[] = new int[10];
        int top_sched[] = new int[10];

        if (len == 0)
        {
            System.out.println("Empty line");
            System.exit(0);
        }

        while(i < 65536)
        {
            cod[i] = 0;
            i++;
        }

        i = 0;
        while(i < 10)
        {
            top[i] = 0;
            top_char[i] = 0;
            i++;
        }

        i = 0;
        while(i < len)
        {
            cod[str_char[i]]++;
            i++;
        }

        j = 0;
        while (j < 10)
        {
            i = 0;
            while (i < 65536)
            {
                if (top[j] < cod[i])
                {
                    top[j] = cod[i];
                    top_char[j] = i;
                }
                i++;
            }
            cod[top_char[j]] = -1;
            top_sched[j] = 10 * top[j] / top[0];
            j++;
        }

        i = 0;

        while(i < 11)
        {
            j = 0;
            while (j < 10)
            {
                System.out.print(" ");
                if (top_sched[j] + 1 == (11 - i))
                {
                    if (top[j] < 10)
                        System.out.print(" ");
                    System.out.print(top[j]);
                }
                else if (top_sched[j] > (10 - i))
                    System.out.print(" #");
                else
                    System.out.print("  ");
                j++;
            }
            System.out.println();
            i++;
        }
        j = 0;
        while (j < 10)
        {
            System.out.print("  ");
            System.out.print((char) top_char[j]);

            j++;
        }
        System.out.println();

    }
}