package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            // Mảng điểm hợp lệ
            double[] scores1 = { 6.5, 7.0, 8.0, 9.0 };
            GradeCalculator gradeCalculator = new GradeCalculator();
            StudentGradeCalculator studentGradeCalculator = new StudentGradeCalculator();

            System.out.println("Điểm trung bình (GradeCalculator): " + gradeCalculator.calculateAverage(scores1));
            System.out.println("Điểm trung bình (StudentGradeCalculator): " + studentGradeCalculator.calculateAverage(scores1));

            // Mảng điểm không hợp lệ
            double[] scores2 = { 4.0, 3.5, 4.5 };
            System.out.println("Điểm trung bình (StudentGradeCalculator): " + studentGradeCalculator.calculateAverage(scores2));
        }
        catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }

        try {
            // Mảng rỗng
            double[] scores3 = {};
            GradeCalculator gradeCalculator = new GradeCalculator();
            System.out.println("Điểm trung bình (GradeCalculator): " + gradeCalculator.calculateAverage(scores3));
        }
        catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }

        try {
            // Mảng null
            double[] scores4 = null;
            StudentGradeCalculator studentGradeCalculator = new StudentGradeCalculator();
            System.out.println("Điểm trung bình (StudentGradeCalculator): " + studentGradeCalculator.calculateAverage(scores4));
        }
        catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }
}