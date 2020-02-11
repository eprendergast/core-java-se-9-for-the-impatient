package ch01.q03;

// read three integers, print largest one using only conditionals

class PrintLargestInteger {

    public static void main (String[] args) {
        System.out.println(PrintLargestInteger.getLargestIntegerUsingConditionals(44, -5, 6));
        System.out.println(PrintLargestInteger.getLargestIntegerUsingMax(44, -5, 6));
    }

    public static int getLargestIntegerUsingConditionals(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {  
            return second;
        } else {
            return third;
        }
    }

    public static int getLargestIntegerUsingMax(int first, int second, int third) {
        int firstMax = Math.max(first, second);
        int secondMax = Math.max(second, third);
        return Math.max(firstMax, secondMax);
    }

}