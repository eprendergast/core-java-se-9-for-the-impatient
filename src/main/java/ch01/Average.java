package ch01;

public class Average {

    public static double calculateAverage(double... values) {
        double sum = 0;

        for(double number : values) {
            sum += number;
        }

        double average = sum / values.length;
        return average;
    }

    public static void main(String[] args) {
        double[] numbers = {2, 4, 5, 6};
        double average = Average.calculateAverage(numbers);
        System.out.println("The average is " + average);
    }

}
