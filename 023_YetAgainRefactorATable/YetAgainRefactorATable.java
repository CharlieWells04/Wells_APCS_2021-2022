public class YetAgainRefactorATable {
    public static void main(String[] args)
    {
     //old part using Math
        // Key r = row, C = Column
        
     int r1C1 = 1;
     double r1C2 = Math.pow(r1C1, 2); // .pow to sqaure
     double r1C3 = Math.pow(r1C1, 3); // .pow to cube
     int r2C1 = 2;
     double r2C2 = Math.pow(r2C1, 2); // have to be doubles for .pow to work
     double r2C3 = Math.pow(r2C1, 3);
     int r3C1 = 3;
     double r3C2 = Math.pow(r3C1, 2);
     double r3C3 = Math.pow(r3C1, 3);
     int r4C1 = 4;
     double r4C2 = Math.pow(r4C1, 2);
     double r4C3 = Math.pow(r4C1, 3);
     
     // 4 rows 3 columns
     System.out.println("a   a^2   a^3");
     System.out.println(r1C1 + "   " + r1C2 + "   " + r1C3 );
     System.out.println(r2C1 + "   " + r2C2 + "   " + r2C3 );
     System.out.println(r3C1 + "   " + r3C2 + "   " + r3C3 );
     System.out.println(r4C1 + "   " + r4C2 + "  " + r4C3 );
     
     //start of new part
     Scanner scan = new Scanner();
     System.out.println("What other row would you like to be displayed?")

    }
    
}
