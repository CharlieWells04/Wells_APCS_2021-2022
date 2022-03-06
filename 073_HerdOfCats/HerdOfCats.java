import java.util.ArrayList;
import java.util.Collections;
public class HerdOfCats {
    Cat cat1 = new Cat(12, "CatA");//maing the cats
    Cat cat2 = new Cat(22, "CatB");
    Cat cat3 = new Cat(6, "CatC");
    Cat[] cats = {cat1, cat2, cat3};
    public static void main(String[] args)
    {
        HerdOfCats herd = new HerdOfCats();
        herd.CatModifier(herd.cats);
    }
    //making the method
    public void CatModifier(Cat[] x)
    {
        ArrayList<Cat> catsList = new ArrayList<Cat>();//making the arraylist
        Collections.addAll(catsList, cats);//adding the array into the arraylist
        //for each loop
        for(int i = 0; i < catsList.size(); i++)
        {
            System.out.print("This is ");//prining out the stataments
            System.out.print(catsList.get(i).getName());
            System.out.print(", he weighs ");
            System.out.print(catsList.get(i).getWeight());
            System.out.println(" pounds");
            System.out.println("I am now feeding him 1 pound of fish");
            //changing the weights
            catsList.get(i).setWeight(catsList.get(i).getWeight() + 1);
            //pritning
            System.out.println("He now weighs " + catsList.get(i).getWeight() + " pounds");
        }
    }
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/