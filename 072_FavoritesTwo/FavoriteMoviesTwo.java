public class FavoriteMoviesTwo {
    public static void main(String[] args)
    {
        //setting up array
        String[] favs = new String[3];
        //inputting movies
        favs[0] = "Shrek";//no fun to do it this way
        favs[1] = "Shrek 2";
        favs[2] = "Ice Age";
        //printing out movies
        System.out.println("My favorite movies are :");// for each loops, easier
        for(String movie: favs)
        {
            System.out.println(movie);
        }
    }
    
}
