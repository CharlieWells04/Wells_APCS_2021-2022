public class PolyMorphicFoods{
    Food p = new Pizza();//polymorphism
    Food c = new Cake();
    Food[] foods = {p, c};//making the array
    public static void main(String[] args){//empty
        PolyMorphicFoods p = new PolyMorphicFoods();
        for(int i = 0; i < p.foods.length; i++)
        {
            System.out.println(p.foods[i].getCalories());
            System.out.println(p.foods[i].toString());
        }
        System.out.println(((Pizza)p).cut(8));
        System.out.println(((Pizza)p).removePizzaTopper());
    }

}