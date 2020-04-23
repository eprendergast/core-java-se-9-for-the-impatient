package ch06.q01;

public class Runner {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Hello");
        stack.push("World");
        stack.pop();
        stack.isEmpty();
        stack.pop();
        stack.isEmpty();

    }

}
