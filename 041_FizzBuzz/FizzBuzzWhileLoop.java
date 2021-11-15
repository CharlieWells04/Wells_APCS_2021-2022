import java.util.Scanner;
public class FizzBuzzWhileLoop {
    public static void main(String[] args)
    {
        //declare int that will count
        int counter = 1;
        //declare scanner, ask question, store answer
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like me to play up to?");
        int countTo = scan.nextInt();
        scan.close();
        while(counter <= countTo)// while loop, counts until reach count to
        {
            //if statement, use % to figure out if fizz, buzz, or fizzbuzz
            if((counter % 3 == 0 ) && (counter % 5 == 0))//fizzbuzz
            {
                System.out.println("Fizzbuzz");
            }
            else if(counter % 5 == 0)
            {
                System.out.println("Buzz");//buzz
            }
            else if(counter % 3 == 0)
            {
                System.out.println("Fizz");//fizz
            }
            else 
            {
                System.out.println(counter);//neither, prints out number
            }
            counter++;//adds one to counter

        }
    }
    
}
