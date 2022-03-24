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
        for (int i = 0; i < nums.size() - 1; i++) {
            int pos = i;
            // find position of smallest num between (i + 1)th element and last element
            for (int j = i + 1; j <= nums.size(); j++) {
                if (nums.get(i) < nums.get(pos))
                {
                pos = j;
                }
                // Swap min (smallest num) to current position on array
                int min = nums.get(pos);
                nums.get(pos) = nums.get(i);
                nums.get(i) = min;
            }    
        System.out.println(nums);     
    }
}
}
