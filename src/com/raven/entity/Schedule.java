package com.raven.entity;

import java.sql.Time;

public class Schedule {
    private String id;
    private String idLop;
    private int thuTrongTuan;
    private java.sql.Time gioBatDau;
    private java.sql.Time gioKetThuc;
    private String phongHoc;

    public Schedule() {
    }

    public Schedule(String id, String idLop, int thuTrongTuan, Time gioBatDau, Time gioKetThuc, String phongHoc) {
        this.id = id;
        this.idLop = idLop;
        this.thuTrongTuan = thuTrongTuan;
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
        this.phongHoc = phongHoc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdLop() {
        return idLop;
    }

    public void setIdLop(String idLop) {
        this.idLop = idLop;
    }

    public int getThuTrongTuan() {
        return thuTrongTuan;
    }

    public void setThuTrongTuan(int thuTrongTuan) {
        this.thuTrongTuan = thuTrongTuan;
    }

    public Time getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(Time gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public Time getGioKetThuc() {
        return gioKetThuc;
    }

    public void setGioKetThuc(Time gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }
    
    
}
