package recursion3.Assignment;

import java.util.Scanner;

/*Given an integer array (of length n), find and print all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print the subsets in different lines.
Input format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
Constraints :
1 <= n <= 15
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
public class PrintSubsetOfArray {

    public static void printSubsetOfArray(int[] arr, int startIndex, int[] output) {
        if (startIndex == arr.length) {
            for (int i : output) {
                System.out.print(i + "\t");
            }
            System.out.println();
            return;
        }
        int[] newOutput = new int[output.length + 1];
        int i = 0;
        for (; i < output.length; i++) {
            newOutput[i] = output[i];
        }
        newOutput[i] = arr[startIndex];
        /*when first element is contributing*/
        printSubsetOfArray(arr, startIndex + 1, newOutput);
        /*when first element is not contributing*/
        printSubsetOfArray(arr, startIndex + 1, output);

    }

    public static void printSubsetOfArray(int[] arr) {
        int[] output = new int[0];
        printSubsetOfArray(arr, 0, output);
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int[] takingInput() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = takingInput();
        printSubsetOfArray(arr);
    }
}
