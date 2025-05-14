package org.example;

public class StudentGradeCalculator extends GradeCalculator {
    @Override
    public double calculateAverage(double[] scores) {
        double trungBinh = new GeneralGradeCalculator().calculateAverage(scores);

        if (trungBinh < 5) {
            throw new IllegalArgumentException("Điểm trung bình dưới 5 không hợp lệ.");
        }

        return trungBinh;
    }
}

