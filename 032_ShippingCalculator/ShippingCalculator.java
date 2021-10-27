//import scanner
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class ShippingCalculator {
    public static void main(String[] args){
    //declare scanner, ask question, store variable
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the weight of your item? (lbs)");
    double weight = scan.nextDouble();
    scan.close();
    //if else sattement, using chart from Sheets thingy, if less than 0, invalid input
    if (weight <= 0)
    {
        System.out.println("Invalid Input");
    }
    else if (weight > 0 && weight <= 1)
    {
        System.out.println("Your item will cost 3.5 dollars to ship");
    }
    else if (weight > 1 && weight <= 3)
    {
        System.out.println("Your item will cost 5.5 dollars to ship");
    }
    else if (weight > 3 && weight <= 10)
    {
        System.out.println("Your item will cost 8.5 dollars to ship");
    }
    else if (weight > 10 && weight <= 20)
    {
        System.out.println("Your item will cost 10.5 dollars to ship");
    }
    else 
    {
        System.out.println("You item cannot be shipped");
    }
    }   
}
