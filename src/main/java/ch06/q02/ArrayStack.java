package ch06.q02;

import java.util.Arrays;

import com.sun.tools.javac.util.ArrayUtils;

public class ArrayStack<E> {

    private E[] stack;

    @SuppressWarnings("unchecked")
    public ArrayStack(int size) {
        if (size < 0) throw new IllegalArgumentException("Array size cannot be negative");
        this.stack = (E[]) new Object[size];
    }

    @SuppressWarnings("unchecked")
    public void push(E element) {
        E[] temp = (E[]) new Object[stack.length + 1];

        for (int i = 0; i < stack.length; i++) {
            temp[i] = stack[i];
        }

        temp[stack.length] = element;
        this.stack = temp;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        E[] temp = (E[]) new Object[stack.length - 1];
        E lastElement = this.stack[stack.length];

        for (int i = 0; i < stack.length - 1; i ++) {
            temp[i] = stack[i];
        }

        this.stack = temp;
        return lastElement;
    }

    public boolean isEmpty() {
        return this.stack.length == 1;
    }
}
