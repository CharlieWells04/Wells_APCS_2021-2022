import java.util.*;
public class ScrabbleCalculator {
    public ArrayList<ScrabbleTile> userWordTiles = new ArrayList<>();
    int totalPoints = 0;
    public void printUserTiles()
    {
        //prints out the users letter
        for(int i = 0; i < userWordTiles.size(); i++)
        {
            String temp2 = userWordTiles.get(i).getLetter();
            System.out.print(temp2 + " ");
        }
        System.out.println("");
    }
    public boolean CheckWord(String[] word)
    {
        //first set of for for loops, checks and sees if word works
        //first iteration, loops thru the word 
        ArrayList<ScrabbleTile> temp = new ArrayList<>();
        temp = userWordTiles;//temp is created to check and remove without actually removing them
        ArrayList<ScrabbleTile> tempButForPointChecker = new ArrayList<>();//this stores the objects so that you can run thru point checker
        boolean failedLetter = true;//used later to break loop if letter fails
        for(int i = 0; i < word.length; i++)
        {
            //second iteration, loops through the userword tiles, checks if they match
            for(int j = 0; j < temp.size(); j++)
            {
                failedLetter = true;//sets to true for each lettr
                if(word[i].equals(temp.get(j).getLetter()))
                {
                    tempButForPointChecker.add(temp.get(j));
                    temp.remove(j);
                    failedLetter = false;
                    break;//breaks the loop because succesful letter has been found
                }
            }
            if(failedLetter == true)
            {
                System.out.println("Word doesnt work, try again");//kills the loop and prints off negative statemnt if word doesnt work
                return false;
            }
        }
        System.out.println("The word works");
        //second set of for loops, actually removes the letters from the users arraylist, much simpler due to knowing that word workss
        PointChecker(tempButForPointChecker);//runs method that checks and prints points for word
        return true;
    }
    public void fillUserTiles(ScrabbleTile[] bagToUse)//fills up users tiles, back up to 7
    {
        while(userWordTiles.size() < 7 && bagToUse.length > 0)
        {
            int rando = (int)(Math.random() * bagToUse.length);
            userWordTiles.add(bagToUse[rando]);
        }
    }
    public void PointChecker(ArrayList<ScrabbleTile> userWord)
    {
        int tempPointCounter = 0;
        System.out.println("Your Word is ");
        for(int i = 0; i < userWord.size(); i++)
        {
            System.out.print(userWord.get(i).getLetter());//prints off word
        }
        System.out.println("");
        for(int i = 0; i < userWord.size(); i++)//runs thru and counts pounts
        {
            System.out.println(userWord.get(i).getLetter() + " is worth " + (userWord.get(i).getPoints()) + " points");
            tempPointCounter += (userWord.get(i).getPoints());
        }
        totalPoints += tempPointCounter;
        System.out.println("You now have " + totalPoints + " points");

    }           

    public static void main(String[] args){}
    
}
