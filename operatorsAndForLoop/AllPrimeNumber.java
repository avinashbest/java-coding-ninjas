package operatorsAndForLoop;

import java.util.Scanner;

/*
All Prime Numbers

Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
*/
public class AllPrimeNumber {
    public static void main(String[] args) {
//        Take the number as input from the user.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        /* Now, initialize a loop from i=2 to n, and for each i check whether it is prime or not, initially take isPrime (to denote whether a number is prime or not) as true which means we are assuming that the number is prime, initially. */
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            /*Now, for each i we create another loop in this to check if that number is prime or not. If it is not prime then make flag as false and continue to next i otherwise if flag remains true, then print it.*/
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + "\t");
            }
        }
    }
}
