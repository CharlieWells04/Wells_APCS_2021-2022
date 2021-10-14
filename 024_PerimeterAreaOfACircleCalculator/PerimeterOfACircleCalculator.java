import java.util.Scanner;

public class PerimeterOfACircleCalculator {
    public static void main(String[] args)
    {
        //scan, ask question, store answer
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        double radius = scan.nextDouble();
        scan.close();

        //store pi
        double pi = Math.PI;

        // the maths
        double perimeter = (2 * pi * radius);
        double area = (pi * Math.pow(radius, 2));

        //ze print statements
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
    
}
