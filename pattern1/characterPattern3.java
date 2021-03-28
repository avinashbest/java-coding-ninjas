package pattern1;

import java.util.Scanner;

//for N = 4 print the pattern
//        A
//        B	B
//        C	C C
//        D	D D	D
public class characterPattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print((char) ('A' + i - 1) + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
