package binaryTrees2.assignment;

import binaryTrees1.BinaryTreeNode;

import java.util.Scanner;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;
import static binaryTrees2.LevelwiseBinaryTreeInput.levelWiseInput;

/*You are given a Binary Tree of type integer, a target node, and an integer value K.
Print the data of all nodes that have a distance K from the target node. The order in which they would be printed will not matter.
Example:
For a given input tree(refer to the image below):
1. Target Node: 5
2. K = 2
alt txt

Starting from the target node 5, the nodes at distance K are 7 4 and 1.
Input Format:
The first line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

The second line of input contains two integers separated by a single space, representing the value of the target node and K, respectively.
Output Format:
All the node data at distance K from the target node will be printed on a new line.

The order in which the data is printed doesn't matter.
Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
3 1
Sample Output 1:
9
6
Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
3 3
Sample Output 2:
4
5*/
public class PrintNodesAtDistanceK {

    private static int nodesAtDistanceKHelper(BinaryTreeNode<Integer> root, int target, int K) {
        if (root == null) return -1;
        if (root.data == target) {
            nodesAtDistanceKDown(root, K);
            return 0;
        }
        int leftDistance = nodesAtDistanceKHelper(root.left, target, K);
        if (leftDistance != -1) {
            if (leftDistance + 1 == K) {
                System.out.println(root.data);
            } else {
                nodesAtDistanceKDown(root.right, K - leftDistance - 2);
            }
            return 1 + leftDistance;
        }

        int rightDistance = nodesAtDistanceKHelper(root.right, target, K);
        if (rightDistance != -1) {
            if (rightDistance + 1 == K) {
                System.out.println(root.data);
            } else {
                nodesAtDistanceKDown(root.left, K - rightDistance - 2);
            }
            return 1 + rightDistance;
        }
        return -1;
    }

    private static void nodesAtDistanceKDown(BinaryTreeNode<Integer> root, int K) {
        if (root == null) return;
        if (K == 0) {
            System.out.println(root.data);
            return;
        }
        nodesAtDistanceKDown(root.left, K - 1);
        nodesAtDistanceKDown(root.right, K - 1);
    }

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int K) {
        nodesAtDistanceKHelper(root, node, K);
    }

    public static void main(String[] args) {
        var root = levelWiseInput();
        System.out.println("-------------The Tree is-------------");
        printBinaryTree(root);
        System.out.println("-------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of K: ");
        int K = scan.nextInt();
        System.out.print("Enter the value of 'node': ");
        int node = scan.nextInt();
        System.out.println("-------------------------------------");
        nodesAtDistanceK(root, node, K);
    }
}
