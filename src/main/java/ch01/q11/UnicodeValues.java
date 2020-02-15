package ch01.q11;

import java.util.Scanner;

class UnicodeValues {

    public static void main(String[] args) {
        System.out.print("Enter a string of characters: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        printUnicaodeValues(str);
    }

    public static void printUnicaodeValues(String str) {
        for (char c : str.toCharArray()) {
            if ((int) c > 128 ) { // if character is not ASCII...
                System.out.printf("%c\n", c);
                System.out.printf("%d\n", (int) c);
            }
         
        }
    }

}