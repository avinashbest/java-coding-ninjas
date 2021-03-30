package operatorsAndForLoop;

import java.util.Scanner;

/*
Nth Fibonacci Number

Nth term of fibonacci series F(n) is calculated using following formula -
    F(n) = F(n-1) + F(n-2),
    Where, F(1) = F(2) = 1
Provided N you have to find out the Nth Fibonacci Number.
Input Format :
Integer n
Output Format :
Nth Fibonacci term i.e. F(n)
Constraints:
1 <= n <= 25
Sample Input 1:
4
Sample Output 2:
3
Sample Input 1:
6
Sample Output 2:
8
*/
public class nthFibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int firstTerm = 1;
        int secondTerm = 1;
        int thirdTerm;

        for (int i = 1; i < input; i++) {
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        System.out.println(firstTerm);
    }
}
