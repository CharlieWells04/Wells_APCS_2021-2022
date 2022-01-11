public class GasSign {
    public static void main(String[] args)
    {
        //creating 3 gasses
        GasPriceTracker g1 = new GasPriceTracker("Unleaded", 2.49);
        GasPriceTracker g2 = new GasPriceTracker("Plus", 2.79);
        GasPriceTracker g3 = new GasPriceTracker("Premium", 2.99); 

        //printing out gas sign
        g1.printer();
        g2.printer();
        g3.printer();

        //raising prices
        g1.raisePrice(.10);
        g2.raisePrice(.10);
        g3.raisePrice(.10);

        //re printing out gas sign
        g1.printer();
        g2.printer();
        g3.printer();
    }     
}
//the comptuer is adding like .0000000000003 to stuff, idk why, but the numbers are otherwise correct