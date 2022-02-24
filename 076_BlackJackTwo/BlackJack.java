import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;//dont know what this is 
public class BlackJack
{
    //making class arrays
    ArrayList<Card> fullDeck = new ArrayList<>();
    ArrayList<Card> playerDeck = new ArrayList<>();
    ArrayList<Card> dealerDeck = new ArrayList<>();
    public BlackJack(Card[] fullDeckArray)
    {
        Collections.addAll(fullDeck, fullDeckArray);
    }
    public static void main(String[] args)
    {
    }
    public int HandCounter(ArrayList<Card> hand)
    {
        int counter = 0;//vairables, for use later
        int numOfAces= 0;
        //for loop, runs thru hand and counts them up
        for (int i = 0; i < hand.size(); i++)
        {
            
            if (hand.get(i).getValue() >= 2 && hand.get(i).getValue() <= 9)
            {
                counter = counter + hand.get(i).getValue();
            }
            else if(hand.get(i).getValue() >= 10)
            {
                counter = counter + 10;
            }
            else
            {
                numOfAces = numOfAces + 1;
            }   
        }
        //running a while loop for checking aces when more than one ace is present
            while(numOfAces > 0)
            {
                //if statement, used to check ace values and choose if aces are 1 or 11
                if (counter + (11 * numOfAces) <= (21 - (numOfAces - (1 * numOfAces))))//this logic is tricky, you have to consider if multiple aces are involved
                {
                    counter = counter + 11;
                    numOfAces--;
                }
                else
                {
                    counter = counter + 1;
                    numOfAces--;
                }
            }
            //returning counter
            return counter;
    }
    //making the initial deal function for player
    public void playerInitialDeal()
    {
        //for loop repeats twice
        for(int i = 0; i <= 1; i++)
        {
        int rando = (int)(Math.random() * fullDeck.size());
        Card tempCard = new Card(fullDeck.get(rando).getSuit(), fullDeck.get(rando).getValue());
        playerDeck.add(fullDeck.get(rando));
        tempCard.printCard();
        fullDeck.remove(rando);
        }
    }
    //making the dealer initial deal method, very similar to the player initial deal method
    public void dealerInitialDeal()
    {
        //for loop repeats twice
        for(int i = 0; i <= 1; i++)
        {
        int rando = (int)(Math.random() * fullDeck.size());
        Card tempCard = new Card(fullDeck.get(rando).getSuit(), fullDeck.get(rando).getValue());//creates a card to printoff
        
        dealerDeck.add(fullDeck.get(rando));
        //if statement so only prints off 1st card
        if (i == 0)
        {
            System.out.print("The dealers face up card is a ");//prints off dealers face up card
            tempCard.printCard();
        }
        fullDeck.remove(rando);
        }
    }
    //making the hit method
    public void Hit(ArrayList<Card> cardDeckToHit)
    {
        int rando = (int)(Math.random() * fullDeck.size());//copied this logic from my initial deal code
        Card tempCard = new Card(fullDeck.get(rando).getSuit(), fullDeck.get(rando).getValue());
        tempCard.printCard();
        cardDeckToHit.add(fullDeck.get(rando));
        fullDeck.remove(rando);
    }
    //making method to check if you have broken
    public boolean brokeCheck(ArrayList<Card> handtoCheck)
    {
        int handCount = HandCounter(handtoCheck);
        if(handCount > 21)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //making method to check if you have blackjack
    public boolean blackjackCheck(ArrayList<Card> handtoCheck)
    {
        int handCount = HandCounter(handtoCheck);
        if(handCount == 21)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //making the method that runs the hand
    public boolean runHand()
    {
        playerInitialDeal();//deals initial hands
        dealerInitialDeal();
        if (blackjackCheck(playerDeck) == true)
        {
            System.out.println("You win! Yay");
            return false;
        }
        else
        {
            
            Scanner scan = new Scanner(System.in);
            
            //making if statemnt for hit or stay
            //while loop for mistype purposes
            while(true)
            {
                System.out.println(HandCounter(playerDeck) + " is the value of your cards, would you like to hit or stay (reply with H or S)");
                String HorS = scan.nextLine();
                if (HorS.equals("H"))
                {
                    Hit(playerDeck);
                
                    //if statement, chcks if player broke or not
                    if (brokeCheck(playerDeck) == true)
                    {
                        System.out.println("You broke, you lose");
                        return false;
                    }
                }
                else if(HorS.equals("S"))
                {
                    System.out.println("You chose to stay");
                    break;
                }
                else
                {
                    System.out.println("Invalid input, try again");
                }
            }
            //closing scanner
            scan.close();
            System.out.println("The dealers value is " + HandCounter(dealerDeck));
            //making the dealer functionality
            while(true)
            {
                int dealerHandCount = HandCounter(dealerDeck);
                if (dealerHandCount > 21)
                {
                    System.out.println("The dealer busted, you Win!");
                    break;
                }
                else if (dealerHandCount >= 17)
                {
                    System.out.println("The dealer stays and has " + dealerHandCount);
                    if(dealerHandCount >= HandCounter(playerDeck))
                    {
                        System.out.println("The dealer wins");
                    }
                    else
                    {
                        System.out.println("You Win!");
                    }
                break;
                }
                else
                {
                    System.out.println("The dealer hits");//hits for the dealer
                    Hit(dealerDeck);
                    
                }
            }
        }
        return true;
    }
    
}