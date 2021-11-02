//import scanner
import java.util.Scanner;
public class SeventeenMoreOrLess {
    public static void main(String[] args)
    {
        //declare scanner, ask questions, store answers
        Scanner scan = new Scanner(System.in);
        System.out.println("input your first integer");
        int int1 = scan.nextInt();
        System.out.println("input your second integer");
        int int2 = scan.nextInt();
        System.out.println("input your third integer");
        int int3 = scan.nextInt();
        scan.close();
        //begin the if , use or statements to comaper all 3 integers in both directions (6 total)
        if ((int1 + 17 <= int2)|| (int1 + 17 <= int3) || (int2 + 17 <= int3) || (int3 + 17 <= int1) || (int3 + 17 <= int2) || (int2 + 17 <= int1)) // this line looks overly long, but its the same thing repeated 6 times inside or statements
        {    
            System.out.println("One of the numbers is 17 more or less than the others");
        }
        else
        {
            System.out.println("None of the numbers are 17 more or less than the others");
        }
    }   
}
