package ch07.q05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class Swap {

    public static void main(String[] args) {

        // ArrayList implements RandomAccess
        List<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        swap(arrayList, 0, 2);

        // LinkedList does NOT implement RandomAccess
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        swap(linkedList, 0, 1);

    }

    public static <T> void swap(List<T> list, int i, int j) {
        if (list instanceof RandomAccess) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

}
