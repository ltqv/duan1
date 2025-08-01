package com.raven.entity;

import java.sql.Timestamp;

public class Course {
    private String id;
    private String tenKhoaHoc;
    private java.sql.Timestamp ngayTao;

    public Course() {
    }

    public Course(String id, String tenKhoaHoc, Timestamp ngayTao) {
        this.id = id;
        this.tenKhoaHoc = tenKhoaHoc;
        this.ngayTao = ngayTao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    
}
