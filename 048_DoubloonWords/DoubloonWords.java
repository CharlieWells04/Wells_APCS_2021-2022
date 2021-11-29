import java.util.Scanner;
public class DoubloonWords {
    public static void main(String args[]){
        //declare scanner, ask question, store variable
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your word");
        String word = scan.nextLine();
        scan.close();
        //variable, for use in loop
        int counter = 1;
        //beginni gof for loop
        for (int i = 0; i < word.length(); i++)//runs until i is equal to word.length
        {
            // variables that store substrings, makes code cleaner
            int a = word.substring(i, i+1)
            //start of embedded for loop
            for (int j = 0; j < word.length(); j++)
            {
                if 
                {
                    
                }
            }
        }

    }
}
