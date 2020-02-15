package ch01.q08;

import java.util.Scanner;

class Substrings {
    
    public static void main (String[] args) {
        System.out.print("Enter a string: ");
        final Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        printSubstrings(string);
    }

    public static void printSubstrings(String string) {
        for (int i = 0; i < string.length(); i ++) {
            for (int j = i + 1; j <= string.length(); j++) {
                System.out.println(string.substring(i, j));
            }
        }
    }
}

