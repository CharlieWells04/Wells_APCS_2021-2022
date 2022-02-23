import java.util.ArrayList;
import java.util.Collections;
public class FavoriteBooksThree{
    public static void main(String[] args)
    {
        String[] favs = {"Harry Potter", "Divergent", "Anything but Song of solomon"};//using the cool way
        ArrayList<String> favsList = new ArrayList<>();//making the arraylist
        Collections.addAll(favsList, favs);
        //using for each loop
        System.out.println("My favorite books are ");
        for(String books : favsList)
        {
            System.out.println(books);
        }

    }
}