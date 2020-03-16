package ch02.q16;

// implement an unbounded queue of strings

public class Queue {

    Node head;
    Node tail;

    public static class Node {

        Node next = null;
        String data;

        public Node(String data) {
            this.data = data;
        }

        public String toString() {
            return this.data;
        }
    }

    public void add(String data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else if (this.tail == null) {
            this.head.next = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public void remove() {
        if (this.head.next != null) {
            this.head = this.head.next;
            if (this.head.equals(this.tail)) {
                this.tail = null;
            }
        } else {

        }

    }

    @Override
    public String toString() {
        return "Queue{ " +
               "head = " + head +
               ", tail = " + tail +
               '}';
    }
}
