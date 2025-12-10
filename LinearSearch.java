/**
 * The class LinearSearch contains the algorithm for linear search as
 * well as the implementation of it.
 */
public class LinearSearch {
    public static void main(String[] args) {

        int[] numbers = { 1, 5, 23, 24, 15, 6 };

        int target = 24;
        int index = linearSearch(numbers, target);

        System.out.println("The target is " + target + " and is at index " + index);

    }
    /**
     * The method linearSearch: Searches the array linearly to find the wanted value.
     * 
     * Time complexity: Best: O(1)
     *                  Worst: O(n)
     * 
     * Space complexity: O(1)
     *
     * @param numbers the array that is going to be searched
     * @param target the value that the user wants to find
     */
    public static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]){
                return i;
            }
        }
        return -1;
    }
}