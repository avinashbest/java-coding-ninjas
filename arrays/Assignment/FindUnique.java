package arrays.Assignment;

import java.util.Scanner;

/*Find Unique

You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 Note:
Unique element is always present in the array/list according to the given condition.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the unique element present in the array.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1
Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
10*/
public class FindUnique {
    /*Approach 3:  The best solution is to use XOR. Taking XOR of all the elements present in the
array, gives us the unique element present in the array.This approach uses 2 properties of XOR:
1. XOR of a number with itself is 0.
2. XOR of a number with 0 is number itself.
Let us understand this approach with the help of an example:
arr[]= 2 3 1 6 3 6 2
Taking their xor:
Answer = 2 ^ 3 ^ 1 ^ 6 ^ 3 ^ 6 ^ 2
Now XOR is associative and commutative, so I can write it as:
Answer = (2^2) ^ (3^3) ^ 1 ^ (6 ^ 6)
= 0 ^ 0 ^ 1 ^ 0
= 1
Time complexity of this solution is O(n).
*/

    public static int findUnique(int[] arr) {
//        Answer=0
        int result = 0;
//        For i=0 to i less than size:
        for (int j : arr) {
//            answer=answer xor input[i]
            result = result ^ j;
        }
//        Return answer
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while (testCases != 0) {
            int size = scan.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println(findUnique(arr));
            testCases--;
        }
    }
}
