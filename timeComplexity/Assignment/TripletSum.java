package timeComplexity.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {

    public static int tripletSum(int[] arr, int num) {
        Arrays.sort(arr);
        int n = arr.length;

        int numTriplets = 0;

        for (int i = 0; i < n; i++) {
            int pairSumFor = num - arr[i];
            int numPairs = pairSum(arr, (i + 1), (n - 1), pairSumFor);

            numTriplets += numPairs;
        }
        return numTriplets;
    }

    public static int pairSum(int[] arr, int startIndex, int endIndex, int num) {
        int numPair = 0;

        while (startIndex < endIndex) {

            if (arr[startIndex] + arr[endIndex] < num) {
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] > num) {
                endIndex--;
            } else {
                int elementAtStart = arr[startIndex];
                int elementAtEnd = arr[endIndex];

                if (elementAtStart == elementAtEnd) {
                    int totalElementFromStartToEnd = (endIndex - startIndex) + 1;
                    numPair += (totalElementFromStartToEnd * (totalElementFromStartToEnd - 1) / 2);

                    return numPair;
                }
                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex - 1;

                while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtEnd) {
                    tempStartIndex++;
                }
                while (tempEndIndex >= tempStartIndex && arr[tempEndIndex] == elementAtEnd) {
                    tempEndIndex--;
                }

                int totalElementFromStart = tempStartIndex - startIndex;
                int totalElementFromEnd = (endIndex - tempEndIndex);

                numPair += (totalElementFromStart * totalElementFromEnd);

                startIndex = tempStartIndex;
                endIndex = tempEndIndex;
            }
        }
        return numPair;
    }

    public static int[] takeArrayInput() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while (testCases != 0) {
            int[] arr = takeArrayInput();
            int x = scan.nextInt();
            System.out.println(tripletSum(arr, x));
            testCases--;
        }
    }
}
