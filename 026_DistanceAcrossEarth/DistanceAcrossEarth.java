import java.util.Scanner;

public class DistanceAcrossEarth {
    public static void main(String[] args){
        
        //decalare scanner, ask questions, store variables
        Scanner scan = new Scanner(System.in);
        System.out.println("For the first set of coordinates, what is the latitude");
        double set1lat = scan.nextDouble();
        System.out.println("For the first set of coordinates, what is the longitude");
        double set1lon = scan.nextDouble();
        System.out.println("For the second set of coordinates, what is the latitude");
        double set2lat = scan.nextDouble();
        System.out.println("For the first set of coordinates, what is the latitude");
        double set2lon = scan.nextDouble();
        scan.close();

        //store pi and radius of earth(miles)
        double pi = Math.PI;
        double radius = 3958.8;

        //set to radians
        set1lat = Math.toRadians(set1lat);
        set1lon = Math.toRadians(set1lon);
        set2lat = Math.toRadians(set2lat);
        set2lon = Math.toRadians(set2lon);

        //use haversine formula (look on wikipedia for readable formula)
        double distance = (2 * radius) * (Math.asin(Math.sqrt((Math.pow(Math.sin((set1lat - set2lat)), 2) / 2 )) + Math.cos(set1lat) * Math.cos(set2lat) * (Math.pow(Math.sin((set1lon - set2lon)), 2) / 2 )));

        //print statement
        System.out.println("The distance between the two points is " + distance + " miles");
    }




    
}
