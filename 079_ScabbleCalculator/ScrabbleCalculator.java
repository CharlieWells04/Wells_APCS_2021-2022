import java.util.*;
public class ScrabbleCalculator {
    public ArrayList<ScrabbleTile> userWordTiles = new ArrayList<>();
    public void printUserTiles()
    {
        System.out.println(userWordTiles);
    }
    public void CheckWord(String[] word)
    {
        //first set of for for loops, checks and sees if word works
        //first iteration, loops thru the word 
        for(int i = 0; i < word.length; i++)
        {
            //second iteration, loops through the userword tiles, checks if they match
            ArrayList<ScrabbleTile> temp = new ArrayList<>();
            temp = userWordTiles;//temp is created to check and remove without actually removing them
            for(int j = 0; i < temp.size(); i++)
            {
                if(word[i].equals(temp.get(j)))
                {
                    temp.remove(j);
                }
                else{
                    System.out.println("Word doesnt work, try again");
                    break;
                }
            }
        }
        System.out.println("The word works");
        //second set of for loops, actually removes the letters from the users arraylist
        for(int i = 0; i < word.length; i++)
        {
            for(int j = 0; i < userWordTiles.size(); i++)
            {
                if(word[i].equals(userWordTiles.get(j)))
                {
                    userWordTiles.remove(j);
                }
            }
        }
    }
    public static void main(String[] args){}
    
}
