//import scanner
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class BlackjackOne {
    public static void main(String[]args){
        //store card values doing math.random
        int card1 = (int)(Math.random() * 13 + 1); // 13 cards in a deck
        int card2 = (int)(Math.random() * 13 + 1);
        int card3 = (int)(Math.random() * 13 + 1);
        //assign each number to a card, for card 1
        if (card1 == 1)
        {
            System.out.println("You have an Ace, it is worth 1 point");
        } 
        else if (card1 == 2)
        {
            System.out.println("You have a 2, it is worth 2 points");
        } 
        else if (card1 == 3)
        {
            System.out.println("You have a 3, it is worth 3 points");
        }
        else if (card1 == 4)
        {
            System.out.println("You have a 4, it is worth 4 points");
        }
        else if (card1 == 5)
        {
            System.out.println("You have a 5, it is worth 5 points");
        }
        else if (card1 == 6)
        {
            System.out.println("You have a 6, it is worth 6 points");
        }
        else if (card1 == 7)
        {
            System.out.println("You have a 7, it is worth 7 points");
        }
        else if (card1 == 8)
        {
            System.out.println("You have a 8, it is worth 8 points");
        }
        else if (card1 == 9)
        {
            System.out.println("You have a 9, it is worth 9 points");
        }
        else if (card1 == 10)
        {
            System.out.println("You have a 10, it is worth 10 points");
        }  
        else if (card1 == 11)
        {
            System.out.println("You have a Jack, it is worth 10 points");
        } 
        else if (card1 == 12)
        {
            System.out.println("You have a Queen, it is worth 10 points");
        }
        else if (card1 == 13)
        {
            System.out.println("You have a King, it is worth 10 points");
        }
        else 
        {
            System.out.println("This should never happen, your code is janky");
        }  
        //repeat for card 2
        if (card2 == 1)
        {
            System.out.println("You have an Ace, it is worth 1 point");
        } 
        else if (card2 == 2)
        {
            System.out.println("You have a 2, it is worth 2 points");
        } 
        else if (card2 == 3)
        {
            System.out.println("You have a 3, it is worth 3 points");
        }
        else if (card2 == 4)
        {
            System.out.println("You have a 4, it is worth 4 points");
        }
        else if (card2 == 5)
        {
            System.out.println("You have a 5, it is worth 5 points");
        }
        else if (card2 == 6)
        {
            System.out.println("You have a 6, it is worth 6 points");
        }
        else if (card2 == 7)
        {
            System.out.println("You have a 7, it is worth 7 points");
        }
        else if (card2 == 8)
        {
            System.out.println("You have a 8, it is worth 8 points");
        }
        else if (card2 == 9)
        {
            System.out.println("You have a 9, it is worth 9 points");
        }
        else if (card2 == 10)
        {
            System.out.println("You have a 10, it is worth 10 points");
        }  
        else if (card2 == 11)
        {
            System.out.println("You have a Jack, it is worth 10 points");
        } 
        else if (card2 == 12)
        {
            System.out.println("You have a Queen, it is worth 10 points");
        }
        else if (card2 == 13)
        {
            System.out.println("You have a King, it is worth 10 points");
        }
        else 
        {
            System.out.println("This should never happen, your code is janky");
        }     
        //if greater than 10, set 10 ten
        if (card1 > 10) //setting facecards to a value of 10 for cards 1 and 2
        {
            card1 = 10;
        }
        if (card2 > 10)
        {
            card2 = 10;
        }
        System.out.println("Your total is " + (card1 + card2));//printing out total of 2 cards
        //set up scanner,ask question, and scan in hit or stay
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to hit or stay (enter hit OR stay)");
        String hitOrStay = scan.nextInt();
        scan.close();
        //if statement for hit or stay
        if (hitOrStay.equals("hit"))
        {
            System.out.println("Your chose to hit");
            if (card3 == 1)//if statement, pirated from my earlier code
            {
                System.out.println("You have an Ace, it is worth 1 point");
            } 
            else if (card3 == 2)
            {
                System.out.println("You have a 2, it is worth 2 points");
            } 
            else if (card3 == 3)
            {
                System.out.println("You have a 3, it is worth 3 points");
            }
            else if (card3 == 4)
            {
                System.out.println("You have a 4, it is worth 4 points");
            }
            else if (card3 == 5)
            {
                System.out.println("You have a 5, it is worth 5 points");
            }
            else if (card3 == 6)
            {
                System.out.println("You have a 6, it is worth 6 points");
            }
            else if (card3 == 7)
            {
                System.out.println("You have a 7, it is worth 7 points");
            }
            else if (card3 == 8)
            {
                System.out.println("You have a 8, it is worth 8 points");
            }
            else if (card3 == 9)
            {
                System.out.println("You have a 9, it is worth 9 points");
            }
            else if (card3 == 10)
            {
                System.out.println("You have a 10, it is worth 10 points");
            }  
            else if (card3 == 11)
            {
                System.out.println("You have a Jack, it is worth 10 points");
            } 
            else if (card3 == 12)
            {
                System.out.println("You have a Queen, it is worth 10 points");
            }
            else if (card3 == 13)
            {
                System.out.println("You have a King, it is worth 10 points");
            }
            else 
            {
            System.out.println("This should never happen, your code is janky");
            }
            //code for setting the face cards to 10, also seied from earlier code
            if (card3 > 10) //setting facecards to a value of 10 for cards 1 and 2
            {
                card3 = 10;
            }
            //if statement to test if user busted, test against number 20
            if (card1 + card2 + card3 <= 20)
            {
                System.out.println("Your total is " + (card1 + card2 + card3));
            } 
            else if (card1 + card2 + card3 == 21)
            {
                System.out.println("BLACKJACK BABY!");
            }
            else
            {
                System.out.println("Your total is " + (card1 + card2+ card3) + ", you busted!");
            }
        }//this thing isnt working AAAAAAAAAAAAAA  
        else if (hitOrStay.equals("stay"))//code for if user inputs stay
        {
            System.out.println("You chose to stay, your total is " + (card1 + card2));
        }
        else
        {
            System.out.println("Invalid Input");
        }
        }
    } 
}
