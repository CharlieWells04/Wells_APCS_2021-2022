public class PantryShelf {
    //main class
    public static void main(String[] args)
    {
        //creation of the food items
        FoodItem f1 = new FoodItem("Cheezit", 50, "White Cheddar", false, false);
        FoodItem f2 = new FoodItem("Goldfish", 100, "Original", false, true);

        //eating food item 1 
        System.out.println("I currently have " + f1.getNumber() + " " + f1.getType());//getting origianl number
        System.out.println("I want to eat 12 cheezits");
        for(int i = 0; i < 12; i++)//for loop, runs thru
        {
            System.out.println("Im eating a " + f1.getType());
            f1.eat(1);
        }
        System.out.println("I now have " + f1.getNumber() + " " + f1.getType());  
        
        //eating food item 2
        System.out.println("I currently have " + f2.getNumber() + " " + f2.getType());//getting origianl number
        System.out.println("I want to eat 33 " + f2.getType());
        for(int i = 0; i < 33; i++)//for loop
        {
            System.out.println("Im eating a " + f2.getType());
            f2.eat(1);
        }
        System.out.println("I now have " + f2.getNumber() + " " + f2.getType());//prints final number of food    
     }
}
