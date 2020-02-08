package ch01;

import java.util.Scanner;

public class PrintInteger {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println("The number is " + number);
        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal: " + Integer.toHexString(number));

    }

}
