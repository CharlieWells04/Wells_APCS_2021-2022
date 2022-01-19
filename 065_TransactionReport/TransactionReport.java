public class TransactionReport {
    //creating the same transaction for reporting purposes
    Transaction t = new Transaction("Apple", 1.50, 1.99, 12.15, false, 0.0);
    //margin calc method
    public void calcMargin()
    {
        //calculating margin
        double tempMargin;
        tempMargin = ((t.getBasePrice() / t.getGivenPrice()) * 100);
        t.setMargin(tempMargin);
        System.out.println(t.getMargin());
    }
    //making a total price calc mthod
    public void calcTotalPrice()
    {
        double temp;
        temp = (t.getGivenPrice() + t.getTaxAmountForItem());
        t.setTotalPrice(temp);
        System.out.println(t.getTotalPrice());
    }
    //empty mian metohd
    public static void main(String[] args)
    {
        //main empty
    }
   
}
