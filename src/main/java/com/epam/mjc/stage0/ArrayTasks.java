package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[] {"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int [] result = new int[length];
        for (int i = 0; i < result.length; i++){
            result[i] = i+1;
        }
        return result;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int result = number;
        for (int i = 0; i < arr.length; i++){
            if (number == arr[i]){
                result = i;
                break;
            } else {
                result = -1;
            }
        }
        return result;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        int counter = 0;
        String [] result = new String[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            result[counter] = arr[i];
            counter++;
        }
        return result;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int posNumbers = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                posNumbers++;
            }
        }
        int counter = 0;
        int [] result = new int[posNumbers];
        for (int j = 0; j < arr.length; j++){
            if (arr[j] > 0){
                result[counter] = arr[j];
                counter++;
            }
        }
        return result;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int [] tempArray = new int[arr.length];
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].length < arr[j - 1].length) {
                    tempArray = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tempArray;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < arr[i].length; j++) { //this equals to the column in each row.
                for (int k = j; k > 0; k--){
                    if (arr[i][k] < arr[i][k - 1]) {
                        temp = arr[i][k];
                        arr[i][k] = arr[i][k - 1];
                        arr[i][k - 1] = temp;
                    }
                }
            }
        }
        return arr;
    }
}
