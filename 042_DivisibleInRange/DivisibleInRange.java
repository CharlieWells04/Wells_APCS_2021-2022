import java.util.Scanner;
public class DivisibleInRange {
    public static void main(String[] args)
    {
        //delcare scanner, ask questions store variables
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like the range to start with");
        int rangeStart = scan.nextInt();
        System.out.println("What number would you like the range to end at");
        int rangeEnd = scan.nextInt();
        System.out.println("What number would you like to divide by");
        int divider = scan.nextInt();
        //start of loop, check if numbers in range are divisible
        for (int i = rangeStart; i <= rangeEnd; i++)
        {
            if (i % divider == 0)// only print if mudlo is 0
            {
                System.out.println(i);
            }
        }
    }
}

/*
1/1 - Compiles
1/1 - Content
-Boo. You didn't give me a count of the number of divisible numbers in that range.
1/1 - Formatting
1/1 - Comments
*/