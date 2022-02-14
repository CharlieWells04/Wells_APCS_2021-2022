public class AverageDiceRole {
    public int getAverage(int[] arr)//method to do the math
    {
        int total = 0;//starts counter
        for(int i = 0; i < arr.length; i++)
        {
            total = total + arr[i];//lopps thru and adds
        }
        int sum = total/arr.length;//gives average
        return sum;
    }
    public static void main(String[] args)
    {
        AverageDiceRole adr = new AverageDiceRole();
        OneThousandDiceRolls dicerolls = new OneThousandDiceRolls();
        int[] x = dicerolls.getDiceRolls();
        System.out.println(adr.getAverage(x));
    }
    
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/
