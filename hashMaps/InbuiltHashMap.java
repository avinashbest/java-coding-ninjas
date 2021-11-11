package hashMaps;

import java.util.HashMap;
import java.util.Set;

public class InbuiltHashMap {
    public static void main(String[] args) {
//        Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();
//        All are O(1) operations

//        Inserting in HashMap
        map.put("abc", 1);
        map.put("def", 2);
        map.put("ghi", 3);
        map.put("jkl", 4);
//        Checking whether HashMap contains particular key or not
        if (map.containsKey("abc")) System.out.println("map contains abc");
        if (map.containsKey("abc1")) System.out.println("map contains abc1");
//        Getting Value
        int v = map.get("abc");
        System.out.println(v);

//        int v1 = map.get("abc1"); // java.lang.NullPointerException
//        System.out.println(v1);

        if (map.containsKey("abc1")) {
            int v1 = map.get("abc1");
            System.out.println(v1);
        }
//        Size of the HashMap
        System.out.println(map.size());
//        Removing a Key-value
        map.remove("abc");
        if (map.containsKey("abc")) System.out.println("map has abc");
        map.remove("abc1"); // Nothing, if key not present

        System.out.println(map.size());
//        Iterating over HashMap => O(n)
        Set<String> keys = map.keySet();
        for (var key : keys) System.out.print(key + " ");
    }
}
