package ch07.q02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Uppercase {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Becky");
        names.add("Lisa");
        names.add("John");

        withIterator(names);
        withLoop(names);
        withReplaceAll(names);

    }

    public static void withIterator (List<String> list) {
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            itr.next().toUpperCase();
        }
    }

    public static void withLoop (List<String> list) {
        for(String s : list) {
            s.toUpperCase();
        }
    }

    public static void withReplaceAll (List<String> list) {
        list.replaceAll(s -> s.toUpperCase());
    }

}
