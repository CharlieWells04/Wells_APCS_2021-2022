public class ScrabbleTile {
    public String letter;
    public int points;
    public ScrabbleTile(String letter, int points)
    {
        this.letter = letter;
        this.points = points;
    }
    public static void main(String[] args){}
    //making getters for letters and points
    public int getPoints()
    {
        return points;
    }
    public String getLetter()
    {
        return letter;
    }
    
}
