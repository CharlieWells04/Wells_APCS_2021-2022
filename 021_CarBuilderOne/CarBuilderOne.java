//import scanner
import java.util.Scanner;

public class CarBuilderOne {
    public static void main(String[] args)
    {
        //declare scanner
        Scanner scan = new Scanner(System.in);

        //ask make and scan
        System.out.println("What manufacturer made your car?");
        String carMake = scan.nextLine();

        //ask model and scan
        System.out.println("What model is your car?");
        String carModel = scan.nextLine();

        //ask year and scan
        System.out.println("What year was your car sold?");
        int carYear = scan.nextInt();

        //ask miles and scan
        System.out.println("How many miles are on your car?");
        int carMiles = scan.nextInt();

        //Car object
        Car car = new Car(carYear, carMiles, carMake, carModel);

        //print statements
        System.out.println("We have found you a car! It is a " + car.year + " " + car.manufacturerName + " " + car.modelName + " with " + car.milesDriven + " miles on it");




        
    }
    
}
