import java.util.*;
public class SelectionSortSomeIntegers {
    public static void main(String[] args)
    {
        //making scanner, asking question, storing answer
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like me to generate (1-1000)");
        int numOfInts = scan.nextInt();  
        //making the arraylis to host the random ints
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < numOfInts; i++)//looping thru and generating ints
        {
            nums.add((int)(Math.random() * 1000 + 1));
        }
        //doing the slection sort thing        
    }
}
