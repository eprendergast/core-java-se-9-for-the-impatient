package ch01.q10;

import java.util.Random;

class RandomString {

    public static void main(String[] args) {
        Long randomLong = new Random().nextLong();
        System.out.println(Long.toString(randomLong, 36));
    }

}