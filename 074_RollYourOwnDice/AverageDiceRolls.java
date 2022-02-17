import java.util.Scanner;
import java.util.ArrayList;
public class AverageDiceRolls {
    ArrayList<Integer> rolls = new ArrayList<>();//class arraylist
    public static void main(String[] args)
    {
        AverageDiceRolls adr = new AverageDiceRolls();
        adr.Start();
    }
    public void Start()
    {
        //figuring out the number of sides
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int sides = scan.nextInt();
        Dice dice = new Dice(sides);
        System.out.print("Your first roll is a ");//does the roll
        int temp = dice.Roll();
        System.out.println(temp);
        rolls.add(temp);//adds to arraylist
        //running scan once so no glitch
    
        while(sides > -1)//purposeful infinite while loop
        {
            System.out.println("Would you like to roll again (respond with \"yes\" or \"no\"");
            String yorn = scan.nextLine();
            if (yorn.equals("yes"))
            {
                System.out.print("Your rolled a ");//does the roll
                temp = dice.Roll();
                System.out.println(temp);
                rolls.add(temp);//adds to arraylist
            }
            else if(yorn.equals("no"))//breaks while loop
            {
                System.out.println("OK");
                break;
            }
            else  
            {
                System.out.println("Invalid Input, try again");
            }
        }
        //making the averaging function
        int avg = 0;
        for (int i = 0; i < rolls.size(); i++)
        {
            avg = avg + rolls.get(i);
        }
        avg = avg / rolls.size();
        System.out.println("The average of all the dice rolls " + avg);
    }
}
