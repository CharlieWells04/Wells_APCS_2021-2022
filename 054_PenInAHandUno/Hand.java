public class Hand {
    public static void main(String[] args)
    {
        Pen p = new Pen();//creates pen in hand
        p.inkRemaining();
        p.capOff();
        p.clickedOut();
        p.wordsToWrite("Hello");
    }
}
