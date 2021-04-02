package conditionalsAndLoops;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > b) {
            System.out.println("First Number is Greater");
        } else if (b > a) {
            System.out.println("Second number is greater");
        } else {
            System.out.println("Both are Equal");
        }
    }
}
