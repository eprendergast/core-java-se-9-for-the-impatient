package ch01.q14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class MagicSquare {

    public static void main(String[] args) {

        String firstRow = getInput("Please enter the first row of the square as integers separated by a single space: ");
        ArrayList<Integer> firstRowAsArray = parseInputToArray(firstRow);

        ArrayList<ArrayList<Integer>> square = getRemainderOfSquare(firstRowAsArray);
        System.out.println("Your square: ");
        printSquare(square);

        List<Integer> sums = getSums(square);
        boolean isMagicSquare = isMagicSquare(sums);
        System.out.println(isMagicSquare ? "You've entered a Magic Square!" : "This is not a Magic Square");
    }

    public static String getInput(String message) {
        System.out.print(message);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static ArrayList<Integer> parseInputToArray(String input) {
        ArrayList<Integer> inputAsArray = new ArrayList<Integer>();
        String[] inputAsArrayOfStrings = input.split(" ");
        for (String i : inputAsArrayOfStrings) {
            inputAsArray.add(Integer.parseInt(i));
        }
        return inputAsArray;
    }

    public static ArrayList<ArrayList<Integer>> getRemainderOfSquare(ArrayList<Integer> firstRow) {
        ArrayList<ArrayList<Integer>> square = new ArrayList<ArrayList<Integer>>();
        square.add(firstRow);

        for (int i = 1; i < firstRow.size(); i ++) {
            ArrayList<Integer> nextRowAsArray = new ArrayList<Integer>();
            while(nextRowAsArray.size() != firstRow.size()) {
                String nextRow = getInput("Please enter the next row of length " + firstRow.size() + ":");
                nextRowAsArray = parseInputToArray(nextRow);
            }
            square.add(nextRowAsArray);
        }
        return square;
    }

    public static void printSquare(ArrayList<ArrayList<Integer>> square) {
        for (ArrayList<Integer> row : square) {
            System.out.println(row);
        }
    }

    public static List<Integer> getSums(ArrayList<ArrayList<Integer>> square) {
        List<Integer> sums = new ArrayList<Integer>();
        sums.add(calculatePositiveDiagonalSum(square));
        sums.add(calculateNegativeDiagonalSum(square));

        List<Integer> horizonalSums = calculateHorizontalSums(square);
        List<Integer> verticalSums = calculateVerticalSums(square);

        for (int i = 0; i < horizonalSums.size(); i ++) {
            sums.add(horizonalSums.get(i));
            sums.add(verticalSums.get(i));
        }
        return sums;
    }

    public static List<Integer> calculateHorizontalSums(ArrayList<ArrayList<Integer>> square) {
        List<Integer> horizontalSums = new ArrayList<Integer>();
        for (int i = 0; i < square.size(); i ++) {
            int sum = 0; 
            for (int j : square.get(i)) {
                sum += j;
            }
            horizontalSums.add(sum);
        }
        return horizontalSums;
    }

    public static List<Integer> calculateVerticalSums(ArrayList<ArrayList<Integer>> square) {
        List<Integer> verticalSums = new ArrayList<Integer>();
        for (int i = 0; i < square.size(); i ++) {
            int sum = 0; 
            for (int j = 0; j < square.size(); j ++) {
                sum += square.get(j).get(i);
            }
            verticalSums.add(sum);
        }
        return verticalSums;
    }

    public static int calculatePositiveDiagonalSum(ArrayList<ArrayList<Integer>> square) {
        int sum = 0; 
        for (int i = 0; i < square.size(); i ++) {
            sum += square.get(i).get(i);
        }
        return sum;
    }

    public static int calculateNegativeDiagonalSum(ArrayList<ArrayList<Integer>> square) {
        int sum = 0; 
        for (int i = 0, j = square.size() - 1; i < square.size() && j >= 0; i ++, j --) {
            sum += square.get(i).get(j);
        }
        return sum;
    }

    public static boolean isMagicSquare(List<Integer> sums) {
        for (int i = 1; i < sums.size(); i ++) {
           if (!sums.get(i).equals(sums.get(i - 1))) {
               return false;
           } 
        }
        return true;
    }
}