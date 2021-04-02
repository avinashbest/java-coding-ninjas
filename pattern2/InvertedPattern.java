package pattern2;

import java.util.Scanner;

//for N = 4 print the pattern
//        *	* *	*
//        *	* *
//        *	*
//        *
public class InvertedPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
