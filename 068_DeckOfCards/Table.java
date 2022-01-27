public class Table {
    public static void main(String[] args)
    {
        Deck d1 = new Deck();
        //maikng a new card array
        Card[] cards = d1.getDeck();

        //for loop to print out all the cards
        for(int i = 0; i < 52; i++)
        {
            //if statement, prints out correct value
            if(cards[i].getValue() == 1)
            {
                System.out.print("Ace of ");
            }
            else if(cards[i].getValue() == 11)
            {
                System.out.print("Jack of ");
            }
            else if(cards[i].getValue() == 12)
            {
                System.out.print("Ace of ");
            }
            else if(cards[i].getValue() == 13)
            {
                System.out.print("King of ");
            }
            else
            {
                System.out.print(cards[i].getValue() + " of ");
            }
            System.out.println(cards[i].getSuit());//statement that prints out suit
        }
    }

    
}
