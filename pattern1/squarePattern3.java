package pattern1;

import java.util.Scanner;

//for N = 4 print the pattern
//        4 3 2	1
//        4	3 2	1
//        4	3 2	1
//        4	3 2	1
public class squarePattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(n - j + 1 + "\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
