public class AreaOfRectangles {
    public static void main(String[] args){
        //Rec 1 (inches)
        double Rec1Width = 5.5; //inches
        double Rec1Length = 7.8; //inches
        double Rec1AreainInches = (Rec1Length * Rec1Width);
        //Rec 2 (centimeters)
        double Rec2Width = 99.4; //centimeters
        double Rec2Length = 500.325; // centimeters
        double Rec2AreaInCentimeters = (Rec2Length * Rec2Width);
        //Rec 3 (centimeters)
        double Rec3Width = 75.00; // inches
        double Rec3WidthInCentimeters = (Rec2Width * 2.54); //centimeterified
        double Rec3Length = 800; // centimeters
        double Rec3AreaInCentimeters = (Rec3Length * Rec3WidthInCentimeters);
        //Rec 4 (inches)
        double Rec4Width = 500029.75; // inches
        double Rec4Length = 90029384; //centimeters
        double Rec4LengthInInches = Rec4Length * .39; // corectified
        double Rec4AreaInInches = (Rec4LengthInInches * Rec4Width);
        //Rec 5 (yards)
        double Rec5Width = 600000; // centimeters
        double Rec5WidthInYards = Rec5Width / 91.44;
        double Rec5Length = 834349103.4; //centimeters
        double Rec5LengthInYards = (Rec5Length / 91.44);
        double Rec5AreaInYards = (Rec5LengthInYards * Rec5WidthInYards);

        System.out.println("The area of Rectangle 1 is " + Rec1AreainInches + " inches squared");
        System.out.println("The area of Rectangle 2 is " + Rec2AreaInCentimeters + " inches squared");
        System.out.println("The area of Rectangle 3 is " + Rec3AreaInCentimeters + " centimeters squared");
        System.out.println("The area of Rectangle 4 is " + Rec4AreaInInches+ " inches squared");
        System.out.println("The area of Rectangle 5 is " + Rec5AreaInYards+ " yards squared ");






        



    }

    
}


/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
-What's with all the extra spacing?
1/1 - Comments
*/