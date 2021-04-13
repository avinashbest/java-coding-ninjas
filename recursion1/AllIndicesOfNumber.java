package recursion1;

import java.util.Scanner;

/*Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
indexes where x is present in the array (separated by space)
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4*/
public class AllIndicesOfNumber {

    private static int[] allIndices(int[] arr, int x, int startIndex) {
        if (startIndex >= arr.length) {
            int[] output = new int[0];
            return output;
        }
        int smallOutput[] = allIndices(arr, x, startIndex + 1);
        if (arr[startIndex] == x) {
            int output[] = new int[smallOutput.length + 1];
            output[0] = startIndex;
            for (int i = 0; i < smallOutput.length; i++) {
                output[i + 1] = smallOutput[i];
            }
            return output;
        } else {
            return smallOutput;
        }
    }

    public static int[] allIndices(int[] arr, int x) {
        return allIndices(arr, x, 0);
    }

    public static int[] takeInput() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = takeInput();
        int x = scan.nextInt();
        int[] output = allIndices(arr, x);
        printArray(output);
    }
}
