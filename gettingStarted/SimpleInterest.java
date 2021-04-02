package gettingStarted;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        //Taking User Input form the console input stream
        Scanner scan = new Scanner(System.in);

        int principal = scan.nextInt();
        int rate = scan.nextInt();
        int time = scan.nextInt();

        int SI = (principal * rate * time) / 100;

        System.out.println(SI);
    }
}
