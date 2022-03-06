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

/*
1/1 - Compiles
1/1 - Content

I'd have liked the average as it went along, but this is fine.

1/1 - Formatting
1/1 - Comments
*/