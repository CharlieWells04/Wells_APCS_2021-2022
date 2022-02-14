import java.util.ArrayList;
public class FavoriteMoviesTwo {
    public static void main(String[] args)
    {
        //setting up arraylist
        ArrayList<String> favs = new ArrayList<>();
        favs.add("Shrek");
        favs.add("Ice Age ");
        favs.add("Shrek 2");
        System.out.println("My favorite movies are :");// for each loops, easier
        for(String movie: favs)
        {
            System.out.println(movie);
        }
    }
    
}
