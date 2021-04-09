package TwoDimensionalArrays;

import java.util.Scanner;

public class LargestColumnSum {

    public static int largestColumnSum(int[][] arr) {
        int largest = Integer.MIN_VALUE;
        for (int j = 0; j < arr[0].length; j++) {
            int sumOfEachRow = 0;
            for (int i = 0; i < arr.length; i++) {
                sumOfEachRow += arr[i][j];
            }
            if (sumOfEachRow > largest) {
                largest = sumOfEachRow;
            }
        }
        return largest;
    }

    public static int[][] takeInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row = scan.nextInt();
        System.out.println("Enter number of columns:");
        int column = scan.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter the element at " + i + "th rows " + j + "th column:");
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = takeInput();
        System.out.println(largestColumnSum(arr));
    }
}
