package com.example.challenges.model;

public class LichThi {
    private int id;
    private String giang_duong;
    private String phong;
    private String ma_mon;
    private String ten_mon;
    private String ca_thi;
    private String ngay_thi;


    public LichThi(int id, String giang_duong, String phong, String ma_mon, String ten_mon, String ca_thi, String ngay_thi) {
        this.id = id;
        this.giang_duong = giang_duong;
        this.phong = phong;
        this.ma_mon = ma_mon;
        this.ten_mon = ten_mon;
        this.ca_thi = ca_thi;
        this.ngay_thi = ngay_thi;
    }

    public LichThi() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGiang_duong() {
        return giang_duong;
    }

    public void setGiang_duong(String giang_duong) {
        this.giang_duong = giang_duong;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public String getMa_mon() {
        return ma_mon;
    }

    public void setMa_mon(String ma_mon) {
        this.ma_mon = ma_mon;
    }

    public String getTen_mon() {
        return ten_mon;
    }

    public void setTen_mon(String ten_mon) {
        this.ten_mon = ten_mon;
    }

    public String getCa_thi() {
        return ca_thi;
    }

    public void setCa_thi(String ca_thi) {
        this.ca_thi = ca_thi;
    }

    public String getNgay_thi() {
        return ngay_thi;
    }

    public void setNgay_thi(String ngay_thi) {
        this.ngay_thi = ngay_thi;
    }


}
