public class Car
{
    int year;
    int milesDriven;
    String manufacturerName;
    String modelName;
    boolean hasTurbo = false;

    //Base model constructor
    public Car() {
        year = 2015;
        milesDriven = 132_000;
        manufacturerName = "Honda";
        modelName = "CRV";
    }

    //Custom car
    public Car(int cYear, int cMilesDriven, String cManufacturerName, String cModelName) {
        year = cYear;
        milesDriven = cMilesDriven;
        manufacturerName = cManufacturerName;
        modelName = cModelName;
    }

    public Car(int cYear, int cMilesDriven, String cManufacturerName, String cModelName, boolean cHasTurbo) {
        year = cYear;
        milesDriven = cMilesDriven;
        manufacturerName = cManufacturerName;
        modelName = cModelName;
        hasTurbo = cHasTurbo;
    }

    public static void main(String[] args)
    {
    }

    public void revEngine()
    {
        System.out.println("The " + manufacturerName + " " + modelName + " goes \'VROOM, VROOM\'.");
    }

    public void engageTurbo()
    {
        if(hasTurbo)
        {
            System.out.println("TURBO ENGAGED!!!");
        }
        else
        {
            System.out.println("Nice try, but there's no turbo in this car.");
        }
    }
}