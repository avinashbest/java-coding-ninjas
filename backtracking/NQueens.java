package backtracking;

import java.util.Scanner;

/*You are given N, and for a given N x N chessboard, find a way to place N queens such that no queen can attack any other queen on the chess board.
A queen can be killed when it lies in the same row, or same column, or the same diagonal of any of the other queens.
You have to print all such configurations.
Input Format :
Line 1 : Integer N
Output Format :
One Line for every board configuration.
Every line will have N*N board elements printed row wise and are separated by space
Note : Don't print anything if there isn't any valid configuration.
Constraints :
1<=N<=10
Sample Input 1:
4
Sample Output 1 :
0 1 0 0 0 0 0 1 1 0 0 0 0 0 1 0
0 0 1 0 1 0 0 0 0 0 0 1 0 1 0 0 */
public class NQueens {
    public static void placeNQueens(int N) {
        int[][] board = new int[N][N];
        placeQueens(board, 0, N);
    }

    private static void placeQueens(int[][] board, int row, int N) {
//        valid board configuration
        if (N == row) {
            print2dArray(board);
            System.out.println();
        }
//        check for all columns
        for (int j = 0; j < N; j++) {
//            check if it is safe to place Queen
            if (isBoardSafe(board, row, j)) {
                board[row][j] = 1;
//                if it is safe -> then place the queen & move to next row
                placeQueens(board, row + 1, N);
                board[row][j] = 0;
            }
        }
    }

    private static boolean isBoardSafe(int[][] board, int row, int column) {
        int N = board.length;

        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row + 1, j = column + 1; i < N && j < N; i++, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = column + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row + 1, j = column - 1; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column] == 1) {
                return false;
            }
        }

        for (int i = row + 1; i < N; i++) {
            if (board[i][column] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void print2dArray(int[][] arr) {
        System.out.println("Possible Placing of the Queens:");
        System.out.println("-----------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0)
                    System.out.print("👑" + "\t");
                else
                    System.out.print("❌" + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the board: ");
        int size = scan.nextInt();
        if (size > 3) {
            placeNQueens(size);
        } else {
            System.out.println("Size is less than 4! No placement of Queen is possible :(");
        }
    }
}
