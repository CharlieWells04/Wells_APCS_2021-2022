import java.util.ArrayList;
public class FavoriteTVShowsTwo {
    public static void main(String[] args)
    {
        //creating and inputting aray values
        ArrayList<String> favs = new ArrayList<>();
        favs.add("Scorpion");
        favs.add("Broklyn 99");
        favs.add("Master Chef");
        System.out.println("My favorite shows are :");
        //adding for each loop
        for(String shows : favs)
        {
            System.out.println(shows);
        }
    } 
    
}
