package hashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class PairSumToZero {

    private static int pairSumToZero(int[] arr) {
//         Storing the element of array, and it's frequency in map
        var map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            if (map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }
//        Traversing the array checking if the element is present in hashmap or not
        int finalCount = 0;
        for (int i : arr) {
            if (map.containsKey(-i) && map.get(i) != 0) {
                int times;
                if (i == (-i)) { // true in case of 0
                    int occurrences = map.get(i);
                    times = (occurrences * (occurrences - 1)) / 2;
                    finalCount += times;
                    map.put(i, 0);
                    continue;
                }

                times = map.get(i) * map.get(-i);
                finalCount += times;
                map.put(i, 0);
                map.put(-i, 0);
            }
        }
        return finalCount;
    }

    public static void main(String[] args) {
        var arr = takeArrayInput();
        System.out.println(pairSumToZero(arr));
    }

    private static int[] takeArrayInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) arr[i] = scan.nextInt();
        return arr;
    }
}
