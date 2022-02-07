package dynamicProgramming1;

import java.util.Scanner;

/*
Stair Case

A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count and return all possible ways in which the child can run-up to the stairs.
Input format :
The first and the only line of input contains an integer value, 'n', denoting the total number of steps.
Output format :
Print the total possible number of ways.
 Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec
Sample Input 1:
4
Sample Output 1:ns an integer value, 'n', denoting the total numbe
7
Sample Input 2:
10
Sample Output 2:
274
* */
public class StairCase {

    private static long stairCase(int n) {
        var ways = new long[n + 1]; // DP array

        if (n == 0) return 1;

        if (n == 1 || n == 2) return n;

        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 2;

        for (int i = 3; i <= n; i++)
            ways[i] = ways[i - 1] + ways[i - 2] + ways[i - 3];

        return ways[n];
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(stairCase(n));
    }
}
