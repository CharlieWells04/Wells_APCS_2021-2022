import java.util.Scanner;
public class NameGreeting {
    
    public static void main(String[] args)
    {
        greetName();//runs greetName
    }
    public static void greetName()
    {
    //delare scanner, ask question, store variable
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String nameOfPerson = scan.nextLine();
    scan.close();
    System.out.println("Hello " + nameOfPerson);//prints out greeting
    }
}
