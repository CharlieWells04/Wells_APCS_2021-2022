import java.io.*;
import java.util.*;
public class Table {
    public static void main(String[] args)//making all the stuff in main so that the program actually runs
    {
        Table table = new Table();
        ScrabbleBag sb = new ScrabbleBag();
        table.RunGame(sb.getBag());
    }
    public void RunGame(ScrabbleTile[] originalBag)
    {
        ScrabbleCalculator sc = new ScrabbleCalculator();//creating the scrabble calculator and setting up the userwordtiles
        sc.fillUserTiles(originalBag);
        //will add loop herer later
        while(true)
        {
            int totalPoints = 0;
            System.out.println("Here are your letters");//showing user their letters for this hand
            sc.printUserTiles();
            //making scanner to scan in word
            Scanner scan = new Scanner(System.in);
            System.out.println("What word would you like to spell?");
            String userWordButString = scan.nextLine();
            
            //i copied this part from google, essentially what it does is turns the word into an array that i can then sort thru and check
            char[] userWordButChar = userWordButString.toCharArray();
            //this part then goes thru and sets all the chars to strings in a new array so that i can compare them
            String[] userWord = new String[userWordButChar.length];
            for(int i = 0; i < userWordButChar.length; i++)
            {
                userWord[i] = ("" + userWordButChar[i]);//this is a kind of scuffed workaraound, but it turns the char into a string
            }
            sc.CheckWord(userWord);
            System.out.println("Refreshing Letters...");
            sc.fillUserTiles(originalBag);
        }
    }
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/