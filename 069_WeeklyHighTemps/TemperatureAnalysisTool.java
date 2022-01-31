public class TemperatureAnalysisTool {
    //adding in weekly high temps
    WeeklyHighTemps w1 = new WeeklyHighTemps();
    //making the new arrays for use
    String[] dates = w1.getDate();
    int[] highs = w1.getHighs();
    int[] lows = w1.getLows();
    String[] patterns = w1.getPatterns();
    public int temperatureAverage()
    {
        int count = 0;
        for(int i = 0; i < 7; i++) 
        {
            count = count + highs[i] + lows[i];
        }
        return count/14;
    }
    
    public static void main(String[] args){}
    }
}
