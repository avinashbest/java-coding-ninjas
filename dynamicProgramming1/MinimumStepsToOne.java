package dynamicProgramming1;

/*
Given a positive integer 'n', find and return the minimum number of steps that 'n' has to take to get reduced to 1. You can perform any one of the following 3 steps:
1.) Subtract 1 from it. (n = n - ) ,
2.) If its divisible by 2, divide by 2.( if n % 2 == 0, then n = n / 2 ) ,
3.) If its divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3 ).
Write brute-force recursive solution for this.
Input format :
The first and the only line of input contains an integer value, 'n'.
Output format :
Print the minimum number of steps.
Constraints :
1 <= n <= 200

Time Limit: 1 sec
Sample Input 1 :
4
Sample Output 1 :
2
Explanation of Sample Output 1 :
For n = 4
Step 1 :  n = 4 / 2  = 2
Step 2 : n = 2 / 2  =  1
Sample Input 2 :
7
Sample Output 2 :
3
Explanation of Sample Output 2 :
For n = 7
Step 1 :  n = 7 - 1 = 6
Step 2 : n = 6  / 3 = 2
Step 3 : n = 2 / 2 = 1  */
public class MinimumStepsToOne {

    /*
     * Recursive solution
     * */
    private static int minStepsTo1(int n) {
        if (n == 1) return 0;

        int subtractOne;
        int divideByTwo = Integer.MAX_VALUE;
        int divideByThree = Integer.MAX_VALUE;

        subtractOne = minStepsTo1(n - 1);

        if (n % 2 == 0)
            divideByTwo = minStepsTo1(n / 2);

        if (n % 3 == 0)
            divideByThree = minStepsTo1(n / 3);

        return 1 + Math.min(subtractOne, Math.min(divideByTwo, divideByThree));
    }

    /*
     * DP Solution
     * */
    private static int minStepsTo1_DP(int n) {
        if (n == 1) return 0;

        int[] dp = new int[n + 1];

        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            int subtractOne;
            int divideByTwo = Integer.MAX_VALUE;
            int divideByThree = Integer.MAX_VALUE;

            subtractOne = dp[i - 1];

            if (i % 2 == 0)
                divideByTwo = dp[i / 2];

            if (i % 3 == 0)
                divideByThree = dp[i / 3];

            dp[i] = 1 + Math.min(subtractOne, Math.min(divideByTwo, divideByThree));
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(minStepsTo1(4));
        System.out.println(minStepsTo1(7));

        System.out.println(minStepsTo1_DP(4));
        System.out.println(minStepsTo1_DP(7));
    }
}
