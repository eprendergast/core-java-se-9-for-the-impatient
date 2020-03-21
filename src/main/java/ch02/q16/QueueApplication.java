package ch02.q16;

public class QueueApplication {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("first node");
        queue.add("second node");
        queue.add("third node");
        System.out.println(queue.toString());
        queue.remove();
        System.out.println(queue.toString());
        queue.remove();
        System.out.println(queue.toString());
        queue.remove();
        System.out.println(queue.toString());
        queue.add("Fourth node");
        System.out.println(queue.toString());
    }

}
