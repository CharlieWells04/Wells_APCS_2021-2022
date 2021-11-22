//import scanner
import java.util.Scanner;
public class RPSOne {
    public static void main(String[] args)
    {
        //declare scanner, ask quetion store variable
        Scanner scan = new Scanner(System.in);
        System.out.println("Input rock, paper or scissors (enter in lowercase)");
        String input = scan.nextLine();
        scan.close();
        //computer roll, 1 is rock, 2 is paper, 3 is scissors
        int comp = (int)(Math.random() * 3 + 1);
        //if statement, start with human input, then compare to computer roll
        if (input.equals("rock")) //if statement rock
        {
            if (comp == 1)
            {
                System.out.println("The compter said rock, You Tied");
            }
            if (comp == 2)
            {
                System.out.println("The comuter said paper, You Lose!");
            }
            if (comp == 3)
            {
                System.out.println("The computer said scissors, You win!");
            }
        }
        else if (input.equals("paper")) // if statement for paper
        {
            if (comp == 2)
            {
                System.out.println("The compter said paper, You Tied");
            }
            if (comp == 3)
            {
                System.out.println("The comuter said scissors, You Lose!");
            }
            if (comp == 1)
            {
                System.out.println("The computer said rock, You win!");
            }
        }
        else if (input.equals("scissors")) // if statement for input scissors
        {
            if (comp == 3)
            {
                System.out.println("The compter said scissors, You Tied");
            }
            if (comp == 1)
            {
                System.out.println("The comuter said rock, You Lose!");
            }
            if (comp == 2)
            {
                System.out.println("The computer said paper, You win!");
            }
        }
        else // for when input is wrong
        {
            System.out.println("Invalid input");
        }
    }    
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/