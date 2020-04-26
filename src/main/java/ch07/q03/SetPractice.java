package ch07.q03;

import java.util.HashSet;
import java.util.Set;

import ch07.q01.SieveOfErathostenes;

public class SetPractice {

    public static void main(String[] args) {

        Set<Integer> oddNumbers = new HashSet<>();
        for (int i = 1; i < 100; i += 2) {
            oddNumbers.add(i);
        }

        Set<Integer> primeNumbers = SieveOfErathostenes.sieve(100);

        print(union(oddNumbers, primeNumbers));
        print(intersection(oddNumbers, primeNumbers));
        print(difference(oddNumbers, primeNumbers));
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        Set<T> difference = new HashSet<>();
        difference.addAll(set1);
        difference.addAll(set2);

        Set<T> union = union(set1, set2);
        difference.removeAll(union);
        return difference;
    }

    public static <T> void print(Set<T> values) {
        for (T object : values) {
            System.out.println(object);
        }
    }

}
