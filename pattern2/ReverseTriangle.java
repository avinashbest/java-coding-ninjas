package pattern2;

import java.util.Scanner;

//for N = 4 print the pattern
//              *
//          *   *
//      *   *   *
//  *   *   *   *
public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
//            Number of spaces to be printed n - i
            while (j <= n - i) {
                System.out.print("\t");
                j++;
            }
            j = 1;
//            Number of stars to be printed i
            while (j <= i) {
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
