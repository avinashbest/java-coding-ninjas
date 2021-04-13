package recursion1;

import java.util.Scanner;
/*Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Sum
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7    */
public class ArraySum {

    public static int arraySum(int[] arr, int startIndex) {
        if (arr.length == startIndex) {
            return 0;
        }
        return arr[startIndex] + arraySum(arr, startIndex + 1);
    }

    public static int[] takeInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Size of the Array? ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of the Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(arraySum(arr, 0));
    }
}
