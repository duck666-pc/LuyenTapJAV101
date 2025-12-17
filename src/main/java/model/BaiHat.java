package model;

import java.util.*;

public class BaiHat implements List<BaiHat> {
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

    public java.sql.Date getNgaySanXuat() {
        return (java.sql.Date) ngaySanXuat;
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

    public java.sql.Date getNgayRaMat() {
        return (java.sql.Date) ngayRaMat;
    }

    public void setNgayRaMat(Date ngayRaMat) {
        this.ngayRaMat = ngayRaMat;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<BaiHat> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(BaiHat baiHat) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends BaiHat> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends BaiHat> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public BaiHat get(int index) {
        return null;
    }

    @Override
    public BaiHat set(int index, BaiHat element) {
        return null;
    }

    @Override
    public void add(int index, BaiHat element) {

    }

    @Override
    public BaiHat remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<BaiHat> listIterator() {
        return null;
    }

    @Override
    public ListIterator<BaiHat> listIterator(int index) {
        return null;
    }

    @Override
    public List<BaiHat> subList(int fromIndex, int toIndex) {
        return null;
    }
}
