public class FoodItem {
    //class variables, are private
    private String typeOfFood; 
    private int numberOfItems;
    private String flavor;
    private boolean isStale;
    private boolean bagIsOpen;
    //constructor
    public FoodItem(String typeOfFood, int numberOfItems, String flavor, boolean isStale, boolean bagIsOpen)
    {
        this.typeOfFood = typeOfFood;
        this.numberOfItems = numberOfItems;
        this.flavor = flavor;
        this.isStale = isStale;
        this.bagIsOpen = bagIsOpen;
    }
    //accessors, ruturn the variables, bypass the private part of the function
    public int getNumber()
    {
        return numberOfItems;
    }
    public String getFlavor()
    {
        return flavor;
    }
    public String getType()
    {
        return typeOfFood;
    }
    //mutators, change variables, bypass the private part
    public void timePass()
    {
        this.isStale = true;
    }
    public void openBag()
    {
        this.bagIsOpen = true;
    }
    public void eat(int amount)
    {
        this.numberOfItems = numberOfItems - amount;
    }

    //empty main class
    public static void main(String[] args)
    {
        //empty
    }  
}
