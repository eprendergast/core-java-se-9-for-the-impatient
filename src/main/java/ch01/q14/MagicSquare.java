package ch01.q14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class MagicSquare {

    public static void main(String[] args) {
        // get first row of square
        String firstRow = getInput("Please enter the first row of the square as integers separated by a single space: ");
        ArrayList<Integer> firstRowAsArray = parseInputToArray(firstRow);
        // prompt for next rows of square based on length of first array
        ArrayList<ArrayList<Integer>> square = getRemainderOfSquare(firstRowAsArray);
        System.out.println(square);
        // calculate sum
    }

    public static String getInput(String message) {
        System.out.print(message);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static ArrayList<Integer> parseInputToArray(String input) {
        ArrayList<Integer> inputAsArray = new ArrayList<Integer>();
        // List<Integer> a = new LinkedList<Integer>();
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

    public static int getHorizontalSum(ArrayList<Integer> row) {
        int sum = 0;
        for (int i : row) {
            sum += i;
        }
        return sum;
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
        for (int i = 0, j = square.size() - 1; i < square.size() && j > 0; i ++, j --) {
            sum += square.get(i).get(j);
        }
        return sum;
    }
    

}