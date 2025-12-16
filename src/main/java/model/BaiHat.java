package model;

import java.util.Date;

public class BaiHat {
    private int id;
    private String tenBaiHat;
    private String tenTacGia;
    private int thoiLuong;
    private Date ngaySanXuat;
    private Float gia;
    private int caSiId;
    private boolean phatHanhDia;
    private Date ngayRaMat;

    public BaiHat(int id, String tenBaiHat, String tenTacGia, int thoiLuong, Date ngaySanXuat, Float gia, int caSiId, boolean phatHanhDia, Date ngayRaMat) {
        this.id = id;
        this.tenBaiHat = tenBaiHat;
        this.tenTacGia = tenTacGia;
        this.thoiLuong = thoiLuong;
        this.ngaySanXuat = ngaySanXuat;
        this.gia = gia;
        this.caSiId = caSiId;
        this.phatHanhDia = phatHanhDia;
        this.ngayRaMat = ngayRaMat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public int getCaSiId() {
        return caSiId;
    }

    public void setCaSiId(int caSiId) {
        this.caSiId = caSiId;
    }

    public boolean isPhatHanhDia() {
        return phatHanhDia;
    }

    public void setPhatHanhDia(boolean phatHanhDia) {
        this.phatHanhDia = phatHanhDia;
    }

    public Date getNgayRaMat() {
        return ngayRaMat;
    }

    public void setNgayRaMat(Date ngayRaMat) {
        this.ngayRaMat = ngayRaMat;
    }
}
