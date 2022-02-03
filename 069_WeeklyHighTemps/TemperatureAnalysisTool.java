import javax.lang.model.util.ElementScanner14;

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
    public String patternAverage()
    {
        int cloudys = 0;///creating vribales as trackers for the amount of times a pattern occurs
        int partlyCloudys = 0;
        int mostlyCloudys = 0;
        for(int i = 0; i < patterns.length; i++)//iterates thru and adds them up
        {
            if (patterns[i].equals("cloudy"))
            {
            cloudys++;
            }
            else if (patterns[i].equals("partly cloudy"))
            {
            partlyCloudys++;
            }
            else 
            {
            mostlyCloudys++;
            }
        }
        if(cloudys > mostlyCloudys || cloudys > partlyCloudys)//making an if statement to return which one had the most
        {
            return "Cloudy";
        }
        else if(partlyCloudys > mostlyCloudys || cloudys < partlyCloudys)
        {
            return "partly cloudy";
        }
        else if(partlyCloudys < mostlyCloudys || cloudys < mostlyCloudys)
        {
            return "mostly cloudy";
        }
        else
        {
            return "a tie ";
        }

    }
    public void printWeatherForeCast()
    {
        int high = 33;//addign variables
        int low = 12;
        int average = (high+low) / 2;
        String pattern = "Rainy";
        //printing
        System.out.println("The high is " + high + ", the low is " + low + "the average is " + average + "and is is " + pattern );

    }  
    public static void main(String[] args){
    }
}

