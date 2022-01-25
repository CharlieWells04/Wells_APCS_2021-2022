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
    //empty main method
    public static void main(String[] args){}
}
