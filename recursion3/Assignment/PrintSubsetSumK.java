package recursion3.Assignment;

import java.util.Scanner;
/*Given an array A and an integer K, print all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print them in different lines.
Input format :
Line 1 : Size of input array
Line 2 : Array elements separated by space
Line 3 : K
Sample Input:
9
5 12 3 17 1 18 15 3 17
6
Sample Output:
3 3
5 1*/
public class PrintSubsetSumK {

    public static void printSubsetSumToK(int[] arr, int startIndex, int[] output, int sumToK) {
        if (startIndex == arr.length) {
            if (sumToK == 0) {
                for (int i : output) {
                    System.out.print(i + "\t");
                }
                System.out.println();
                return;
            } else {
                return;
            }
        }
        int[] newOutput = new int[output.length + 1];
        int i = 0;
        for (; i < output.length; i++) {
            newOutput[i] = output[i];
        }
        newOutput[i] = arr[startIndex];
        printSubsetSumToK(arr, startIndex + 1, output, sumToK);
        printSubsetSumToK(arr, startIndex + 1, newOutput, sumToK - arr[startIndex]);
    }

    public static void printSubsetSumToK(int[] arr, int sumToK) {
        int[] output = new int[0];
        printSubsetSumToK(arr, 0, output, sumToK);
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
        Scanner scan = new Scanner(System.in);
        int[] arr = takingInput();
        int key = scan.nextInt();
        printSubsetSumToK(arr, key);
    }
}
