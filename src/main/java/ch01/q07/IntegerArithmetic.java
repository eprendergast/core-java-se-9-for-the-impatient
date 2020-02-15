package ch01.q07;

import java.util.Scanner;

class IntegerArithmetic {

    public static void main (final String[] args) {

        final int a = (int) getValue();
        final int b = (int) getValue();

        printSum(a, b);
        printDifference(a, b);
        printProduct(a, b);
        printQuotient(a, b);
        printRemainder(a, b);
    }

    public static long getValue(){
        System.out.print("Please enter a value between 0 and 4,294,967,295: ");
        final Scanner in = new Scanner(System.in);
        Long value = in.nextLong();

        if (value < 0L || value > 4294967295L) {
            getValue();
        }

        return value;
    }

    public static void printSum(final int a, final int b) {
        System.out.printf("%d\n", a + b);
    }

    public static void printDifference(final int a, final int b) {
        System.out.printf("%d\n", Math.max(a, b) - Math.min(a, b));
    }

    public static void printProduct(final int a, final int b) {
        System.out.printf("%d\n", Integer.valueOf(a) * Integer.valueOf(b));
    }

    public static void printQuotient(final int a, final int b) {
        System.out.printf("%d\n", Integer.divideUnsigned(Math.max(a, b), Math.min(a, b)));
    }

    public static void printRemainder(final int a, final int b) {
        System.out.printf("%d\n", Integer.remainderUnsigned(a, b));
    }

}