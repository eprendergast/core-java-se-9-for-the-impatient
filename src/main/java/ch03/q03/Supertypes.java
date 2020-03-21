package ch03.q03;

import java.io.Serializable;


public class Supertypes {

    public static void main(String[] args) {

        // The supertypes of String are Serializable, Comparable, and CharSequence
        // Test by casting a string to each supertype...
        String string = "Lorem Ipsum";
        System.out.println((CharSequence) string);
        System.out.println((Serializable) string);
        System.out.println((Comparable<String>) string);

        // The supertypes of Scanner are Iterator<String> and Closeable

        // The supertypes of ImageOutputStream are ImageInputStream and DataOutput
    }

}
