package org.example;

public class TaiKhoanNganHang {
    private String soTaiKhoan;
    private double soDu;


    public TaiKhoanNganHang(String soTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
    }


    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    // Phương thức rút tiền
    public boolean rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            return true;
        }
        return false;
    }

    // Phương thức nạp tiền
    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
        }
    }
}
