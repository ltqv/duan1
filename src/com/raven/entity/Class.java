package com.raven.entity;

import java.sql.Date;

public class Class {
    private String id;
    private String idKhoaHoc;
    private String hocKy;
    private int tongBuoi;
    private String idGiangVien;
    private java.sql.Date ngayBatDau;
    private java.sql.Date ngayKetThuc;

    public Class() {
    }

    public Class(String id, String idKhoaHoc, String hocKy, int tongBuoi, String idGiangVien, Date ngayBatDau, Date ngayKetThuc) {
        this.id = id;
        this.idKhoaHoc = idKhoaHoc;
        this.hocKy = hocKy;
        this.tongBuoi = tongBuoi;
        this.idGiangVien = idGiangVien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdKhoaHoc() {
        return idKhoaHoc;
    }

    public void setIdKhoaHoc(String idKhoaHoc) {
        this.idKhoaHoc = idKhoaHoc;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public int getTongBuoi() {
        return tongBuoi;
    }

    public void setTongBuoi(int tongBuoi) {
        this.tongBuoi = tongBuoi;
    }

    public String getIdGiangVien() {
        return idGiangVien;
    }

    public void setIdGiangVien(String idGiangVien) {
        this.idGiangVien = idGiangVien;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
    
    
}
