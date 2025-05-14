package org.example;

import java.util.Arrays;

public class GeneralGradeCalculator extends GradeCalculator {
    @Override
    public double calculateAverage(double[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Mảng điểm không được rỗng.");
        }

        double tổng = Arrays.stream(scores).sum();
        return tổng / scores.length;
    }
}

