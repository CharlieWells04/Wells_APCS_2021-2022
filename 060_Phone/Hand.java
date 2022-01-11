public class Hand {
    public static void main(String[] args)
    {
        //making phone and charging cable
        Phone phone = new Phone(48, "Lightning", 12, "Blue", 0, 250);
        ChargingCable cable = new ChargingCable("Apple", 12, "Lightning");

        //run methods
        phone.On();
        phone.Commercial();
        phone.IsItGreen();
        phone.New();
        phone.BrokeCheck();
        cable.charging(); 
    }  
}


/*
1/1 - Compiles
0/1 - Content
-Only one constructor in the phone!
1/1 - Formatting
1/1 - Comments
*/