package ch03.q04;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Runner {

    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);

        while(sequence.hasNext()) {
            System.out.println(sequence.next());
        }

        IntSequence constantSequence = IntSequence.constant(1);
        System.out.println(constantSequence.hasNext());
        System.out.println(constantSequence.next());
        System.out.println(constantSequence.hasNext());
        System.out.println(constantSequence.next());
    }
}
