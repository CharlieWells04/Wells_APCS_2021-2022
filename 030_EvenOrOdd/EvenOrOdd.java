//import scanner
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args)
    {
        //declare scanner
        Scanner scan = new Scanner(System.in);
        //ask question nd store variable
        System.out.println("Enter you integer");
        int theNumber = scan.nextInt();
        scan.close();
        //use remaider when divided by 2
        int theRemainder = theNumber % 2;
        //if satement, use remainder, if 0 is even
        if (theRemainder == 0)
        {
            System.out.println("Your number is even");
        }
        else
        {
            System.out.println("Your number is odd");
        }
    }   
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/