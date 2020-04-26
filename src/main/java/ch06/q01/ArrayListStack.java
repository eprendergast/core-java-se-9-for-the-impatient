package ch06.q01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<E> {

    public List<E> stack = new ArrayList<>();

    public ArrayListStack() {
    }

    public void push(E element) {
        this.stack.add(element);
    }

    public E pop() {
        if (stack.size() == 0) throw new IllegalStateException("Stack is empty.");

        E last = stack.get(stack.size() - 1);
        stack.remove(last);
        return last;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }


}
