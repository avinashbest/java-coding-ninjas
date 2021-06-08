package linkedList1;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(1, 50);

        System.out.println(list.size());
        System.out.println(list.get(1));
    }
}
