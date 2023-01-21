import java.util.Arrays;

public class Main{
/* Binary search from scratch. Binary search works only with a sorted list of items. 
 * To find an item we repeatedly divide in half the portion of the list that could contain the item.
 * During each step we eliminate half of the array till we find the item.
 */

    public static void main(String[] args){
        //initialise array and target 
        int array[] = new int[100000];
        int target  = 694;

        //create a loop for the array
        for(int i = 0; i<array.length; i++){
            array[i] = i;
        }

        int index = binarySearch(array,target);
        
        if(index == -1){
            System.out.println(target + " not found!");
        } else{
            System.out.println("Element found at " + index);
        }

    }

    private static int binarySearch(int[] array, int target) {
//initialise low and high boundaries
        int low = 0;
        int high = array.length - 1;
        
        //create while loop 
        while(low<=high){
            //intilise midium point 
            int mid = low + (high - low)/2;
            int midValue = array[mid];
            System.out.println("Midium value is " + midValue); // just to see the steps 
            if (midValue < target){ //eliminate the right half
                low = mid +1;
            } else if(midValue > target){ //eliminate the left half
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1; //if the target not found
    }
}

