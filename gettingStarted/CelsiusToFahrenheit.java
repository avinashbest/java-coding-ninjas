package gettingStarted;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fahrenheit = scan.nextInt();
//        int celsius = (5 / 9) * (fahrenheit - 32); //Integer / Integer = Integer i.e, 5/9 = 0 which multiplied by anything gives o/p = 0
//        int celsius = (5 * (fahrenheit - 32) / 9);
        int celsius = (int) ((5.0 / 9) * (fahrenheit - 32)); //Explicit Type casting... double / integer = double which cannot be done by compiler so we need to explicitly type-cast the result into integer

        System.out.println(celsius);
    }
}
