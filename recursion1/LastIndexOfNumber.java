package recursion1;

import java.util.Scanner;

/*Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
last index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
3*/
public class LastIndexOfNumber {

    private static int lastIndexOccurrence(int[] arr, int x, int startIndex) {
        if (startIndex >= arr.length) {
            return -1;
        }
        int smallAnswer = lastIndexOccurrence(arr, x, startIndex + 1);
        if (smallAnswer != -1) {
            return smallAnswer;
        }
        if (arr[startIndex] == x) {
            return startIndex;
        } else {
            return -1;
        }
    }

    public static int lastIndexOccurrence(int[] arr, int x) {
        return lastIndexOccurrence(arr, x, 0);
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = takeInput();
        int x = scan.nextInt();
        System.out.println(lastIndexOccurrence(arr, x));
    }
}
