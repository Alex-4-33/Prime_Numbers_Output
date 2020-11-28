import java.util.Scanner;

public class PrimeNumsAnyInterval {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int down_defined = -1;
        do {
            System.out.println("Define a lower boundary");
            down_defined = in.nextInt();
            }
        while (down_defined < 0);
        int up_defined = 0;
        do {
            System.out.println("Define an upper boundary");
            up_defined = in.nextInt();
            }
        while (up_defined < down_defined);
        PrimeNumsOutput (down_defined, up_defined);
    }

    public static void PrimeNumsOutput (int down, int up)
    {
        for (int i = down; i < up; i++) {
            boolean tmp = false;
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i%j == 0)
                {
                    tmp = false;
                    break;
                }
                else tmp = true;
            }
            if (tmp == true)
                System.out.println(i);
        }
    }
}
