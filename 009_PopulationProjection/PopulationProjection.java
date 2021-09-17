public class PopulationProjection {
    public static void main(String[] args)
    {
        //initial variables
        int secondsPerBirth = 7;
        int secondsPerDeath = 13;
        int secondsPerImmigrant = 45;
        int currentPop = 312032486;
        // per day calculations

        int secondsPerDay = 86400;
        double birthsPerDay = (secondsPerDay / secondsPerBirth);
        double deathsPerDay = (secondsPerDay / secondsPerDeath);
        double immigrantsPerDay = (secondsPerDay / secondsPerImmigrant);
        //per year calcuations
        int daysPerYear = 365;
        double birthsPerYear = (daysPerYear * birthsPerDay);
        double immigrantsPerYear = (daysPerYear * immigrantsPerDay);
        double deathsPerYear = (daysPerYear * deathsPerDay);
        int amountOfYears = 1;
        //final calculations
        double increasePerYear = (birthsPerYear + immigrantsPerYear - deathsPerYear);
        double finalPop = (currentPop + amountOfYears * increasePerYear);
        
        //print statements
        amountOfYears = 1;
        finalPop = (currentPop + amountOfYears * increasePerYear);
        System.out.println("After year " + amountOfYears + ", the will be " + (int)(finalPop) + " people.");
        amountOfYears = 2;
        finalPop = (currentPop + amountOfYears * increasePerYear);
        System.out.println("After year " + amountOfYears + ", the will be " + (int)(finalPop) + " people.");
        amountOfYears = 3;
        finalPop = (currentPop + amountOfYears * increasePerYear);
        System.out.println("After year " + amountOfYears + ", the will be " + (int)(finalPop) + " people.");
        amountOfYears = 4;
        finalPop = (currentPop + amountOfYears * increasePerYear);
        System.out.println("After year " + amountOfYears + ", the will be " + (int)(finalPop) + " people.");
        amountOfYears = 5;
        finalPop = (currentPop + amountOfYears * increasePerYear);
        System.out.println("After year " + amountOfYears + ", the will be " + (int)(finalPop) + " people.");






    }
    
}
