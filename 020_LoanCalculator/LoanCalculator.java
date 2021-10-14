//import scanner
import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args){
        // declare scanner
        Scanner scan = new Scanner(System.in);
        // ask and store priciple balance
        System.out.println("What is your principle balance? ");
        double principleBalance = scan.nextDouble();
        // ask and store annual interest rate
        System.out.println("What is your anual interest rate? (enter as decimal)");
        double annualInterestRate = scan.nextDouble();
        //ask and store remaining months
        System.out.println("How many months do you have left ");
        double remainingMonths = scan.nextDouble();
        scan.close();


        //calculations 
        double monthlyInterest = principleBalance * (annualInterestRate/remainingMonths);
        double monthlyPayment = principleBalance/remainingMonths + monthlyInterest;

        // print statements
        System.out.println("Your monthly interest is " + monthlyInterest);
        System.out.println("Your monthly payment is " + monthlyPayment);
    }
    
}
/*
1/1 - Compiles
0/1 - Content
-Remember, the interest rate is a percentage...
1/1 - Formatting
1/1 - Comments
*/