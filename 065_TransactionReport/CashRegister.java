public class CashRegister {
    //creating class variable
    private int totalTransactions;
    //creating setter for variable
    public void setTotalTransactions(int amount)
    {
        totalTransactions = amount;
    }
    public void addTansaction()
    {
        totalTransactions = totalTransactions + 1;
    }
    public static void main(String[] args)
    {
        //empty
    }
    //creating transaction
    Transaction t = new Transaction("Apple", 1.50, 1.99, 12.15, false, 0.0);
   

}
