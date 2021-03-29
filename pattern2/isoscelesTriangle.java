package pattern2;

import java.util.Scanner;
/*
for N = 4 print the pattern
          1
      1   2   1
  1   2   3   2   1
1 2   3   4   3   2   1
*/

public class isoscelesTriangle {
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
//            increasing number
            j = 1;
            while (j <= i) {
                System.out.print(j + "\t");
                j++;
            }
//            decreasing number
            j = 1;
            while (j <= i - 1) {
                System.out.print(j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
