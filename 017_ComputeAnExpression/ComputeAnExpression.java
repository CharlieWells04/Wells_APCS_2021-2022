public class ComputeAnExpression {
    public static void main(String[] args)
    {
        //nums in equasion
        double num1 = 9.5;
        double num2 = 4.5;
        double num3 = 2.5;
        double num4 = 3.0;
        double num5 = 45.5;
        double num6 = 3.5;

        //calc old way
        System.out.println((num1 * num2 - num3 * num4) / (num5 - num6));

        //calc new way
        ReturningCalculator calc = new ReturningCalculator();

        double num7 = calc.doubleMultiplier(num1, num2);

    






    }
    
}


/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
-What's with all the extra spacing?
1/1 - Comments
*/