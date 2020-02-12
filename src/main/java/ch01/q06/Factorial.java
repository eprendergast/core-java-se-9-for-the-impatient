package ch01.q06;

import java.math.BigInteger;

class Factorial {

    public static void main(final String[] args) {
        System.out.println(Factorial.computeFactorial(10));
    }

    public static BigInteger computeFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        while (n > 0) {
           factorial = factorial.multiply(BigInteger.valueOf(n));
           n --;
        }
        return factorial;
    }

}