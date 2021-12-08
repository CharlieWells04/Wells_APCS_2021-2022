public class Pen {
    String colorOfInk = "Blue";//decalring class variables
    String colorOfPen = "Black";
    boolean hasCap = true;
    int inkRemaining = 4;
    public static void main(String[] args)
    {
        //empty
    }
    public void inkRemaining()
    {
        System.out.println("Your pen has " + inkRemaining + " units of ink left");//print out statemnt uding int
    }
    public void capOff()
    {
        //if statement, checks if pen has cap or no
        if (hasCap == true)
        {
            System.out.println("You take the cap off, dont lose it!");
        }
        else
        {
            System.out.println("Your pen has no cap to take of...");
        }
    }
    public void clickedOut()
    {
        //if statement, checks if pen actually has clicky function
        if (hasCap == false)
        {
            System.out.println("Click");//clicks
        }
        else
        {
            System.out.println("You pen cant click cause it doesnt have the clicky thing");
        }
    }
    public void wordsToWrite(String words)//has a constructor
    {
        System.out.println(words);//prints words into console
    }

    
}
