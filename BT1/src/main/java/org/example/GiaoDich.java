package org.example;

public class GiaoDich {
    private double soTien;
    private TaiKhoanNganHang taiKhoan;

    // Constructor
    public GiaoDich(double soTien, TaiKhoanNganHang taiKhoan) {
        this.soTien = soTien;
        this.taiKhoan = taiKhoan;
    }

    // Phương thức thực hiện giao dịch
    public void thucHienGiaoDich() {
        if (taiKhoan != null) {
            if (taiKhoan.rutTien(soTien)) {
                System.out.println("Giao dịch thành công!");
                System.out.println("Số dư hiện tại: " + taiKhoan.getSoDu() + " VND");
            } else {
                System.out.println("Giao dịch thất bại! Số dư không đủ.");
            }
        } else {
            System.out.println("Tài khoản không tồn tại, giao dịch không thể thực hiện.");
        }
    }
}
