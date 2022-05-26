public class BinarySearch {
    public static void main(String[] args){
    //creating the stuff beofre the sorting happens
    OneThousandSortedRandomNumbers x = new OneThousandSortedRandomNumbers();
    int[] arrayToSearch = x.getSortedNumbers();
    BinarySearch b = new BinarySearch();
    b.BinarySearchFind(arrayToSearch, 8388);
    b.BinarySearchFind(arrayToSearch, 9807);
    b.BinarySearchFind(arrayToSearch, 4011);
    b.BinarySearchFind(arrayToSearch, 5423);
    }
    //making the method for sorting linearly
    public int BinarySearchFind(int[] arr, int numToFind)
    {
        int first = 0;//creates a right side at 0
        int last = arr.length;//creates a left side at the array length
        int mid = (first + last)/2; //createsa  middle inde int the middle
        int count = 0; //used for conting iterations
        while( first <= last ){  //loops thru until found or not found
        count++;//adds to count every iteration
           if ( arr[mid] < numToFind ){  //checks if midpoint is less than the number
             first = mid + 1;//sets the beginning to the mid point +1     
           }else if ( arr[mid] == numToFind ){  //checls of the target and number are equa;
             System.out.println("Number is found at index: " + mid + " It took " + count + " iterations to find the number");
             return mid;  //returns the index
           }else{  
              last = mid - 1;  //sets the end to the mid point = 1    
           }  
           mid = (first + last)/2;  
           if ( first > last ){  //checks if the first has passed the last, if this happens the umber doesnt exists in the array you are searcing
            System.out.println("The Number " + numToFind + " was not found");
            return -1;//prints out -1 if not found
            }  
        }
        return -1;//this should never trigger
    } 
}



/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/