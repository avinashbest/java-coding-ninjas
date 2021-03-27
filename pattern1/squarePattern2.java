package pattern1;
// for N = 4 print the pattern
//        1	2 3	4
//        1	2 3	4
//        1	2 3	4
//        1	2 3	4
import java.util.Scanner;

public class squarePattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(j + "\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
