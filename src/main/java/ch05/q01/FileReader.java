package ch05.q01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    public ArrayList<Double> readValues(String filename) throws FileNotFoundException {

        ArrayList<Double> values = new ArrayList<Double>();

        File file = new File(filename);

        if (!file.exists()) {
            throw new FileNotFoundException("That file doesn't exist. Please try again.");
        }

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            if (!scanner.hasNextDouble()) {
                throw new IllegalArgumentException("File contains a non-floating point number.");
            }

            Double num = scanner.nextDouble();
            System.out.println(num);
            values.add(num);
        }
        return values;
    }

}
