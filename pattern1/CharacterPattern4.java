package pattern1;

import java.util.Scanner;
//for N = 4 print the pattern
//        A
//        B	C
//        C	D E
//        D	E F	G

public class CharacterPattern4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            char startingPattern = (char) (('A' + i) - 1);
            int j = 1;
            while (j <= i) {
                System.out.print((char) ((startingPattern + j) - 1) + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
