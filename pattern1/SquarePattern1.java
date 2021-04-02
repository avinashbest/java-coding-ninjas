package pattern1;

import java.util.Scanner;

//for N = 4 print the pattern
//1	1 1	1
//2	2 2	2
//3	3 3	3
//4	4 4	4
public class SquarePattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(i + "\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
