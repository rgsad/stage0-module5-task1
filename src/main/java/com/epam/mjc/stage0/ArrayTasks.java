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
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }
        return arr;
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
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
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
        String[] reverseArr = new String[arr.length];
        for (int j = arr.length - 1; j >= 0; j--) {
            reverseArr[arr.length - j - 1] = arr[j];
        }
        return reverseArr;
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
        int count = 0;
        int[] arrPositiveNumbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrPositiveNumbers[count] = arr[i];
                count++;
            }
        }
        int[] result = new int[count];
        System.arraycopy(arrPositiveNumbers, 0, result, 0, count);
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
        int[] max = arr[0].length > arr[1].length ? arr[0] : arr[1];
        int[] min = arr[0].length < arr[1].length ? arr[0] : arr[1];

        for (int i = 0; i < max.length - 1; i++) {
            for (int j = i+1; j < max.length; j++) {
                if (max[j] < max[i]) {
                    int temp = max[i];
                    max[i] = max[j];
                    max[j] = temp;
                }
            }
        }

        for (int i = 0; i < min.length - 1; i++) {
            for (int j = i+1; j < min.length; j++) {
                if (min[j] < min[i]) {
                    int temp = min[i];
                    min[i] = min[j];
                    min[j] = temp;
                }
            }
        }

        arr[0] = max;
        arr[1] = min;
        return arr;
    }
}
