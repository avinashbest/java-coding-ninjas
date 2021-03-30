package operatorsAndForLoop.Assignment;

import java.util.Scanner;

/*Square Root (Integral)

Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.
Input format :
Integer N
Output Format :
Square root of N (integer part only)
Constraints :
0 <= N <= 10^8
Sample Input 1 :
10
Sample Output 1 :
3
Sample Input 2 :
4
Sample Output 2 :
2*/

/*How to approach?
You are given a number N, for which you have to find its integral square root, so, take a variable
output which will be your final answer, initialize this variable with 0 and loop until
output*output becomes greater than N.
- Take the number N, as input from the user.
- Now, initialize your output by 0.
- Run a while loop till the output*output becomes greater than N.
- In each iteration of this loop, increment the output by 1.
- The final output will be 1 less than the output obtained.

Pseudo Code for this problem:
Input = N
output=0
While output*output is less than equal to N:
output=output+1
print(output-1)
*/
public class squareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int output = 0;
        while (output * output <= n) {
            output = output + 1;
        }
        System.out.println(output - 1);
    }
}
