public class Card {
    //for this, i will use numbers for facecards, and then print them out differently
    //class variables
    private String suit;
    private int value;
    public Card(String suit, int value)//creating constructor
    {
        this.suit = suit;
        this.value = value;
    }
    public String getSuit()//getter
    {
        return suit;
    }
    public int getValue()//getter
    {
        return value;
    }
    //card printer method
    public void printCard()
    {
      if(getValue() == 1)
            {
                System.out.print("Ace of ");
            }
            else if(getValue() == 11)
            {
                System.out.print("Jack of ");
            }
            else if(getValue() == 12)
            {
                System.out.print("Ace of ");
            }
            else if(getValue() == 13)
            {
                System.out.print("King of ");
            }
            else
            {
                System.out.print(getValue() + " of ");
            }
            System.out.println(getSuit());//statement that prints out suit   
    }
    //empty main method
    public static void main(String[] args){}

    //card prinbter method

}
