package searchingAndSorting;

import java.util.Scanner;

/*Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Insertion Sort'.
 Note:
Change in the input array/list itself. You don't need to return or print the elements.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the elements of the array/list in sorted order separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Sample Input 2:
2
5
9 3 6 2 0
4
4 3 2 1
Sample Output 2:
0 2 3 6 9
1 2 3 4 */
public class InsertionSort {

    public static void insertionSort(int[] arr) {
/*
    INSERTION-SORT(A)
  1.      for j = 2 to A.length
  2.        key = A[j]
  3.        // Insert A[j] into sorted A[1 . . . j-1]
  4.        i = j - 1
  5.        while i > 0 AND A[i] > key
  6.              A[i+1] = A[i]
  7.              i = i - 1
  8.        A[i+1] = key
*/
        int i = 1, key;
        for (int j = 1; j < arr.length; j++) {
            key = arr[j];
            i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
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
            int[] arr = takeArrayInput();
            insertionSort(arr);
            printArray(arr);
            testCases--;
        }
    }
}
