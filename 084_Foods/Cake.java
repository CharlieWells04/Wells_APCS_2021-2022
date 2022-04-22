public class Cake extends Food{
    String flavor;//attribute making
    boolean isFrosted;
    public static void main(String[] args){}
    public Cake()//making the constructors
    {
        flavor = "Chocolate";
        isFrosted = false;
    }
    public Cake(boolean isFrosted, String flavor)
    {
        this.isFrosted = isFrosted;
        this.flavor = flavor;
    }
    public void Taste()//11st method
    {
        System.out.println("MMM, tastes like " + flavor);
    }
    public void FrostedCheck()//2nd method
    {
        if(isFrosted == true)//if statement for method
        {
            System.out.println("The Cake is frosted");
        }
        else
        {
            System.out.println("Not frosted");
        }
    } 

}