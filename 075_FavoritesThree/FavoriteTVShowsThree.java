import java.util.ArrayList;
import java.util.Collections;
public class FavoriteTVShowsThree{
    public static void main(String[] args)
    {
        //creating and inputting aray values
        String[] favs = {"Brooklyn 99", "MasterChef", "Scorpion"};//good way
        //making arraylist
        ArrayList<String> favsList = new ArrayList<>();
        Collections.addAll(favsList, favs);//adding all
        for(String movie: favsList)//for each loops thats prints
        {
            System.out.println(movie);
        }
    }
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/