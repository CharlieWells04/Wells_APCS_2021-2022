public class Pizza extends Food{
    int size;//making attributes
    String type;
    public static void main(String[] args){}
    public Pizza()//making the constructors
    {
        size = 24;
        type = "Cheese";
    }
    public Pizza(int size, String type)
    {
        this.size = size;
        this.type = type;
    }
    public void Cut(int numOfSlices)//method 1
    {
        System.out.println("You cut the pizza into " + numOfSlices);
    }
    public void removePizzaTopper()//method 2
    {
        System.out.println("What is thing even for?");
    }
}