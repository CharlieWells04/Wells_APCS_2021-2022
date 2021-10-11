public class MaximumIntegers {
    public static void main(String[] args)
    {
        // min and max values
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        //print statements
        System.out.println(max);
        System.out.println(min);

        //overflow values
        int maxOverFlow = max + (max + 1000002);
        int minOverFlow = min + (min + 745);
        
        //print statements
        System.out.println(maxOverFlow);
        System.out.println(minOverFlow);

    }
    
}
