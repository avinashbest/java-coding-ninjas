package hashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 3, 1, 6, 2, 5};
        ArrayList<Integer> output = removeDuplicates(arr);
        System.out.println(output);
    }

    private static ArrayList<Integer> removeDuplicates(int[] arr) {
        var list = new ArrayList<Integer>();
        var map = new HashMap<Integer, Boolean>();

        for (var i : arr) {
            if (map.containsKey(i)) continue;
            list.add(i);
            map.put(i, true);
        }

        return list;
    }
}
