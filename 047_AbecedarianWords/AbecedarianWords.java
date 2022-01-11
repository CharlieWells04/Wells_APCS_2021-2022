import java.util.Scanner;
public class AbecedarianWords {
    public static void main(String[] args)
    {
        //boolean, for use later
        boolean ab = true;
        //decalre scanner ask question, store variable, change to lowercase
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your word");
        String wordBad = scan.nextLine();
        String word = wordBad.toLowerCase();
        scan.close();

        for (int i = 0; i < (word.length() -1); i++)//for loop, runs unti word ends
        {
            String letter1 = word.substring(i, i+1);//used to compare letters
            String letter2 = word.substring(i+1, i+2);
            if (letter1.compareToIgnoreCase(letter2) <=0)// abcedarian checker
            {
                continue;
            }
            else{
                ab = false;//breaks code and sets false if not abs
                break;
            }

        }
        //final checker for if abs or not
        if (ab)
        {
            System.out.println("Your word is Abecedarian");
        }
        else{
            System.out.println("Your word isnt Abecedarian");
        }
    }
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/