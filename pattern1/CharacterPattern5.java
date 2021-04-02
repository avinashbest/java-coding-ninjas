package pattern1;

import java.util.Scanner;

//for N = 4 print the pattern
//        D
//        C	D
//        B	C D
//        A	B C	D
public class CharacterPattern5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            char startingPattern = (char) ('A' + n - i);
            while (j <= i) {
                System.out.print(startingPattern + "\t");
                startingPattern = (char) (startingPattern + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
