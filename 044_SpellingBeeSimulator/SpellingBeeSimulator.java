import java.util.Scanner;
public class SpellingBeeSimulator {
    public static void main(String[] args){
        //declare scanner, ask question,store vaiable
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.nextLine();
        System.out.print( word + ". " + word + " is spelled "); //opens up print statement
        //start of for loop
        for (int i = 0; i <= word.length() - 1; i++)// run until the word length
        {
            if (i == (word.length() - 1))//used to make sure last dash doesnt print
            {
                System.out.print(word.substring(i, i+1));// only runs when last letter
            }
            else
            {
                System.out.print(word.substring(i, i+1));//runs for all letters but last letter
                System.out.print("-");
            }
        }
        System.out.println("");//makes console look better
    } 
}
