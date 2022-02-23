import java.util.ArrayList;
import java.util.Collections;
public class FavoriteMoviesThree{
    public static void main(String[] args)
    {
        //setting up array
        String[] favs = new String[3];
        //inputting movies
        favs[0] = "Shrek";//no fun to do it this way
        favs[1] = "Shrek 2";
        favs[2] = "Ice Age";
        //making the arraylist
        ArrayList<String> favsList = new ArrayList<>();
        Collections.addAll(favsList, favs);
        System.out.println("My favorite movies are :");// for each loops, easier
        for(String movie: favsList)//for each loops thats prints
        {
            System.out.println(movie);
        }
    }
}