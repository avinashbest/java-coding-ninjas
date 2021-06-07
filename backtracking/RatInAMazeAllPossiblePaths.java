package backtracking;

import java.util.Scanner;

public class RatInAMazeAllPossiblePaths {
    public static void printAllPaths(int[][] maze, int i, int j, int[][] path) {
//        Checking if the current cell which we are going to traverse is a valid cell or not?
        if (i < 0 || i >= maze.length || j < 0 || j >= maze.length || maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }
//        Including the current cell to be in path[i][j]
        path[i][j] = 1;
//        Checking if the current cell is destination cell or not
        if (i == maze.length - 1 && j == maze.length - 1) {
//            printing the path before returning
            print2dArray(path);
            path[i][j] = 0;
            return;
        }
//        Explore further the maze in all direction
//        Top Direction
        printAllPaths(maze, i - 1, j, path);
//        Right Direction
        printAllPaths(maze, i, j + 1, path);
//        Bottom Direction
        printAllPaths(maze, i + 1, j, path);
//        Left Direction
        printAllPaths(maze, i, j - 1, path);
//        resetting path variable to 0
        path[i][j] = 0;
    }

    public static void ratInAMaze(int[][] maze) {
        int[][] path = new int[maze.length][maze.length];
        printAllPaths(maze, 0, 0, path);
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
        ratInAMaze(maze);
    }
}
