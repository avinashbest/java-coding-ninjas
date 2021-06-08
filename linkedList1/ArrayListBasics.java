package linkedList1;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(1, 50);
//        traversing via for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        traversing via enhanced for loop
        for (int i : list) {
            System.out.println(i);
        }
    }
}
