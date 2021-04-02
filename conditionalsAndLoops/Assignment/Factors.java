package conditionalsAndLoops.Assignment;

import java.util.Scanner;

//Write a program to print all the Factors of a number other than 1 and the number itself.
//        Input Format :
//        A single integer, n
//        Output Format :
//        All the Factors of n excluding 1 and the number itself
//        Constraints :
//        0 <= n <= 10,000
//        Sample Input 1 :
//        8
//        Sample Output 1 :
//        2 4
//        Sample Input 2 :
//        11
//        Sample Output 2 :
//        Explanation of Sample Output 2 :
//        No output as 11 is prime having Factors as 1 and 11 only
public class Factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int divisor = 2;
        while (divisor <= n - 1) {
            if (n % divisor == 0) {
                System.out.print(divisor + " ");
            }
            divisor++;
        }
    }
}
