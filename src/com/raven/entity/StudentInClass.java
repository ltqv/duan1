package com.raven.entity;

public class StudentInClass {
    private int id;
    private String idLop;
    private String idHocVien;
    private String trangThai;

    public StudentInClass() {
    }

    public StudentInClass(int id, String idLop, String idHocVien, String trangThai) {
        this.id = id;
        this.idLop = idLop;
        this.idHocVien = idHocVien;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdLop() {
        return idLop;
    }

    public void setIdLop(String idLop) {
        this.idLop = idLop;
    }

    public String getIdHocVien() {
        return idHocVien;
    }

    public void setIdHocVien(String idHocVien) {
        this.idHocVien = idHocVien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
