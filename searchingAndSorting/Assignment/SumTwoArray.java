package searchingAndSorting.Assignment;

import java.util.Scanner;

/*Sum of Two Arrays

Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.
Note:
The sizes N and M can be different.
Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list. Place 0 at the 0th index if there is no carry.

No need to print the elements of the output array/list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.
Third line contains an integer 'M' representing the size of the second array/list.
Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output Format :
For each test case, print the required sum of the arrays/list in a row, separated by a single space.
Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
3
6 2 4
3
7 5 6
Sample Output 1:
1 3 8 0
Sample Input 2:
2
3
8 5 2
2
1 3
4
9 7 6 1
3
4 5 9
Sample Output 2:
0 8 6 5
1 0 2 2 0 */
public class SumTwoArray {

    public static void sumOfTwoArray(int[] arr1, int[] arr2, int[] output) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        int k = Math.max(arr1.length, arr2.length);

        while (i >= 0 && j >= 0) {
            int sum = arr1[i] + arr2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        while (i >= 0) {
            int sum = arr1[i] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            k--;
        }
        output[0] = carry;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static int[] takeArrayInput() {
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
        int testCases = scan.nextInt();
        while (testCases != 0) {
            int[] arr1 = takeArrayInput();
            int[] arr2 = takeArrayInput();
            int size = Math.max(arr1.length, arr2.length);
            int[] output = new int[size + 1];
            sumOfTwoArray(arr1, arr2, output);
            printArray(output);
            testCases--;
        }
    }
}
