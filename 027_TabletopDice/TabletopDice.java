public class TabletopDice {
    public static void main(String[] args)
    {
        //all the normal dice calculations, add 1 at end so that you dont get 0, have to cast to int
        int d4 = (int)(Math.random() * 4)+ 1;
        int d6 = (int)(Math.random() * 6) + 1;
        int d8 = (int)(Math.random() * 8) + 1;
        int d10 = (int)(Math.random() * 10) + 1;
        int d12 = (int)(Math.random() * 12) + 1;
        int d20 = (int)(Math.random() * 20)+ 1;

        //the percenitle dice, essentailly d10 but mult by 10 after
        int dP = ((int)(Math.random() * 10 + 1) * 10);

        //print statements
        System.out.println("The 4 sided die rolled a " + d4 );
        System.out.println("The 6 sided die rolled a " + d6 );
        System.out.println("The 8 sided die rolled a " + d8 );
        System.out.println("The 10 sided die rolled a " + d10 );
        System.out.println("The 12 sided die rolled a " + d12 );
        System.out.println("The 20 sided die rolled a " + d20 );
        System.out.println("The Percentile die rolled a " + dP);
    }
    
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/