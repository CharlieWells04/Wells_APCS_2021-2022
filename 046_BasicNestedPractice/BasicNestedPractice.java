import java.util.Scanner;
public class BasicNestedPractice {
    public static void main(String[] args){
        //decaler scanner, ask questions store answers
        Scanner scan = new Scanner(System.in);
        System.out.println("What character would you like to print?");
        String character = scan.nextLine();
        System.out.println("How many rows would you like? (No more than 20)");
        int rows = scan.nextInt();
        System.out.println("How many columns would you like?(no more than 20)");
        int columns = scan.nextInt();
        scan.close();
        if (rows <= 20 && columns <= 20 && character.length() == 1)//filter to make sure that orrect number of rows and colums and that only one character is inserted
        {
            //first for loop, does rows
            for (int i = 1; i <= rows; i++)
            {
                //second for loop, does columns
                for (int j = 1; j <= columns; j++)
                {
                    System.out.print(character);
                }
                System.out.println("");//moves thing down in console
            }
        }
        else
        {
            System.out.println("Invaild input, please try again");
        }
    }
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/