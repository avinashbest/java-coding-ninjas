package dynamicProgramming1;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumber {
    /*
     * Memoization = Applying Recursion + Storing somewhere
     * */
    private static int fibonacci(int n, int[] dp) {
        if (n == 0 || n == 1)
            return n;

        int ans1, ans2;
        if (dp[n - 1] == -1) {
            ans1 = fibonacci(n - 1, dp);
            dp[n - 1] = ans1;
        } else {
            ans1 = dp[n - 1];
        }

        if (dp[n - 2] == -1) {
            ans2 = fibonacci(n - 2, dp);
            dp[n - 2] = ans2;
        } else {
            ans2 = dp[n - 2];
        }

        return ans1 + ans2;
    }

    private static int fib(int n) {
        if (n == 0 || n == 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    /*
     * Iterative Dynamic Programming
     * */
    private static int fibonacciIterative(int n) {
        // Base case
        if (n == 0 || n == 1)
            return n;
        // if we want 6 fibonacci no. we want 6 index for 6 index we need 7 sized array.
        int[] dp = new int[n + 1];
        // Initialize first known values.
        dp[0] = 0;
        dp[1] = 1;
        // Filling the rest dp array
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1); // Filling arrays element with -1

        long startTime = System.currentTimeMillis();
        int answer = fib(n);
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken = " + (endTime - startTime) + "ms without DP");

        startTime = System.currentTimeMillis();
        answer = fibonacci(n, dp);
        endTime = System.currentTimeMillis();
        System.out.println("Time Taken = " + (endTime - startTime) + "ms with DP");

        startTime = System.currentTimeMillis();
        answer = fibonacciIterative(n);
        endTime = System.currentTimeMillis();
        System.out.println("Time Taken = " + (endTime - startTime) + "ms with Iterative DP");

        System.out.println("Answer = " + answer);
    }
}
