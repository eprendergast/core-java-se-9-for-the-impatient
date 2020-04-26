package ch07.q01;

import java.util.HashSet;
import java.util.Set;

public class SieveOfErathostenes {

    public static void main(String[] args) {
        Set<Integer> primes = sieve(300); // 2, 3, 5, 7

        for (int i : primes) {
            System.out.println(i);
        }
    }

    public static Set<Integer> sieve(int n) {
        Set<Integer> primes = new HashSet<>();

        for (int i = 2; i <= n; i ++) {
            primes.add(i);
        }

        for (int i = 2; Math.sqrt(i) <= n; i++ ) {
            for (int j = 0; i * (i + j) <= n; j++) {
                int s = i * (i + j);
                primes.remove(s);
            }
        }
        return primes;
    }

}
