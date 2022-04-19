import java.util.Scanner;
public class InsertionSortSomeIntegers {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many random ints would you like me to generate");//asks questions an stuff
        int numOfInts = scan.nextInt();
        scan.close();
        int[] intsToSort = new int[numOfInts];
        for(int i = 0; i < numOfInts; i++)
        {
            int rando = (int)(Math.random() * 1000);//loops thru and generates ints
            intsToSort[i] = rando;
            System.out.print(rando + " ");
        }
        System.out.println("");
        System.out.println("Here are your sorted integers");
        InsertionSortSomeIntegers iss = new InsertionSortSomeIntegers();//runs method
        iss.insertionSort(intsToSort);
        for(int i = 0; i < intsToSort.length; i++)
        {
            System.out.print(intsToSort[i] + " ");//prints
        }
    }
    public void insertionSort(int[] arr)
    {
        int n = arr.length;//creates an int that is the length
        for (int i = 1; i < n; ++i) //starts loop
        {
            int key = arr[i];//creates key variable
            int j = i - 1;//sets j 1 spot to the left of i
            while (j >= 0 && arr[j] > key) {//runs thru and checks an sees if the int is in the wrong place
                arr[j + 1] = arr[j];//moves the int at j 1 to the right
                j = j - 1;// moves j 1 to the left
            }
        arr[j + 1] = key;//sets into final loaction
        }
    }
    
}
