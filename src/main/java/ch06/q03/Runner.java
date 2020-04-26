package ch06.q03;

public class Runner {

    public static void main(String[] args) {
        Table<Integer, String> table = new Table<>();

        table.putValue(1, "Hello");
        table.putValue(2, "World");
        table.putValue(3, "!");

        System.out.println(table.getValue(1));
        System.out.println(table.getValue(2));

        table.remove(3);

    }

}
