package twoDimensionalArrays.Assignment;

import java.util.Scanner;

/*For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
Input format:
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains a single integer value, 'N' representing the 'rows' and 'columns' for the two-dimensional square matrix.
Second line onwards, the next 'N' lines or rows represent the ith row values.
Each of the ith row constitutes 'N' column values separated by a single space.
Output format:
For each test case, print the single integer denoting the sum.
Output for every test case will be printed in a separate line.
Constraints:
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1sec
Sample input 1:
1
3
1 2 3
4 5 6
7 8 9
Sample Output 1:
45
Explanation for Sample Output 1:
The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4.
The first-diagonal elements are 1, 5 and 9.
The second-diagonal elements are 3, 5 and 7.
We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.
Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
Sample input 2:
2
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
4
1 2 3 10
4 5 6 11
7 8 9 12
13 14 15 16
Sample Output 2:
273
136*/
public class TotalSumOnBoundariesAndDiagonals {

    public static int getFirstDiagonalSum(int[][] arr, int dimension) {
        int currentRow = 0;
        int currentColumn = 0;
        /*traversing over the matrix when i and j are equal to calculate the diagonal sum*/
        int diagonalSum = 0;
        while (currentRow < dimension && currentColumn < dimension) {
            diagonalSum += arr[currentRow][currentColumn];
            currentRow++;
            currentColumn++;
        }
        return diagonalSum;
    }

    public static int getSecondDiagonalSum(int[][] arr, int dimension) {
        int currentRow = 0;
        int currentColumn = dimension - 1;
        /*traversing over the matrix in reverse as well as normal order to get the 2nd diagonal element sum*/
        int diagonalSum = 0;
        while (currentRow < dimension && currentColumn < dimension) {
            diagonalSum += arr[currentRow][currentColumn];
            currentRow++;
            currentColumn--;
        }
        return diagonalSum;
    }

    public static int getBoundarySum(int[][] arr, int dimension) {
        /*calculating the sum of the element which are the boundary elements except the diagonal element*/
        int sum = 0;
        for (int i = 1; i < (dimension - 1); i++) {
            sum += arr[0][i]; /*upper side*/
            sum += arr[dimension - 1][i];/*lower side*/
            sum += arr[i][0];/*left side*/
            sum += arr[i][dimension - 1];/*right side*/
        }
        return sum;
    }

    public static void totalSumOnBoundaries(int[][] arr) {
        int n = arr.length;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        /*summing all the part together to get the total sum of the boundaries and the diagonals*/
        int totalSum = getFirstDiagonalSum(arr, n) + getSecondDiagonalSum(arr, n) + getBoundarySum(arr, n);
        if (n % 2 != 0) {
            /*subtracting the element which is common in both the diagonal element which is actually the middle element in the matrix*/
            totalSum -= arr[n / 2][n / 2];
        }
        System.out.println(totalSum);
    }

    public static int[][] takeInput() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while (testCases != 0) {
            int[][] arr = takeInput();
            totalSumOnBoundaries(arr);
            testCases--;
        }
    }
}
