package ch01.q01;

public class PrintInteger {

    public static void main(String[] args) {
        System.out.println(PrintInteger.integerToBinary(42));
        System.out.println(PrintInteger.integerToOctal(42));
        System.out.println(PrintInteger.integerToHexadecimal(42));
        System.out.println(PrintInteger.integerReciprocalToHexadecimalFloatingPoint(42));
    }

    public static String integerToBinary(int integer) {
        return Integer.toString(integer, 2);
    }

    public static String integerToOctal(int integer) {
        return Integer.toString(integer, 8);
    }

    public static String integerToHexadecimal(int integer) {
        return Integer.toString(integer, 16);
    }

    public static String integerReciprocalToHexadecimalFloatingPoint(int integer) {
        Double reciprocal = (double) (1 / integer); // cast integer to double
        return Double.toHexString(reciprocal);
    }
    

}
