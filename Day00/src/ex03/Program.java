import java.util.Scanner;

public class Program
{

    public static int minOfMarks(Scanner input)
    {
        int min = 9;
        int mark;

        for (int i = 0; i < 5; i++)
        {
            if (!input.hasNextInt())
            {
                System.exit(1);
            }
            mark = input.nextInt();
            if (min > mark)
            {
                min = mark;
            }
        }
        return min;
    }

    public static void grafRes(long res, int weeks)
    {
        if (res == 0)
        {
            return ;
        } else
        {
            long tmp;
            grafRes(res / 10, weeks - 1);
            tmp = res % 10;
            System.out.printf("Week %d ", weeks - 1);
            for (int i = 0; i < tmp; i++)
            {
                System.out.print("=");
            }
            System.out.println(">");
        }
    }

    public static void main(String[] args)
    {
        long res = 0;
        int weeks = 1;
        int marks;
        String weekStr;
        Scanner input = new Scanner(System.in);

        while (true)
        {
            if (!input.hasNext())
            {
                System.exit(1);
            }
            weekStr = input.next();
            if (weekStr.equals("42") == true || weeks > 18)
            {
                break;
            } else
            {
                if (!input.hasNextInt())
                {
                    System.exit(1);
                }
                marks = input.nextInt();
                //System.out.println(marks);
                //System.out.println(weeks);
                if (marks == weeks)
                {
                    res = res * 10 + minOfMarks(input);
                } else
                {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
                weeks++;
            }
        }
        grafRes(res, weeks);
        input.close();
    }
}