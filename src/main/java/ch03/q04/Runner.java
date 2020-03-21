package ch03.q04;

public class Runner {

    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);

        while(sequence.hasNext()) {
            System.out.println(sequence.next());
        }
    }
}
