package ch03.q04;

public interface IntSequence {

    int next();

    default boolean hasNext() {
        return true;
    }

    static IntSequence of(int... integers) {

       return new IntSequence() {
           private int index = 0;

           @Override
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

    static IntSequence constant(int i) {
       return new IntSequence() {
          public int next() {
              return i;
          }
       };
    }
}
