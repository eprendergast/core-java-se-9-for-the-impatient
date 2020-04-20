package ch05.q05;

import java.io.FileNotFoundException;

public class Runner {

    public static void main(String[] args) throws FileNotFoundException {
        String filePathIn = "src/main/java/ch05/q05/sampleText.txt";
        String filePathOut = "src/main/java/ch05/q05/emptyFile.txt";

        WriteAndCloseFile.write(filePathIn, filePathOut);

    }

}
