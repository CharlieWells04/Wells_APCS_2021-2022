public class Dice {
    private int value;
    private int sides;
    public static void main(String[] args)
    {
        //empty
    }
    public Dice(int sides)//constructor
    {
        this.sides = sides;
    }
    //making the roll function
    public int Roll()
    {
        int temp;
        temp = (int)(Math.random() * sides +1);
        value = temp;
        return temp;
    }
    //getter 
    public int getValue()
    {
        return value;
    }

}
