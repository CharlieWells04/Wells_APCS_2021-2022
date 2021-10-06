//import scanner
import java.util.Scanner;

public class PrintYourName {
    public static void main(String[] args){
        //declare scanner'
        Scanner scan = new Scanner(System.in);
        
        // ask first name
        System.out.println("What is your first name?");
        String firstName = scan.nextLine();
        // ask last name
        System.out.println("What is your last name?");
        String lastName = scan.nextLine();
        // close scanner
        scan.close();
        //print
        System.out.println("Your first name is " + firstName);
        System.out.println("Your last name is " + lastName);
        System.out.println("Your full name is " + firstName + " " + lastName);

    }
    
}
