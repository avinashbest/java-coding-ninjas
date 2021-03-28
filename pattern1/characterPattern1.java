package pattern1;

import java.util.Scanner;

//for N = 4 print the pattern
//        A	B C	D
//        A	B C	D
//        A	B C	D
//        A	B C	D
public class characterPattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print((char) ('A' + j - 1) + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
