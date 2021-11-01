//import scanner
import java.util.Scanner;
public class IntegerSelection {
    public static void main(String[] args)
    {
        //declare scanner, ask questions, store variables
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your first number");
        int int1 = scan.nextInt();
        System.out.println("Input your second number");
        int int2 = scan.nextInt();
        scan.close();
        //if statement to print the larger number or 0 if the same
        if (int1 > int2)
        {
            System.out.println(int1);
        }
        else if (int2 > int1)
        {
            System.out.println(int2);
        }
        else
        {
            System.out.println("0");
        }
        //if statement for modulo, if qualifications met, also print smaller value
        if (int1 % 8 == int2 % 8)
        {
            if (int1 < int2)
            {
                System.out.println(int1);
            }
            else
            {
                System.out.println(int2);
            }

        }

    }
    
}
