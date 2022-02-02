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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1); // Filling arrays element with -1
        int answer = fibonacci(n, dp);
        System.out.println(answer);
    }
}
