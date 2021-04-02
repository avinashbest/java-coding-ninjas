package arrays.Assignment;

import java.util.Scanner;

/*Find Duplicate

You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
Note :
Duplicate number is always present in the given array/list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the duplicate element in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
9
0 7 2 5 4 7 1 3 6
Sample Output 1:
7
Sample Input 2:
2
5
0 2 1 3 1
7
0 3 1 5 4 3 2
Sample Output 2:
1
3*/
public class FindDuplicate {
    /*A better solution for this problem can be by using XOR operator. Using XOR operator, we can solve this problem in one traversal only. The following facts about XOR operation will be useful for this question:
1. If we XOR a number by itself, even number of times then it will give you 0.
2. If we XOR a number with itself, odd number of times, then it will give you the number
itself.
3. Also XOR of a number with 0 gives you that number again.
So, if we take XOR of all the elements present in the array with every element in the range 0 to n-2, then all the elements of that array except the duplicate element are XORed 2 times and hence, their resultant is 0. But the duplicate element is XORed 3 times, hence, its resultant is the number itself. Hence, you will get you answer as the duplicate number present in the array.
For example, if you are given with n=5 and let us say array is 0 1 3 2 2, then according to this approach, we have to XOR all elements present in the array with every element in the range 0 to 3.
Answer = (0^1^3^2^2)^(0^1^2^3)
As XOR operation is associative and commutative, so, by rearranging
Answer = (0^0) ^ (1^1) ^ (2^2^2) ^ (3^3)
= 0 ^ 0 ^ 2 ^ 0
= 2*/

    public static int findDuplicate(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            result = result ^ i;
        }

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
            System.out.println(findDuplicate(arr));
            testCases--;
        }
    }
}
