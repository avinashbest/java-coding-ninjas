package timeComplexity.Assignment;

import java.util.Scanner;

public class DuplicateInArray {

    public static int findDuplicate(int[] arr) {
        int sumOfnMinusTwoNaturalNo = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sumOfnMinusTwoNaturalNo += i;
        }
        int sumOfElements = 0;
        for (int j : arr) {
            sumOfElements += j;
        }
        return (sumOfElements - sumOfnMinusTwoNaturalNo);
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
            System.out.println(findDuplicate(arr));
            testCases--;
        }
    }
}
