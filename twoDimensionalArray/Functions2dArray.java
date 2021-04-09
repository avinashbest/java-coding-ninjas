package twoDimensionalArray;

import java.util.Scanner;

public class Functions2dArray {

    public static void print2dArray(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
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
        print2dArray(arr);
    }
}
