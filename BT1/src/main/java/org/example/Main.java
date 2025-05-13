package org.example;

// Chương trình chính
public class Main {
    public static void main(String[] args) {
        // Tạo tài khoản ngân hàng
        TaiKhoanNganHang taiKhoan1 = new TaiKhoanNganHang("123456789", 1000000);

        // Thực hiện giao dịch
        GiaoDich giaoDich1 = new GiaoDich(500000, taiKhoan1);
        giaoDich1.thucHienGiaoDich();  // Rút thành công

        GiaoDich giaoDich2 = new GiaoDich(600000, taiKhoan1);
        giaoDich2.thucHienGiaoDich();  // Rút thất bại, số dư không đủ

        // Giao dịch với tài khoản null
        GiaoDich giaoDich3 = new GiaoDich(100000, null);
        giaoDich3.thucHienGiaoDich();  // Tài khoản không tồn tại
    }
}
