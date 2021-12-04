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
    public static void zodiac(int year)//function to figr=ure out zodiac
    {
        if (year % 12 == 0)
        {
            System.out.println("You were born in the year of the monkey");//use modulo to find out year, 12 totoal year it rotates onl, repeat 12
        }
        else if (year % 12 == 1)
        {
            System.out.println("You were born in the year of the Rooster");
        }
        else if (year % 12 == 2)
        {
            System.out.println("You were born in the year of the Dog");
        }
        else if (year % 12 == 3)
        {
            System.out.println("You were born in the year of the Pig");
        }
        else if (year % 12 == 4)
        {
            System.out.println("You were born in the year of the Rat");
        }
        else if (year % 12 == 5)
        {
            System.out.println("You were born in the year of the Ox");
        }
        else if (year % 12 == 6)
        {
            System.out.println("You were born in the year of the Tiger");
        }
        else if (year % 12 == 7)
        {
            System.out.println("You were born in the year of the Rabbit");
        }
        else if (year % 12 == 8)
        {
            System.out.println("You were born in the year of the Dragon");
        }
        else if (year % 12 == 9)
        {
            System.out.println("You were born in the year of the Snake");
        }
        else if (year % 12 == 10)
        {
            System.out.println("You were born in the year of the Horse");
        }
        else if (year % 12 == 11)
        {
            System.out.println("You were born in the year of the Sheep");
        }
    }
    
}
