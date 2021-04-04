package searchingAndSorting;

import java.util.Scanner;

/*You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output Format :
For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec
Sample Input 1 :
1
5
1 3 4 7 11
4
2 4 6 13
Sample Output 1 :
1 2 3 4 4 6 7 11 13
Sample Input 2 :
2
3
10 100 500
7
4 7 9 25 30 300 450
4
7 45 89 90
0
Sample Output 2 :
4 7 9 10 25 30 100 300 450 500
7 45 89 90*/
public class MergeTwoSortedArrays {

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                k++;
                i++;
            } else {
                result[k] = arr2[j];
                k++;
                j++;
            }
        }
        /* if the any of the array is over then we have to copy the rest array element to the result[] */
        while (i < arr1.length) {
            result[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            result[k] = arr2[j];
            k++;
            j++;
        }
        return result;
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
            int[] mergeArray = mergeTwoSortedArray(arr1, arr2);
            printArray(mergeArray);
            testCases--;
        }
    }
}
