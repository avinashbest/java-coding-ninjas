package operatorsAndForLoop.Assignment;

import java.util.Scanner;

/*Terms of AP

Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17*/
public class TermOfAP {
    public static void main(String[] args) {
//        Take the number x as input from the user.
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
//        Initialize the count of numbers from 1 and N from 1.
        int count = 1, n = 1;
//        Run a loop while count is less than or equal to x.
        while (count <= x) {
//            Calculate the number to printed as 3*N+2?
            int num = 3 * n + 2;
//            If number is not divisible by 4 print it and increment the count.
            if (num % 4 != 0) {
                System.out.print(num + "\t");
                count++;
            }
            n++;
        }
    }
}
