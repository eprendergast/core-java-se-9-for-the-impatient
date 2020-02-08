package ch01;

import java.util.Arrays;
import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.print("Please enter a triangle height: ");
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();

        int[][] triangle = new int[height][];

        for (int i = 0; i < height; i++) {
            triangle[i] = new int[height];
            for (int j = 0; j < height; j++) {
                if (j <= i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = 0;
                }
            }
        }

        for (int[] row : triangle) {
            System.out.println(Arrays.toString(row));
        }

    }

}
