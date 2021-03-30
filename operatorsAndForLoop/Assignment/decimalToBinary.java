package operatorsAndForLoop.Assignment;

import java.util.Scanner;

/*Decimal to Binary

Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note : The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.

Input format :
Integer N
Output format :
Corresponding Binary number (long)
Constraints :
0 <= N <= 10^5
Sample Input 1 :
12
Sample Output 1 :
1100
Sample Input 2 :
7
Sample Output 2 :
111*/
/*How to approach?
A decimal number can be converted into a binary number by picking up the number and then
taking its remainder, after dividing it by 2, then start adding up the remainder by multiplying it
by its place value to convert the binary representation into an integer.
For example in case of 12, start picking up the remainder when 12 is divided by 2 and then
adding it by multiplying by its place value.
12 = 12%2 = 0*1 = 0
12/2 = 6%2 = 0*10 = 0
6/2 = 3%2 = 1*100 = 100
3/2 = 1%2 = 1*1000 = 1000
1/2 = 0. We will terminate the algorithm, when number becomes 0.
So, decimal number = 1000+100+0+0 = 1100*/
public class decimalToBinary {
    public static void main(String[] args) {
//        Take the number as input from the user.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        Now, initialize binary number by 0, and place value by 1
        long binary = 0, multiplier = 1;
//        Run a while loop until the number is greater than 0.
        while (n != 0) {
//            In each iteration of this loop, find the remainder when divided by 2, multiply it by its place value and then add it to the binary number.
            int remainder = n % 2;
            binary = binary + remainder * multiplier;
//            After this, in each iteration, multiply the place value by 10 and divide the number by 2.
            multiplier *= 10;
            n /= 2;
        }
        System.out.println(binary);
    }
}
