package recursion3.Assignment;

import java.util.Scanner;
/*Given an array A of size n and an integer K, return all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :
Line 1 : Integer n, Size of input array
Line 2 : Array elements separated by space
Line 3 : K
Constraints :
1 <= n <= 20
Sample Input :
9
5 12 3 17 1 18 15 3 17
6
Sample Output :
3 3
5 1*/
public class ReturnSubsetSumK {

    public static int[][] returnSubsetSumToK(int[] arr, int startIndex, int sumToK) {
        if (startIndex == arr.length) {
            if (sumToK == 0) {
                return new int[1][0];
            } else {
                return new int[0][0];
            }
        }
        int[][] smallOutput1 = returnSubsetSumToK(arr, startIndex + 1, sumToK);
        int[][] smallOutput2 = returnSubsetSumToK(arr, startIndex + 1, sumToK - arr[startIndex]);
        int[][] output = new int[smallOutput1.length + smallOutput2.length][];

        int index = 0;
        for (int i = 0; i < smallOutput1.length; i++) {
            output[index++] = smallOutput1[i];
        }

        for (int i = 0; i < smallOutput2.length; i++) {
            output[index] = new int[smallOutput2[i].length + 1];
            output[index][0] = arr[startIndex];
            for (int j = 0; j < smallOutput2[i].length; j++) {
                output[index][j + 1] = smallOutput2[i][j];
            }
            index++;
        }
        return output;
    }

    public static int[][] returnSubsetSumToK(int[] arr, int sumToK) {
        return returnSubsetSumToK(arr, 0, sumToK);
    }

    public static void displayArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
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
        int[][] result = returnSubsetSumToK(arr, key);
        displayArray(result);
    }
}
