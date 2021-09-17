public class RefactorATableOfVariables {
    public static void main(String[] args){
        // Key r = row, C = Column
        
        int r1C1 = 1;
        int r1C2 = (r1C1 * r1C1); // mult by itself to square
        int r1C3 = (r1C2 * r1C1); // mult square by self to cube
        int r2C1 = 2;
        int r2C2 = (r2C1 * r2C1);
        int r2C3 = (r2C1 * r2C2);
        int r3C1 = 3;
        int r3C2 = (r3C1 * r3C1);
        int r3C3 = (r3C1 * r3C2);
        int r4C1 = 4;
        int r4C2 = (r4C1 * r4C1);
        int r4C3 = (r4C1 * r4C2);
        // 4 rows 3 columns
        

        System.out.println("a   a^2   a^3");
        System.out.println(r1C1 + "   " + r1C2 + "   " + r1C3 );
        System.out.println(r2C1 + "   " + r2C2 + "   " + r2C3 );
        System.out.println(r3C1 + "   " + r3C2 + "   " + r3C3 );
        System.out.println(r4C1 + "   " + r4C2 + "  " + r4C3 );

        
    }
    
}
