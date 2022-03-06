public class SumPositiveNegativeInts {
    public String getSums(int[] arr)
    {
        int totalPos = 0;//two totals to start the count
        int totalNeg = 0;
        for(int i = 0; i < arr.length; i++)//for loop that runs thru all the numbers
        {
            //if stateemtn, detitmines if pos or neg
            if(arr[i] < 0)
            {
                totalNeg = totalNeg + arr[i];
            }
            else
            {
                totalPos = totalPos + arr[i];
            }
        }
        //return statment thingy
        return("The sum of the positive numbers is " + totalPos + " and the sum of the negative numbers is "+ totalNeg);
    }
    public static void main(String[] args)
    {
        OneThousandPositiveOrNegativeInts spni = new OneThousandPositiveOrNegativeInts();
        SumPositiveNegativeInts sum = new SumPositiveNegativeInts();
        int[] x = spni.getOneThousandPositiveOrNegativeInts();//creating th int array so i can run it 
        System.out.println(sum.getSums(x));//unning it
    }
    
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/