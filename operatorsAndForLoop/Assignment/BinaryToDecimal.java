package operatorsAndForLoop.Assignment;

import java.util.Scanner;

/*Binary to decimal

Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7*/

/*How to approach?
A binary number can be converted into a decimal number by picking up the last digit and then
multiplying each digit with 2 raised to the power of its place value and then adding them in a
continuous manner.
For example, in the case of 1100, start picking up the last digit multiplied by 2’s respective
powers and add them up.So,
1100=0*2^(0)+0*2^(1)+1*2^(2)+1*2^(3)=0+0+4+8=12*/
public class BinaryToDecimal {
    public static void main(String[] args) {
//        Take the number as input from the user.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        Now, initialize the decimal number (this will be our running sum) by 0 and take another variable pow for powers of 2 and initialize it with 1.
        int decimal = 0, power = 1;
//        Now, run a loop until the number is greater than 0.
        while (n != 0) {
//            In each iteration, take the last digit by taking modulo 10 of the number. Find the decimal number by maintaining a running sum of multiplication of last digit and pow.
            int lastDigit = n % 10;
            decimal = decimal + lastDigit * power;
//            In each iteration multiply pow by 2 and divide num by 10.
            power *= 2;
            n /= 10;
        }
        System.out.println(decimal);
    }
}
