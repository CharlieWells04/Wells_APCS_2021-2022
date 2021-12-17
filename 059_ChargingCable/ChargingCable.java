public class ChargingCable {
    public static void main(String[] args)
    {
        //empty
    }
    public String brand;
    public int length;
    public String connectionType;
    //method that contains data about cables.
    public void cableInfo(String cbrand, int clength, String cconnectionType)
    {
        this.brand = cbrand;
        this.length = clength;
        this.connectionType = cconnectionType;
    }
    public void charging()//method that tests if cords work using if statements
    {
    //set up ipad into the method
    iPad ipad = new iPad();
    if (connectionType.equals(ipad.connectionType))
    {
        ipad.currentCharge = 100;
        System.out.println("You cable plugs in and is charged to " + ipad.currentCharge + " percent");
        
    }
    else
    {
        System.out.println("You cable doesnt plug in");
    }
    }
}
