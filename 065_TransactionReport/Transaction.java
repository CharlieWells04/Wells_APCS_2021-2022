public class Transaction {
    //making class variables
    private String itemDescription;
    private double itemBasePrice;
    private double itemGivenPrice;
    private double itemMargin;
    private double timeOfTransaction; //im using military times so 4:05 AM would be 04.05 and 1 PM would be 13.00
    private boolean taxableItem;
    private double taxAmountForItem;
    private double itemTotalPrice;
    //making constructor
    public Transaction(String itemDescription, double itemBasePrice, double itemGivenPrice, double timeOfTransaction, boolean taxableItem, double taxAmountForItem)
    {
        this.itemDescription = itemDescription;
        this.itemBasePrice = itemBasePrice;
        this.itemGivenPrice = itemGivenPrice;
        this.timeOfTransaction = timeOfTransaction;
        this.taxableItem = taxableItem;
        this.taxAmountForItem = taxAmountForItem;
    }
    //creating setters for all calcualtions later
    public void setMargin(double amount)
    {
        itemMargin = amount;
    }
    public void setTotalPrice(double amount)
    {
        itemTotalPrice = amount;
    }
    //creating getters for calculations later
    public String getDescription()
    {   
        return itemDescription;
    }
    public double getBasePrice()
    {   
        return itemBasePrice;
    }
    public double getGivenPrice()
    {   
        return itemGivenPrice;
    }
    public double getMargin()
    {   
        return itemMargin;
    }
    public double getTimeOfTransaction()
    {   
        return timeOfTransaction;
    }
    public boolean getTaxableItem()
    {   
        return taxableItem;
    }
    public double getTaxAmountForItem()
    {   
        return taxAmountForItem;
    }
    public double getTotalPrice()
    {   
        return itemTotalPrice;
    }
    //empty main method
    public static void main(String[] args)
    {
        //empty
    }

}
