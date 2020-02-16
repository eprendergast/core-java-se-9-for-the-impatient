package ch01.q13;

import java.util.ArrayList;
import java.util.Random;

class LotteryNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> winningNumbers = pickDistinctNumbers();
        System.out.println(winningNumbers);
    }

    public static ArrayList<Integer> pickDistinctNumbers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 49; i ++) {
            numbers.add(i + 1);
        }
        Random r = new Random();
        ArrayList<Integer> winningNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            int index = r.nextInt(numbers.size());
            winningNumbers.add(i, numbers.get(index));
            numbers.remove(index);
        }
        return winningNumbers; //test
    }
}