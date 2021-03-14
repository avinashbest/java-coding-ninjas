package gettingStarted;

import java.util.Scanner;

public class relationalOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int j = scan.nextInt();

        boolean isEqual = (i == j);
        boolean isNotEqual = (i != j);
        boolean isGreater = (i > j);
        boolean isGreaterEqual = (i >= j);
        boolean isLess = (i < j);
        boolean isLessEqual = (i <= j);

        System.out.println("Is Equal " + isEqual);
        System.out.println("Is Not Equal " + isNotEqual);
        System.out.println("Is Greater " + isGreater);
        System.out.println("Is Greater Equal " + isGreaterEqual);
        System.out.println("Is Less " + isLess);
        System.out.println("Is Less Equal " + isLessEqual);
    }
}
