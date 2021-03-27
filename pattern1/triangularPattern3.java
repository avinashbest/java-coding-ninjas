package pattern1;

import java.util.Scanner;
//for N = 4 print the pattern
//        1
//        2	3
//        4	5 6
//        7	8 9	10
public class triangularPattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        int t = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(t + "\t");
                j++;
                t++;
            }
            System.out.println();
            i++;
        }
    }
}
