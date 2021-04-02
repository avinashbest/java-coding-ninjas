package arrays.Assignment;

import java.util.Scanner;

/*You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.
Note:
You need to change in the given array/list itself. Hence, no need to return or print anything.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains an integer 'N' representing the size of the array/list.
Second line contains 'N' single space separated integers(all 0s and 1s) representing the elements in the array/list.
Output format :
For each test case, print the sorted array/list elements in a row separated by a single space.
Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
7
0 1 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1 1
Sample Input 2:
2
8
1 0 1 1 0 1 0 1
5
0 1 0 1 0
Sample Output 2:
0 0 0 1 1 1 1 1
0 0 0 1 1 */
public class SortZeroOne {
    /*The algorithm will look something like this:
1. Keep two pointers ‘zeroPos’ for the next location of a 0, and ‘current’ for the current element that we’re iterating through. Both of them will be initialised to 0.
02. Start iterating through the array. If we encounter a 1, we’ll do nothing. Just increase ‘current’ by 1. If we counter a 0, we need to push this zero to the front of the array. More specifically, we need to send this zero to zeroPos and bring zeroPos’ element to the current location. So basically we do swap(arr[zeroPos], arr[current]) . And then we increase ‘current’ by 1 increase ‘zeroPos’ by 1 too.*/

    public static void sortZeroOne(int[] arr) {
        int nextZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero += 1;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while (testCases != 0) {
            int size = scan.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }
            sortZeroOne(arr);
            printArray(arr);
            testCases--;
        }
    }
}
