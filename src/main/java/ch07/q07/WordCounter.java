package ch07.q07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCounter {

    public static void main(String[] args) throws FileNotFoundException {

        WordCounter wordCounter = new WordCounter("src/main/java/ch07/q07/words.txt");
        Map<String, Integer> count = wordCounter.count();

        count.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    private String filepath;

    public WordCounter(String filepath) {
        this.filepath = filepath;
    }

    public Map<String, Integer> count() throws FileNotFoundException {
        Map<String, Integer> wordCount = new TreeMap<>();

        File file = new File(this.filepath);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            List<String> words;
            words = Arrays.asList(scanner.nextLine().split(" "));

            for (String word : words) {
                wordCount.merge(word.toLowerCase(), 1, Integer::sum);
            }
        }

        return wordCount;
    }

}
