import java.util.ArrayList;//import arraylist
public class FavoriteBooksTwo {
    public static void main(String[] args)
    {
        //creating and inputting arraylist values
        ArrayList<String> favs = new ArrayList<>();
        favs.add("Harry Potter");
        favs.add("Divergent");
        favs.add("Anything but Song Of Solomon");

        System.out.println("My favorite books are ");
        for(String books : favs)
        {
            System.out.println(books);
        }
    } 

    
}
