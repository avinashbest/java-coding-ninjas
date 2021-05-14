package recursion3.Assignment;

import java.util.Scanner;

/*Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :
Line 1 : Size of array
Line 2 : Array elements (separated by space)
Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12
20
20 12
15
15 12
15 20
15 20 12 */
public class SubsetOfArray {

    public static int[][] returnSubsetOfArray(int[] arr, int startIndex) {
        /*we are returning  a jagged 2d-array*/
        if (startIndex == arr.length) {
            return new int[1][0];
        }
        int[][] smallOutput = returnSubsetOfArray(arr, startIndex + 1);
        int[][] output = new int[2 * smallOutput.length][];

        int k = 0;
        for (int i = 0; i < smallOutput.length; i++) {
            output[k] = new int[smallOutput.length];
            /*copying smallerOutput array in output array*/
            for (int j = 0; j < smallOutput[i].length; j++) {
                output[k][j] = smallOutput[i][j];
            }
            k++;
        }
        for (int i = 0; i < smallOutput.length; i++) {
            output[k] = new int[smallOutput.length + 1];
            output[k][0] = arr[startIndex];
            for (int j = 1; j < smallOutput[i].length; j++) {
                output[k][j] = smallOutput[i][j - 1];
            }
            k++;
        }
        return output;
    }

    public static int[][] returnSubsetOfArray(int[] arr) {
        return returnSubsetOfArray(arr, 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int[][] result = returnSubsetOfArray(arr);
        printArray(result);
    }

    private static void printArray(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
