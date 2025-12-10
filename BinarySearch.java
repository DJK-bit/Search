/**
 * The class BinarySearch contains the algorithm for binary search as
 * well as the implementation of it.
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] numbers = { 1, 5, 6, 15, 23, 24 };

        int target = 24;
        int index = binarySearch(numbers, target);

        System.out.println("The target is " + target + " and is at index " + index);

    }
    /**
     * The method binarySearch: Searches the array using binary search to find the target.
     * Binary search only works with an array that is already sorted in ascending order.
     * 
     * Time complexity: O(log n)
     * 
     * Space complexity: O(1)
     *
     * @param numbers the array that is going to be searched
     * @param target the value that the user wants to find
     */
    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while( right >= left ){
            int mid = (left + right) / 2;

            if( numbers[mid] == target ){
                return mid;
            }
            else if( target > numbers[mid] ){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return -1;
    }
}