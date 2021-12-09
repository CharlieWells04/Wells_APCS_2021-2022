public class Menu {
    //declaring class variables
    public static String item1Name = "Spaghetti";
    public static String item1Description = "Hand made noodles topped woth fresh tomato sauce and all natural beef meatballs";
    public static String item2Name = "Hamburger";
    public static String item2Description = "Its a hamburger, not that hard";
    public static String item3Name = "Cheeseburger";
    public static String item3Description = "Its a hamburger with cheese";
    public static void main(String[] args)
    {
        //decalreclass into method
        MenuItem m1 = new MenuItem();
        MenuItem m2 = new MenuItem();
        MenuItem m3 = new MenuItem();
        //set values to menu items
        m1.itemName = item1Name;
        m1.itemDescription = item1Description;
        m2.itemName = item2Name;
        m2.itemDescription = item2Description;
        m3.itemName = item3Name;
        m3.itemDescription = item3Description;
        //run print item
        m1.printItem();
        m2.printItem();
        m3.printItem(); 
        }
    }
    
}
