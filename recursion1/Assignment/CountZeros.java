package recursion1.Assignment;

/*Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
Input Format :
Integer N
Output Format :
Number of zeros in N
Constraints :
0 <= N <= 10^9
Sample Input 1 :
10204
Sample Output 1 :
2
Sample Input 2 :
708000
Sample Output 2 :
4*/
public class CountZeros {

    public static int countZeros(int n) {
        /*base case*/
        if (n < 10) {
            if (n == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        /*smaller problem*/
        int lastDigit = n % 10;
        int smallAnswer = countZeros(n / 10);
        /*basic calculation*/
        if (lastDigit == 0) {
            return 1 + smallAnswer;
        } else {
            return smallAnswer;
        }
    }

    public static void main(String[] args) {
        System.out.println(countZeros(1010));
    }
}
