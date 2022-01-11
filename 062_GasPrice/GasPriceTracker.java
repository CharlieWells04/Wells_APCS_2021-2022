public class GasPriceTracker {
    //class variables
    private String name;
    private double price;

    //cosntructor
    public GasPriceTracker(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    //creating getters
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    //creating mutator
    public void raisePrice(double amount)
    {
        price = price + amount;
    }
    //empty main class
    public static void main(String[] args)
    {
        /* other comment */
    }
    //printer method
    public void printer()
    {
        System.out.println(name + ": " + price);
    }
}
