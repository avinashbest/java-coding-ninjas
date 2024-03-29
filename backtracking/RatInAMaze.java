package backtracking;

import java.util.Scanner;

/*You are given a N*N maze with a rat placed at maze[0][0]. Find whether any path exist that rat can follow to reach its destination i.e. maze[N-1][N-1]. Rat can move in any direction ( left, right, up and down).
Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means rat cannot enter into those cells and those with value 1 are open.
Input Format
Line 1: Integer N
Next N Lines: Each line will contain ith row elements (separated by space)
Output Format :
The output line contains true if any path exists for the rat to reach its destination otherwise print false.
Sample Input 1 :
3
1 0 1
1 0 1
1 1 1
Sample Output 1 :
true
Sample Input 2 :
3
1 0 1
1 0 1
0 1 1
Sample Output 2 :
 false*/
public class RatInAMaze {

    public static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
//        Checking if the current cell which we are going to traverse is a valid cell or not?
        if (i < 0 || i >= maze.length || j < 0 || j >= maze.length || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }
//        Including the current cell to be in path[i][j]
        path[i][j] = 1;
//        Checking if the current cell is destination cell or not
        if (i == maze.length - 1 && j == maze.length - 1) {
//            printing the path before returning
            print2dArray(path);
            return true;
        }
//        Explore further the maze in all direction
//        Top Direction
        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }
//        Right Direction
        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }
//        Bottom Direction
        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }
//        Left Direction
        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }
        return false;
    }

    public static boolean ratInAMaze(int[][] maze) {
        int[][] path = new int[maze.length][maze.length];
        return solveMaze(maze, 0, 0, path);
    }

    public static void print2dArray(int[][] arr) {
        System.out.println("-----------------");
        System.out.println("Path of the Maze:");
        System.out.println("-----------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0)
                    System.out.print("🐀" + "\t");
                else
                    System.out.print("🧱" + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }

    public static int[][] takeMazeInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Size of the Maze = ");
        int size = scan.nextInt();
        int[][] maze = new int[size][size];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print("Maze [" + i + "][" + j + "] = ");
                maze[i][j] = scan.nextInt();
            }
        }
        return maze;
    }

    public static void main(String[] args) {
//        int[][] maze = takeMazeInput();
        int[][] maze = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 1, 1}
        };
        System.out.println(ratInAMaze(maze));
    }
}
