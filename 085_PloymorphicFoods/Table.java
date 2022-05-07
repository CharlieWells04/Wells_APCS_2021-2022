public class Table{
    public static void main(String[] args){
    Pizza pizza1 = new Pizza();//making the objects
    Cake cake1 = new Cake();
    pizza1.eat();//running food methods
    cake1.eat();
    pizza1.getCalories();
    cake1.getCalories();
    pizza1.Cut(8);//runnign individual methods
    pizza1.removePizzaTopper();
    cake1.FrostedCheck();
    cake1.Taste();
    }
}