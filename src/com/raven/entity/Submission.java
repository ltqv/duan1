package com.raven.entity;

import java.sql.Timestamp;

public class Submission {
    private String id;
    private String idGiangVien;
    private String idBaiKT;
    private java.sql.Timestamp thoiGianNop;
    private String ketQuaJson;
    private int soCauDung;

    public Submission() {
    }

    public Submission(String id, String idGiangVien, String idBaiKT, Timestamp thoiGianNop, String ketQuaJson, int soCauDung) {
        this.id = id;
        this.idGiangVien = idGiangVien;
        this.idBaiKT = idBaiKT;
        this.thoiGianNop = thoiGianNop;
        this.ketQuaJson = ketQuaJson;
        this.soCauDung = soCauDung;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdGiangVien() {
        return idGiangVien;
    }

    public void setIdGiangVien(String idGiangVien) {
        this.idGiangVien = idGiangVien;
    }

    public String getIdBaiKT() {
        return idBaiKT;
    }

    public void setIdBaiKT(String idBaiKT) {
        this.idBaiKT = idBaiKT;
    }

    public Timestamp getThoiGianNop() {
        return thoiGianNop;
    }

    public void setThoiGianNop(Timestamp thoiGianNop) {
        this.thoiGianNop = thoiGianNop;
    }

    public String getKetQuaJson() {
        return ketQuaJson;
    }

    public void setKetQuaJson(String ketQuaJson) {
        this.ketQuaJson = ketQuaJson;
    }

    public int getSoCauDung() {
        return soCauDung;
    }

    public void setSoCauDung(int soCauDung) {
        this.soCauDung = soCauDung;
    }
    
    
}
