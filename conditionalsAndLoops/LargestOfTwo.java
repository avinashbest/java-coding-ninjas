package conditionalsAndLoops;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);

        } else {
            System.out.println(a + " is smaller than " + b);
        }
    }
}
