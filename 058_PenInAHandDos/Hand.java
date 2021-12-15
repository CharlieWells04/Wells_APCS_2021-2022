public class Hand {
    public static void main(String[] args)
    {
        Pen p = new Pen();//creates pen in hand
        p.inkRemaining(12);
        p.capOff(true);//utilizes boolean hasCap
        p.clickedOut(false);
        p.wordsToWrite("Hello");
    }
}
