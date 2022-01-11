public class Menu {
    public static void main(String[] args)
    {
        //decalreclass into method
        MenuItem m1 = new MenuItem();
        MenuItem m2 = new MenuItem();
        MenuItem m3 = new MenuItem();
        //set values to menu items
        m1.itemName = "Spaghetti";
        m1.itemDescription = "Hand made noodles topped woth fresh tomato sauce and all natural beef meatballs";
        m2.itemName = "Hamburger";
        m2.itemDescription = "Its a hamburger, not that hard";
        m3.itemName =  "Cheeseburger";
        m3.itemDescription = "Its a hamburger with cheese";
        //run print item
        m1.printItem();
        m2.printItem();
        m3.printItem();   
    }
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/