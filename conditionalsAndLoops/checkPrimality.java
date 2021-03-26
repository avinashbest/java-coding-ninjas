package conditionalsAndLoops;

import java.util.Scanner;

public class checkPrimality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int divisor = 2;
        boolean flag = true;
        while (divisor <= Math.sqrt(n)) {
            if (n % divisor == 0) {
                flag = false;
                break;
            }
            divisor += 1;
        }

        if (flag) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Composite Number");
        }
    }
}
