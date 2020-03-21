package ch03.q01;

public interface Measurable {

    double getMeasure();

    static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum/( (double) objects.length);
    }

    static double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    static Measurable largest(Measurable[] objects) {
        Measurable largest = objects[0];

        for(Measurable object : objects) {
            if (object.getMeasure() > largest.getMeasure()) {
                largest = object;
            }
        }
        return largest;
    }

}
