package operatorsAndForLoop.Assignment;

import java.util.Scanner;

/*Reverse of a number

Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.


Input format :
Integer N
Output format :
Corresponding reverse number
Constraints:
0 <= N < 10^8
Sample Input 1 :
1234
Sample Output 1 :
4321
Sample Input 2 :
1980
Sample Output 2 :
891*/
public class ReverseOfNumber {
    public static void main(String[] args) {
//        Take the number N as input from the user.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        Initialize the reverse number from 0
        int reverseNumber = 0;
        /*Run a while loop until n becomes 0 and in each iteration pick up the last digit of the number by taking modulo 10 and make it as the first digit of reverse number by multiplying the already existing reverse number by 10 and then adding the last digit obtained to it and pass n as n/10 to the next iteration.*/
        while (n != 0) {
            int lastDigit = n % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            n = n / 10;
        }
//        Print the reverse number.
        System.out.println(reverseNumber);
    }
}
