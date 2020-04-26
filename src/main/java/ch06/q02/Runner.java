package ch06.q02;

import ch06.q01.ArrayListStack;

public class Runner {

    public static void main(String[] args) {

        ArrayStack<String> stack = new ArrayStack<>(0);

        stack.push("Hello");
        stack.push("World");

        System.out.println(stack.toString());
    }

}
