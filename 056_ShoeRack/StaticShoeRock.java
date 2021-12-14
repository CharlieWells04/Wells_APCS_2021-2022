public class StaticShoeRock {//should say rack but its too late now
    public static void main(String[] args)
    {
        //set methods
        StaticShoes s1 = new StaticShoes();
        StaticShoes s2 = new StaticShoes();
        StaticShoes s3 = new StaticShoes();
        // set up methods
        s1.shoeBrand = "Nike";
        s1.size = 7;
        s1.color = "Blue";
        s2.shoeBrand = "Under Armour";
        s2.size = 12;
        s2.color = "Green";
        s3.shoeBrand = "Adidas";
        s3.size = 11;
        s3.color = "White";
        //print off using method in other class
        s1.printShoes();
        s2.printShoes();
        s3.printShoes();
        //this doesnt work because of the static, when you declare the strings and ints, it affects everything, not just the speciic thing

    }
    
}
