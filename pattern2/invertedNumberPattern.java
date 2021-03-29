package pattern2;

import java.util.Scanner;

public class invertedNumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
//        int startPattern = n;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
//                System.out.print(startPattern + "\t");
                System.out.print((n - i + 1) + "\t");
                j++;
            }
//            startPattern--;
            System.out.println();
            i++;
        }
    }
}
