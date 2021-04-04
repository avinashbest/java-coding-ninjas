
import java.util.Scanner;

public class CodeChefAprilChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long testCases = scan.nextInt();

        while (testCases != 0) {
            long n = scan.nextLong();
            long sum = (n / 4) * 44;
            int remainder = (int) (n % 4);

            if (n >= 4) {
                if (remainder == 0) {
                    sum += 16;
                }
                if (remainder == 1) {
                    sum += 32;
                }
                if (remainder == 2) {
                    sum += 44;
                }
                if (remainder == 3) {
                    sum += 55;
                }
                System.out.println(sum);
            } else {
                int result = 0;
                if (remainder == 1) {
                    result = 20;//n = 1 =>((2 + 6 + 3 + 4 + 5)
                }
                if (remainder == 2) {
                    result = 36;//n = 2 =>((1 + 6 + 3 + 4 + 5)*n)-n
                }
                if (remainder == 3) {
                    result = 51;//n = 3 =>((2 + 6 + 1 + 4 + 5)*n) - n
                }
                System.out.println(result);
            }
            testCases--;
        }
    }
}
