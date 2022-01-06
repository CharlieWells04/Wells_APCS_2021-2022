public class ChargingCable {
    public static void main(String[] args)
    {
        //empty
    }
    public String brand;
    public int length;
    public String connectionType;
    //method that contains data about cables.
    public ChargingCable(String cbrand, int clength, String cconnectionType)
    {
        this.brand = cbrand;
        this.length = clength;
        this.connectionType = cconnectionType;
    }
    public void charging()//method that tests if cords work using if statements
    {
    if (connectionType.equals("Lightning"))
    {
        
        System.out.println("You cable plugs in and is charged to 100 percent");
        
    }
    else
    {
        System.out.println("You cable doesnt plug in");
    }
    }
}
    

