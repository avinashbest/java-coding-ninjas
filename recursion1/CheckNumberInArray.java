package recursion1;

import java.util.Scanner;

/*Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false*/
public class CheckNumberInArray {

    public static boolean checkNumber(int[] arr, int x) {
        if (arr.length == 0) {
            return false;
        }
        if (arr[0] == x) {
            return true;
        }
        int[] smallArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallArr[i - 1] = arr[i];
        }
        return checkNumber(smallArr, x);
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
        System.out.println(checkNumber(arr, x));

    }
}
