public class PhoneTwo {
    //6 class variables, as requested
    int currentCharge;
    String connectionType;
    int screenSize;
    String color;
    int previousOwners;
    int price;

    //main, is emppty
    public static void main(String[] args)
    {
        //empty
    }
    //base constructor
    public PhoneTwo()
    {
        currentCharge = 0;
        connectionType = "Lightning";
        screenSize = 12;
        color = "White";
        previousOwners = 0;
        price = 500;
    }
    //basic constructor
    public PhoneTwo(int price)
    {
        currentCharge = 0;
        connectionType = "Lightning";
        screenSize = 12;
        color = "White";
        previousOwners = 0;
        this.price = price;
    }
    //advanced constructor
    public PhoneTwo(int currentCharge, String connectionType, int screenSize, String color, int previousOwners, int price)
    {
        this.currentCharge = currentCharge;
        this.connectionType = connectionType;
        this.screenSize = screenSize;
        this.color = color;
        this.previousOwners = previousOwners;
        this.price = price;
    }

    //5 custom methods
    public void On()//1, turns phone on
    {
        //if statement
        {
            if(currentCharge > 0)
            {
                System.out.println("The phone turns on");
            }
            else
            {
                System.out.println("You phone is dead and cant turn on");
            }
        }
    }
    public void Commercial()//2 , runs commercial for phone
    {
        System.out.println("The phone is only " + price + " and has a " + screenSize + " inch screen!");
    }
    public void IsItGreen()//3, checks if phone is green
    {
        if(color.equals("Green"))
        {
            System.out.println("Your phone is green!!!!");
        }
        else{
            System.out.println("Nope, not green");
        }
    }
    public void New()//4, checks if phone is new or old
    {
        if(previousOwners == 0)
        {
            System.out.println("You phone is brand new");
        }
        else{
            System.out.println("You phone has been used before");
        }
    }
    public void BrokeCheck()//checks if you can aford the phone if yu are broke and your budget is 100 dollars
    {
        if(price <= 100)
        {
            System.out.println("You can afford it");
        }
        else
        {
            System.out.println("Nope, you are too broke");
        }
    }
    //creating toString Method
    public String toString()
    {
        return("The phone is a " + color + " that has " + previousOwners + "previous owners");
    }

    
}
