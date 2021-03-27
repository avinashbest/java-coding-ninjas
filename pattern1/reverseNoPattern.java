package pattern1;

import java.util.Scanner;

//for N = 4 print the pattern
//        1
//        2	1
//        3	2 1
//        4	3 2	1
public class reverseNoPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            int value = i;
            while (j <= i) {
                System.out.print(value + "\t");
                j++;
                value--;
            }
            System.out.println();
            i++;
        }
    }
}
