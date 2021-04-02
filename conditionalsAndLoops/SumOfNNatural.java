package conditionalsAndLoops;

import java.util.Scanner;

public class SumOfNNatural {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1; // Next number to be added
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println("Sum of " + n + " natural numbers is " + sum);
    }
}
