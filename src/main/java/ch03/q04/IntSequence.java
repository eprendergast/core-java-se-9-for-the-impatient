package ch03.q04;

public interface IntSequence {

    int next();

    default boolean hasNext() {
        return true;
    }

    static IntSequence of(int... integers) {

       return new IntSequence() {
           private int index = 0;

           public boolean hasNext() {
               return index < integers.length;
           }

           public int next() {
               int value = integers[index];
               index ++;
               return value;
           }
       };
    }
}
