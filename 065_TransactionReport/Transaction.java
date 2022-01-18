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
    public Transaction(String itemDescription, double itemBasePrice, double itemGivenPrice, double timeOfTransaction, boolean taxableItem, double taxAmountForItem);
    {
        this.itemDescription = itemDescription;
        this.itemBasePrice = itemBasePrice;
        this.itemGivenPrice = itemGivenPrice;
        this.timeOfTransaction = timeOfTransaction;
        this.taxableItem = taxableItem;
        this.taxAmountForItem = taxAmountForItem;
    }
    //creating setters for all calcualtions later
    private void setMargin(int amount)
    {
        itemMargin = amount;
    }
    private void setTotalPrice(int amount)
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



}
