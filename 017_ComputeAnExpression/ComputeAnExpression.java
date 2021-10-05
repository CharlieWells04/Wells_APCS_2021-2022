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

        //call returning calculator
        ReturningCalculator calc = new ReturningCalculator();
        //calculations, first part of equasion
        double newNum1 = calc.doubleMultiplier(num1, num2);
        double newNum2 = calc.doubleMultiplier(num3, num4);
        double newNum3 = calc.doubleSubtractor(newNum1, newNum2);
        //second part of equasion
        double newNum4 = calc.doubleSubtractor(num5, num6);
        //final divide
        double finalNum = calc.divider(newNum3, newNum4);

        //print statement
        System.out.println(finalNum);

        //the two ways give same output
    }
    
}

