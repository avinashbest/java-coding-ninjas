package functionAndScope;

import java.util.Scanner;

//nCr = n! / (r! * (n-r)!)
public class CalculatingNcR {
    //    function to calculate the factorial of a number
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    //    function to calculate nCr of input n and r
    public static int nCr(int n, int r) {
        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nMinusRFactorial = factorial(n - r);
        return nFactorial / (rFactorial * nMinusRFactorial);
    }

    //    main function or driver code
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();

        int result = nCr(n, r);
        System.out.println(result);
/*
        int nFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }
*/
/*
        int rFactorial = 1;
        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }
*/
/*
        int nMinusRFactorial = 1;
        for (int i = 1; i <= (n - r); i++) {
            nMinusRFactorial *= i;
        }
*/

    }
}
