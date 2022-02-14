public class Cat {
    //creating a constructor
    private int weight;
    private String name;
    public Cat(int weight, String name)
    {
        this.weight = weight;//using this keyword
        this.name = name;
    }
    //creating getters
    public String getName()
    {
        return name;
    }
    public int getWeight()
    {
        return weight;
    }
    //creating weight setter
    public void setWeight(int x)
    {
        weight = x;
    }
    //empty main method
    public static void main(String[] args)
    {
        //hi
    }
    
}
