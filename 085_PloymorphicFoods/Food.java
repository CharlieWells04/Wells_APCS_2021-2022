public class Food{
    String color;//making the 2 attributes
    private int calories;
    public static void main(String[] args){}
    public Food(String color, int calories)//kaing the constructor
    {
        this.color = color;
        this.calories = calories;
    }
    public Food()
    {
        color = "Green";
        calories = 100;
    }
    public int getCalories()
    {
        return calories;
    }
    public void eat()
    {
        System.out.println("Munch Munch");
    }
}