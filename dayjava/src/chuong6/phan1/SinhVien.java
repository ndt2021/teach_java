package chuong6.phan1;

public class SinhVien {
    private String ten;
    private String maSinhVien;
    private String truong;
    private float diem;
    private String soDienThoai;

    public SinhVien(String ten, String maSinhVien, String truong, float diem, String soDienThoai) {
        this.ten = ten;
        this.maSinhVien = maSinhVien;
        this.truong = truong;
        this.diem = diem;
        this.soDienThoai = soDienThoai;
    }

    public SinhVien(String ten, String maSinhVien, String truong) {
        this.ten = ten;
        this.maSinhVien = maSinhVien;
        this.truong = truong;
    }

    public SinhVien(String ten, String maSinhVien) {
        this.ten = ten;
        this.maSinhVien = maSinhVien;
    }



    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
