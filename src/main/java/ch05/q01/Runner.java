package ch05.q01;

import java.io.FileNotFoundException;

public class Runner {

    public static void main(String[] args)  {

        String filename = "src/main/java/ch05/q01/textFiles/doubles.txt";
//        String filename = "src/main/java/ch05/q01/textFiles/illegalArguments.txt";
//        String filename = "src/main/java/ch05/q01/textFiles/i_dont_exist.txt";
        FileReader reader = new FileReader();

        try {
            reader.printSum(filename);
        } catch (FileNotFoundException | IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
