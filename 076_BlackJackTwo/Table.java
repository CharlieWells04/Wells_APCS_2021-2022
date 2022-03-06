import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Table
{
    public static void main(String[] args)
    {
        while(true)//loop allows iteration and playing multiple times
        {
            Deck deck = new Deck();
            Card[] cardDeck = deck.getDeck();
            Table table = new Table();
            BlackJack blackjack = new BlackJack(cardDeck);
            blackjack.runHand();//method to run the hadn
            //adding in scanner
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Would you like to play again (input \"y\" or \"n\")");
            String YorN = scan2.nextLine();
            //if statement, checks if user wants to play again
            if(YorN.equals("n"))
            {
                System.out.println("Game ended");
                break;
            }
            else if (YorN.equals("y"))
            {
                System.out.println("Playing again");
            }
            else
            {
                System.out.println("Input not detected, playing again");
            }
            
        }
    }
}

/*
1/1 - Compiles
1/1 - Content
-So close, but if I hit enter instead of yes or no once one game completes, it'll crash. Very good though.
1/1 - Formatting
1/1 - Comments
*/