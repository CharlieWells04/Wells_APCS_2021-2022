//import scanner
import java.util.Scanner;

public class IsItLegalForYou {
    public static void main(String[] args)
    {
        //decalre scanner
        Scanner scan = new Scanner(System.in);
        //ask question, store variable
        System.out.println("What is your legal age? (Your data may or may not be sold to a third party)");
        int age = scan.nextInt();
        scan.close();
        
        //drivers licnence if statement
        if (age >= 16)
        {
            System.out.println("You are legally allowed to get a drivers license");
        }
        else{
            System.out.println("You legally cannot get a drivers license");
        }
        // if statement for rent car, but alchohol, buys cigs, and rent a car
        if (age >= 21)
        {
            System.out.println("You are legally allowed to rent a car");
            System.out.println("You are legally allowed to buy alchohol");
            System.out.println("You are legally allowed tp buy cigarettes");
            System.out.println("You are legally allowed to rent a car");
        }
        else{
            System.out.println("You legally cannot rent a car");
            System.out.println("You legally cannot buy alchohol");
            System.out.println("You legally cannot buy cigarettes");
            System.out.println("You legally cannot rent a car");
        }
        //if statement for cjob
        if (age >= 14){
            System.out.println("You legally can get a job");
        }
        else{
            System.out.println("You legally cannot get a job");
        }
         //if statement forcasino
         if (age >= 18){
            System.out.println("You legally can enter a casino");
        }
        else{
            System.out.println("You legally cannot enter a casino");
        }
         //if statement for medicare
         if (age >= 65){
            System.out.println("You legally can enroll in medicare");
        }
        else{
            System.out.println("You legally cannot enroll in medicare");
        }
         //if statement for run for prez
         if (age >= 35){
            System.out.println("You can legally run for president");
        }
        else{
            System.out.println("You legally cannot run for president");
        }
    }  
}
