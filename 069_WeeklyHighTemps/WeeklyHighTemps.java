public class WeeklyHighTemps {
    //arrays for usage
    private String[] date = {"2/1/22", "2/2/22", "2/3/22", "2/4/22", "2/5/22", "2/6/22", "2/7/22"};
    private int[] highs = {34, 9, 6, 16, 26, 22, 25};
    private int[] lows = {-2, -10, -7, -2, 18, 5,17};
    private String[] patterns = {"cloudy", "mostly cloudy", "partly cloudy", "mainly cloudy", "partly cloudy"};
    //making getters
    public String[] getDate()
    {
        return date;
    }
    public String[] getPatterns()
    {
        return patterns;
    }
    public int[] getHighs()
    {
        return highs;
    }
    public int[] getLows()
    {
        return lows;
    }
    public static void main(String[] args){}
}
