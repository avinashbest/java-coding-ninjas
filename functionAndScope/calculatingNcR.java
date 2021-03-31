package functionAndScope;

import java.util.Scanner;

//nCr = n! / (r! * (n-r)!)
public class calculatingNcR {
    //    function to calculate the factorial of a number
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();

        int nFactorial = factorial(n);
/*
        int nFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }
*/
        int rFactorial = factorial(r);
/*
        int rFactorial = 1;
        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }
*/
        int nMinusRFactorial = factorial(n - r);
/*
        int nMinusRFactorial = 1;
        for (int i = 1; i <= (n - r); i++) {
            nMinusRFactorial *= i;
        }
*/
        int nCr = nFactorial / (rFactorial * nMinusRFactorial);
        System.out.println(nCr);

    }
}
