import java.util.Scanner;
public class NameGreeting {
    
    public static void main(String[] args)
    {
    //delare scanner, ask question, store variable
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String nameOfPerson = scan.nextLine();
    scan.close();
    greetName(nameOfPerson);//runs greetName
    }
    public static void greetName(String name)
    {
    System.out.println("Hello " + name);//prints out greeting
    }
}
