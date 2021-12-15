public class Shirt {

    public static void main(String[] args)
    {
        //emptyness..........
    }
    public void selfDescription(String color, String brand, String type)//added in constructors
    {
        System.out.println("This shirt is a " + color + " " + brand + " " + type);
    }
    public void fold()
    {
        System.out.println("you fold your shirt");
    }
    public void cleanStatus(boolean isClean)
    {
        if (isClean == false)
        {
           System.out.println("Your shirt is dirty");//uses if statemnt to check if shirt is dirty
        }
        else
        {
            System.out.println("Your shirt is clean");
        }
        }
    }

