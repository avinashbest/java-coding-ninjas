package conditionalsAndLoops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1;
//        Printing n natural numbers
        while (i <= n) {
            System.out.println(i);
            i = i + 1;
        }

//        while (i <= 5) {
//            System.out.println("Hello");
//            i = i + 1;
//        }
    }
}
