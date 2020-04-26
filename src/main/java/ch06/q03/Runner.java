package ch06.q03;

public class Runner {

    public static void main(String[] args) {
        Table<Integer, String> table = new Table<>();

        table.put(1, "Hello");
        table.put(2, "World");
        table.put(3, "!");

        System.out.println(table.get(1));
        System.out.println(table.get(2));

        table.remove(3);

    }

}
