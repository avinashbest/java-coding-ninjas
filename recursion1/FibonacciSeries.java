package recursion1;

import java.util.Scanner;

public class FibonacciSeries {

    public static int fibonacciNumber(int n) {
        if ((n == 0) || (n == 1)) {
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumber(i) + "\t");
        }
    }
}
