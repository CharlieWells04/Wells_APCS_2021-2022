import java.util.Scanner;
public class FizzBuzzForLoop {
    public static void main(String[] args){
        //declare scanner, ask question, store answer
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like me to play up to?");
        int countTo = scan.nextInt();
        scan.close();
        //the loop
        for(int i = 1; i <= countTo; i++)
        {
            //if statement, use % to figure out if fizz, buzz, or fizzbuzz
            if((i % 3 == 0 ) && (i % 5 == 0))//fizzbuzz
            {
                System.out.println("Fizzbuzz");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");//buzz
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");//fizz
            }
            else 
            {
                System.out.println(i);//neither, prints out number
            }
        }
    }
}
