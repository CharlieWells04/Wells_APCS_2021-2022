public class LinearSearch {
    public static void main(String[] args){
    //creating the stuff beofre the sorting happens
    OneThousandSortedRandomNumbers x = new OneThousandSortedRandomNumbers();
    int[] arrayToSearch = x.getSortedNumbers();
    LinearSearch b = new LinearSearch();
    b.LinearSearchFind(arrayToSearch, 8388);
    b.LinearSearchFind(arrayToSearch, 9807);
    b.LinearSearchFind(arrayToSearch, 4011);
    b.LinearSearchFind(arrayToSearch, 5423);
    }
    //making the method for sorting linearly
    public int LinearSearchFind(int[] arr, int numToFind)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)//runs thru whole array
        {
            if (arr[i] == numToFind)//if num is equal. return the index
            {
                count++;
                System.out.println("The first insatnce of " + numToFind + " is at index " + i + ", it took " + count + " iterations to find the index");
                return i;
            }
            else{
                count++;
            }
        }
        System.out.println("The Number " + numToFind + " was not found");
        return -1;//prints out -1 if not found
    }
}
