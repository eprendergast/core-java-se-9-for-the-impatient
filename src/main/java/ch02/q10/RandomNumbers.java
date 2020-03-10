package ch02.q10;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(RandomNumbers.getRandomElement(array));
    }

    public static int getRandomElement(int[] array) {
        int index = getRandomNumber(0, array.length - 1);
        return array[index];
    }

    public static int getRandomNumber(int min, int max) {
        Random generator = new Random();
        return generator.nextInt(max + 1 - min) + min;
    }

}
