import java.util.Scanner;
public class DoubloonWords {
    public static void main(String args[]){
        //declare scanner, ask question, store variable
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your word");
        String wordOg = scan.nextLine();
        scan.close();
        //sets word to lower case
        String word = wordOg.toLowerCase();
        //variable, for use in loop
        int counter = 0;
        boolean isDoubloon = true;
        //beginni gof for loop
        for (int i = 0; i < word.length(); i++)//runs until i is equal to word.length
        {
            // variables that store substrings, makes code cleaner
            counter = 0;
            String a = word.substring(i, i+1);
            //start of embedded for loop
            for (int j = 0; j < word.length(); j++)
            {
                String b = word.substring(j, j+1);
                if (b.equals(a))//tests if letters equal
                {
                    counter++;//adds to counter if same letter
                    
                }
                else
                {
                    continue;
                }     
            }
            //if statemnts, checks counter and makes sure is exactly 2
            if (counter == 2)
            {
                continue;
            }
            else{
                isDoubloon = false;
                break;
            }
        }
        //final if statement checker
        if (isDoubloon == true)
        {
            System.out.println("Your word is a doubloon word");
        }
        else
        {
            System.out.println("Your word isnt a doubloon word");
        }
    }
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/