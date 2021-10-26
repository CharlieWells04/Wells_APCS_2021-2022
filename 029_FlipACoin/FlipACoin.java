public class FlipACoin {
    public static void main(String[] args){
        //generate random number and store
        int number = (int)(Math.random() * 2);
        //if statement and print statement
        if(number == 0){
            System.out.println("Tails");
        }
        else{
            System.out.println("Heads");
        }

    }
    
}
