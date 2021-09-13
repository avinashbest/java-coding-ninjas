package binaryTrees1.assignment;

import binaryTrees1.BinaryTreeNode;

import java.util.Scanner;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;
import static binaryTrees1.BinaryTreeInput.takeTreeInputDetailed;

/*For a given Binary Tree of type integer and a number X, find whether a node exists in the tree with data X or not.
 Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:
The only line of output prints 'true' or 'false'.
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
7
Sample Output 1:
true
Sample Input 2:
2 3 4 -1 -1 -1 -1
10
Sample Output 2:
false*/
public class IsNodePresent {

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int node) {
        if (root == null) return false;
        if (root.data == node) return true;
        boolean leftTree = isNodePresent(root.left, node);
        boolean rightTree = isNodePresent(root.right, node);
        return (leftTree || rightTree);
    }

    public static void main(String[] args) {
        var root = takeTreeInputDetailed(true, 0, true);
        System.out.println("----------The Tree is----------");
        printBinaryTree(root);
        System.out.println("-------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the node to find: ");
        int node = scan.nextInt();
        System.out.println(isNodePresent(root, node));
    }
}
