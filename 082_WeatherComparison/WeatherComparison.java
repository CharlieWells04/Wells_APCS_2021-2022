public class WeatherComparison {
    public static void main(String[] args)
    {
        WeatherComparison wb = new WeatherComparison();
        int[][] tempsToUse = wb.getTemps();
        wb.printTotalAverageTemps(tempsToUse);
        wb.printWeeklyAverageTemps(tempsToUse);
        wb.printDailyAverageTemps(tempsToUse);
    }
    public int[][] getTemps()
    {
        int[][] temps = {//making the 2d array
            {0, 01, 02, 03, 04, 05, 06 ,07},
            {2015, 63, 54, 35, 43, 44, 40, 40},
            {2016, 37, 32, 44, 34, 34, 38, 38},
            {2017, 52, 50, 49, 53, 47, 46, 48},
            {2018, 21, 29, 28, 21, 29, 19, 22},
            {2019, 37, 39, 40, 38, 42, 48, 56},
            {2020, 45, 53, 30, 32, 43, 50, 55}
        };
        return temps;
    }
    public void printTotalAverageTemps(int[][] arr)
    {
        int counter = 0;
        for (int i = 1; i < arr.length; i++) { //outer for loop, runs the inner for loop, starts at as not to incudle date
            for (int j = 1; j < arr[i].length; j++) { //inner for loop
               counter += arr[i][j];
            }
        }
        System.out.println("Total Average Temps: " + (counter) / 42);
    }
    public void printWeeklyAverageTemps(int[][] arr)
    {
        System.out.println("Average Temps Per Year");
        int counter = 0;
        for (int i = 1; i < arr.length; i++) { //outer for loop, runs the inner for loop
            System.out.print(arr[i][0] + ": ");
            for (int j = 1; j < arr[i].length; j++) { //inner for loop
               counter += arr[i][j];//adds thru the week
            }
            System.out.println(counter/7);//pritns the average day
            counter = 0;
        }
    }
    public void printDailyAverageTemps(int[][] arr)
    {
        System.out.println("Average temps per day");
        int counter = 0;
        for (int i = 1; i < arr.length; i++) { //outer for loop, runs the inner for loop
            System.out.print(arr[0][i] + " April: ");//print out the date 
            for (int j = 0; j < arr[i].length - 1; j++) { //inner for loop
               counter += arr[j][i];
            }
            System.out.println((counter) / 6);
            counter = 0;
        }
        
    }
}
