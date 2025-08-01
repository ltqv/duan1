package com.raven.entity;

public class ViewedSubmission {
    private int id;
    private String idHocVien;
    private String idBaiLam;

    public ViewedSubmission() {
    }

    public ViewedSubmission(int id, String idHocVien, String idBaiLam) {
        this.id = id;
        this.idHocVien = idHocVien;
        this.idBaiLam = idBaiLam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdHocVien() {
        return idHocVien;
    }

    public void setIdHocVien(String idHocVien) {
        this.idHocVien = idHocVien;
    }

    public String getIdBaiLam() {
        return idBaiLam;
    }

    public void setIdBaiLam(String idBaiLam) {
        this.idBaiLam = idBaiLam;
    }
    
    
}
