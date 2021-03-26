package conditionalsAndLoops.Assignment;

import java.util.Scanner;
/*
Write a program to print multiplication table of n
Input Format :
A single integer, n
Output Format :
First 10 multiples of n each printed in new line
Constraints :
0 <= n <= 10,000
Sample Input 1 :
2
Sample Output 1 :
2
4
6
8
10
12
14
16
18
20
Sample Input 2 :
5
Sample Output 2 :
5
10
15
20
25
30
35
40
45
5
 */

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(i * n);
            i++;
        }
    }
}
