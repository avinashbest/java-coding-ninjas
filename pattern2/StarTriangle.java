package pattern2;

import java.util.Scanner;

/*
for N = 4 print the pattern
            *
        *   *   *
    *   *   *   *   *
*   *   *   *   *   *   *
*/
public class StarTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
//            number of spaces to be printed
            while (j <= n - i) {
                System.out.print("\t");
                j++;
            }
//            star printing loop
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
