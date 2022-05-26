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
        for (int i = 0; i < numOfInts; i++) {//starts looping thru all the indedes starting at 0
            int pos = i;//sets pos
            for (int j = i; j < nums.size(); j++) {//for each index, loops thru until it finds one smaller
                if (nums.get(j) < nums.get(pos))
                {
                    pos = j;//sets pos to j
                }
            }
            int min = nums.get(pos);//sets the min to the point where it is smaller, so that it sorts
            nums.set(pos, nums.get(i));
            nums.set(i, min);
        }
        System.out.println(nums);//prints out
    }
}


/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/