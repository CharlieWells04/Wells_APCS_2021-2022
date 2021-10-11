import java.util.Scanner;

public class PerimeterOfAHexagonCalculator {
    public static void main(String[] args)
    {
        //declare scanner, ask question, store answer
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the length of the side of the hexagon?");
        double sideLength = scan.nextDouble();
        scan.close();

        // using the formulas
        double perimeter = (6 * sideLength);
        double area = (((3 * Math.sqrt(3)) / 2) * Math.pow(sideLength, 2));

        //print statements
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
        

    }
    
}
