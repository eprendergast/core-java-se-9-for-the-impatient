package ch05.q01;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class IllegalArgumentRunner {

    public static void main(String[] args)  {

//        String filename = "src/main/java/ch05/q01/illegalArguments.txt";
        String filename = "src/main/java/ch05/q01/textFiles/i_dont_exist.txt";
        FileReader reader = new FileReader();

        try {
            ArrayList<Double> values = reader.readValues(filename);
        } catch (FileNotFoundException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
