package timeComplexity.Assignment;

import java.util.Scanner;

public class FindUniqueElement {

    public static int findUnique(int[] arr) {
        int XOR = 0;

        for (int j : arr) {
            XOR ^= j;
        }
        return XOR;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while (testCases != 0) {
            int size = scan.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println(findUnique(arr));
            testCases--;
        }
    }
}
