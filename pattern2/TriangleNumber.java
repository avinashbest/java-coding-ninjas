package pattern2;

import java.util.Scanner;

/*
for N = 4 print the pattern
            1
        2   3   2
    3   4   5   4   3
4   5   6   7   6   5   4
*/
public class TriangleNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print("\t");
                spaces++;
            }
            int temp = i;
            int j = 1;
            while (j <= i) {
                System.out.print(temp + "\t");
                j++;
                temp++;
            }
            temp--;
            int k = 1;
            while (k < i) {
                temp--;
                System.out.print(temp + "\t");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
