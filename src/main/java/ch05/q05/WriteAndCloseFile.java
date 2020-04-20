package ch05.q05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class WriteAndCloseFile {

    public static void write(String filePathIn, String filePathOut) {

        Scanner scanner = null;
        PrintWriter writer = null;

        try {
            scanner = new Scanner(filePathIn);
            writer = new PrintWriter(filePathOut);

            while (scanner.hasNext()) {
                writer.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) scanner.close();
            if (writer != null) writer.close();
        }
    }

}
