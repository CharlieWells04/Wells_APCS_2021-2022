//import scanner
import java.util.Scanner;
public class SimpleCounter {
    public static void main(String[] args)
    {
        //import scanner, ask question, store variable
        Scanner scan = new Scanner(System.in);
        System.out.println("What integer would you like to count to");
        int countTo = scan.nextInt();
        scan.close();
        int counter = 1;
        while(counter <= countTo)//while loop. Takes counter variable, prints it out and adds one, then repeats
        {
            System.out.println(counter);
            counter++;
        }
        System.out.println("Counter Complete");
    } 
}
