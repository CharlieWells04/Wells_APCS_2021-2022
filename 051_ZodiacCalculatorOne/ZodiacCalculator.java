import java.util.Scanner;
public class ZodiacCalculator {
    public static void main(String [] args)
    {
        //declare scanner, ask question, store variable
        Scanner scan = new Scanner(System.in);
        System.out.println("What year were you born in?");
        int yearOfBirth = scan.nextInt();
        scan.close();
        zodiac(yearOfBirth);
    }
    public static void zodiac(int year)
    {
        if (year % 12 == 0)
        {
            System.out.println("You were born in the year of the monkey");
        }
        else if (year % 12 == 1)
        {
            System.out.println("You were born in the year of the Rooster");
        }
    }
    
}
