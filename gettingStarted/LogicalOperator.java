package gettingStarted;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
//        logical AND
        boolean isALargest = ((a >= b) && (a >= c));
        System.out.println(isALargest);
//        logical OR
        System.out.println((a >= b) || (a >= c));
//        logical NOT
        System.out.println(!(a >= b));
    }
}
