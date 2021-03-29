package pattern2;

import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
//        first half of the pattern
        int n1 = N / 2 + 1;
        int i = 1;
        while (i <= n1) {
            int spaces = 1;
            while (spaces <= (n1 - i)) {
                System.out.print("\t");
                spaces++;
            }
            int j = 1;
            while (j <= (2 * i - 1)) {
                System.out.print("*\t");
                j++;
            }
            i++;
            System.out.println();
        }
//        second half of the pattern
        i = N - n1;
        while (i >= 1) {
            int spaces = 1;
            while (spaces <= (n1 - i)) {
                System.out.print("\t");
                spaces++;
            }
            int j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
