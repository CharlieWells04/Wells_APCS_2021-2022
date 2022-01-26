public class Table {
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        //for loop to print out all the cards
        for(int i = 0; i < deck.getDeck().length; i++)
        {
            if (deck.getDeck() == 1)
            {
                System.out.println("1");
            }
        }
    }

    
}
