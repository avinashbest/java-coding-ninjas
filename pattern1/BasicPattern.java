package pattern1;

import java.util.Scanner;

// for N = 4 print the pattern
//  *	*	*	*
//  *	*	*	*
//  *	*	*	*
//  *	*	*	*
public class BasicPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print("*\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
