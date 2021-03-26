package conditionalsAndLoops.Assignment;

import java.util.Scanner;

/*
Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
Input format :
 Integer N
Output format :
Sum_of_Even_Digits Sum_of_Odd_Digits
(Print first even sum and then odd sum separated by space)
Constraints
0 <= N <= 10^8
Sample Input 1:
1234
Sample Output 1:
6 4
Sample Input 2:
552245
Sample Output 2:
8 15
Explanation for Input 2:
For the given input, the even digits are 2, 2 and 4 and if we take the sum of these digits it will come out to be 8(2 + 2 + 4) and similarly, if we look at the odd digits, they are, 5, 5 and 5 which makes a sum of 15(5 + 5 + 5). Hence the answer would be, 8(evenSum) <single space> 15(oddSum)
 */
public class sumOfEvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int temp;
//        Variables to store the sum of even number and odd number in the digits
        int evenSum = 0, oddSum = 0;

        while (n != 0) {
//            taking the last digits of the input number
            temp = n % 10;
//            calculating the evenSum and oddSum
            if (temp % 2 == 0) {
                evenSum += temp;
            } else {
                oddSum += temp;
            }
//            excluding the last digits from the input number
            n = n / 10;
        }
        System.out.println(evenSum + " " + oddSum);
    }
}
