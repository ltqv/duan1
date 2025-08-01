package com.raven.entity;

import java.sql.Timestamp;

public class Exam {
    private String id;
    private String tieuDe;
    private java.sql.Timestamp ngayTao;
    private int thoiLuong;
    private int tongSoCau;
    private java.sql.Timestamp thoiGianBatDau;
    private java.sql.Timestamp thoiGianKetThuc;
    private boolean kichHoat;

    public Exam() {
    }

    public Exam(String id, String tieuDe, Timestamp ngayTao, int thoiLuong, int tongSoCau, Timestamp thoiGianBatDau, Timestamp thoiGianKetThuc, boolean kichHoat) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.ngayTao = ngayTao;
        this.thoiLuong = thoiLuong;
        this.tongSoCau = tongSoCau;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.kichHoat = kichHoat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public int getTongSoCau() {
        return tongSoCau;
    }

    public void setTongSoCau(int tongSoCau) {
        this.tongSoCau = tongSoCau;
    }

    public Timestamp getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(Timestamp thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public Timestamp getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Timestamp thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public boolean isKichHoat() {
        return kichHoat;
    }

    public void setKichHoat(boolean kichHoat) {
        this.kichHoat = kichHoat;
    }
    
    
}
