package pattern1;

import java.util.Scanner;

//for N = 4 print the pattern
//        1
//        2	3
//        3	4 5
//        4	5 6	7
public class triangularPattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            int t = i;
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
