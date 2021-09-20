package binaryTrees2.assignment;

import binaryTrees1.BinaryTreeNode;

import java.util.Scanner;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;
import static binaryTrees2.LevelwiseBinaryTreeInput.levelWiseInput;
/*Path Sum Root to Leaf

For a given Binary Tree of type integer and a number K, print out all root-to-leaf paths where the sum of all the node data along the path is equal to K.
Example:
alt txt

If you see in the above-depicted picture of Binary Tree, we see that there are a total of two paths, starting from the root and ending at the leaves which sum up to a value of K = 13.

The paths are:
a. 2 3 4 4
b. 2 3 8

One thing to note here is, there is another path in the right sub-tree in reference to the root, which sums up to 13 but since it doesn't end at the leaf, we discard it.
The path is: 2 9 2(not a leaf)
 Input Format:
The first line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

The second line of input contains an integer value K.
Output Format:
Lines equal to the total number of paths will be printed. All the node data in every path will be printed in a linear fashion taken in the order they appear from top to down bottom in the tree. A single space will separate them all.
Constriants:
1 <= N <= 10^5
0 <= K <= 10^8
Where N is the total number of nodes in the binary tree.

Time Limit: 1 second
Sample Input 1:
2 3 9 4 8 -1 2 4 -1 -1 -1 6 -1 -1 -1 -1 -1
13
 Sample Output 1:
2 3 4 4
2 3 8
Sample Input 2:
5 6 7 2 3 -1 1 -1 -1 -1 9 -1 -1 -1 -1
13
 Sample Output 2:
5 6 2
5 7 1*/
public class PathSumRootToLeaf {

    private static void printPath(BinaryTreeNode<Integer> root, int K, String path, int currentSum) {
        if (root == null) return;
//        Checking for Leaf Node
        if (root.left == null && root.right == null) {
            currentSum += root.data;
            if (currentSum == K) {
                System.out.println((path + " " + root.data));
            }
            return;
        }
        printPath(root.left, K, (path + " " + root.data), currentSum + root.data);
        printPath(root.right, K, (path + " " + root.data), currentSum);
    }

    public static void rootToLeafSumPath(BinaryTreeNode<Integer> root, int K) {
        printPath(root, K, "", 0);
    }

    public static void main(String[] args) {
        var root = levelWiseInput();
        System.out.println("-------------The Tree is-------------");
        printBinaryTree(root);
        System.out.println("-------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of K: ");
        int K = scan.nextInt();
        System.out.println("-------------------------------------");
        rootToLeafSumPath(root, K);
    }
}
