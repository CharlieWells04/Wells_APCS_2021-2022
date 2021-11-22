//import scanner
import java.util.Scanner;
public class CommonDigit{
    public static void main(String[] args){
        //declare scanner, ask questions, store variable
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you first integer (between 25 and 75)");
        int int1 = scan.nextInt();
        System.out.println("Enter you second integer (between 25 and 75)");
        int int2 = scan.nextInt();
        scan.close();
        //turn ints into strings
        String int1s = Integer.toString(int1);
        String int2s = Integer.toString(int2);
        //seperate new strings into 2 substrings
        String int1_1 = int1s.substring(0, 1);
        String int1_2 = int1s.substring(1);
        String int2_1 = int2s.substring(0, 1);
        String int2_2 = int2s.substring(1);
        //is statement to check if inputs are valid (25 to 75) bor bith int1 and int2
        if ((int1 >= 25 && int1 <=75) && (int2 >= 25 && int2 <=75))
        {
            //start if statement to detirmine whether either of substrings are the same, use .equals as they are strings
            if (int1_1.equals(int2_1) || int1_1.equals(int2_2) || int1_2.equals(int2_1) || int1_2.equals(int2_2))
            {
                System.out.println("There is a common digit between the numbers");
            }
            else//else statement that prints that no common digits
            {
                System.out.println("There are no common digits between the numbers");
            }
        }
        else//statement if inputs are invalid
        {
            System.out.println("Invaild input(s), try again ");
        }
    }
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/