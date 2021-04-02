package conditionalsAndLoops;

import java.util.Scanner;

public class ConditionalAndOperator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (a != b) {
            System.out.println("Not Equal");
        } else {
            System.out.println("Equal");
        }

        if (a > 0 && b > 0) {
            System.out.println("Both are positive");
        } else {
            System.out.println("Both are not positive");
        }

        if (a > 0 || b > 0) {
            System.out.println("One is positive");

        } else {
            System.out.println("One is negative");
        }
    }
}
