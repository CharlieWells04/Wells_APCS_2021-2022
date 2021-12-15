public class Shirt {
    //class variables
    String color = ("Blue");
    String brand = ("Under Armour");
    String type = ("Long Sleeve");
    boolean isClean = true;
    public static void main(String[] args)
    {
        //emptyness..........
    }
    public void selfDescription()
    {
        System.out.print("This shirt is a " + color + " " + brand + " " + type + " that is ");
        //tests if shirt is dirty or clean
        if (isClean == false)
        {
            System.out.println("dirty");//prints on to end of last line as last line is print and not println
        }
        else
        {
            System.out.println("clean");
        }
    }
    public void fold()
    {
        System.out.println("you fold your shirt");
    }
    public void cleanStatus()
    {
        if (isClean == false)
        {
            System.out.println("Your shirt is dirty");//pirated straight from earlier
        }
        else
        {
            System.out.println("Your shirt is clean");
        }
    }
}
