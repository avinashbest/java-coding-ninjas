package recursion1;

import java.util.Scanner;


public class SumOfNaturalNo {

    public static int sumOfNaturalNo(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNo(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sumOfNaturalNo(n));
    }
}
