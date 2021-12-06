import java.util.Scanner;
public class DateTranslator {
    public static void main(String[] args)
    {
        //inital booleans and variables, for use later
        int day;
        int month;
        int year;
        boolean isAmerican;
        String entry;
        //declare scanner, ask question, store variable
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the day of your date (enter as number)");
        day = scan.nextInt();
        System.out.println("What is the month of your date (enter as a number)");
        month = scan.nextInt();
        System.out.println("What is the year of your date (enter as a number");
        year = scan.nextInt();
        System.out.println("Would you like your date printed in American or European style (enter A or E)");
        scan.nextLine();
        entry = scan.nextLine();
        scan.close();
        //if statement, chencks user input and runs correct method
        if (entry.equals("E"))
        {
            printEuropean(day, month, year);
        }
        else if (entry.equals("A"))
        {
            printAmerican(day, month, year);
        }
        else
        {
            System.out.println("Invalid input");//makes sur input is valid
        }

    }
    public static void printEuropean(int d, int m, int y)
    {
        System.out.println(d + "/" + m + "/" + y);//prints out statement
    }
    public static void printAmerican(int d, int m, int y)
    {
        System.out.println(m + "/" + d + "/" + y);//prints out statement
    }
}
