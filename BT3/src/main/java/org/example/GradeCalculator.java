package org.example;

public abstract class GradeCalculator {
    public abstract double calculateAverage(double[] scores);

    public static GradeCalculator createCalculator(String type) {
        if (type.equalsIgnoreCase("student")) {
            return new StudentGradeCalculator();
        } else {
            return new GeneralGradeCalculator();
        }
    }
}

