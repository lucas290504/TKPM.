package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            double[] scores1 = { 6.5, 7.0, 8.0, 9.0 };
            double[] scores2 = { 4.0, 3.5, 4.5 };

            GradeCalculator generalCalculator = GradeCalculator.createCalculator("general");
            GradeCalculator studentCalculator = GradeCalculator.createCalculator("student");

            System.out.println("Điểm trung bình (GeneralCalculator): " + generalCalculator.calculateAverage(scores1));
            System.out.println("Điểm trung bình (StudentCalculator): " + studentCalculator.calculateAverage(scores1));

            // Gây lỗi vì trung bình < 5
            System.out.println("Điểm trung bình (StudentCalculator): " + studentCalculator.calculateAverage(scores2));
        }
        catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }
}
