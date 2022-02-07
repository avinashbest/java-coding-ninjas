package dynamicProgramming1;

/*
Minimum Number Of Squares

Given an integer N, find and return the count of minimum numbers required to represent N as a sum of squares.
That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. The output will be 1, as 1 is the minimum count of numbers required to represent N as sum of squares.
Input format :
The first and the only line of input contains an integer value, 'N'.
 Output format :
Print the minimum count of numbers required.
Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec
Sample Input 1 :
12
Sample Output 1 :
3
Explanation of Sample Output 1 :
12 can be represented as :
A) (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1)

B) (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1)  + (2 ^ 2)

C) (1^1) + (1^1) + (1^1) + (1^1) + (2 ^ 2) + (2 ^ 2)

D) (2 ^ 2) + (2 ^ 2) + (2 ^ 2)

As we can see, the output should be 3.
Sample Input 2 :
9
Sample Output 2 :
1
*/
public class MinimumNumberOfSquaresToRepresentN {

    private static int minSquareIterative(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int minAns = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                int curAns = dp[i - (j * j)];
                if (minAns > curAns)
                    minAns = curAns;
            }
            dp[i] = 1 + minAns;
        }
        return dp[n];
    }

    private static int minSquareRecursive(int n) {
        if (n < 0)
            return -1; // Invalid Input

        if (n <= 3)
            return n;


        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= n; i++) {
            int minAns = Integer.MAX_VALUE;

            int eachPossibility = 1;
            int sqr = eachPossibility * eachPossibility;

            while (sqr <= i) {
                int curAns = dp[n - sqr];
                minAns = 1 + Math.min(minAns, curAns);

                eachPossibility++;
                sqr = eachPossibility * eachPossibility;
            }
            dp[i] = minAns;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(minSquareIterative(12));
        System.out.println(minSquareIterative(9));

        System.out.println(minSquareRecursive(12));
        System.out.println(minSquareRecursive(9));
    }
}
