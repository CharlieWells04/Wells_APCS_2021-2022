public class ShoesRack {
    public static void main(String[] args)
    {
        //set methods
        Shoes s1 = new Shoes();
        Shoes s2 = new Shoes();
        Shoes s3 = new Shoes();
        // set up methods
        s1.shoeBrand = "Nike";
        s1.shoeSize = 7;
        s1.color = "Blue";
        s2.shoeBrand = "Under Armour";
        s2.shoeSize = 12;
        s2.color = "Green";
        s3.shoeBrand = "Adidas";
        s3.shoeSize = 11;
        s3.color = "White";
        //print off using method in other class
        s1.printShoesNotStatic();
        s2.printShoesNotStatic();
        s3.printShoesNotStatic();
    }

    
}
