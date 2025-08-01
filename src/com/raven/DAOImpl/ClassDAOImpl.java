package com.raven.DAOImpl;

import com.raven.DAO.ClassDAO;
import com.raven.entity.Class;
import java.util.List;
import com.raven.util.XJdbc;
import com.raven.util.XQuery;

public class ClassDAOImpl implements ClassDAO{
    String createSql = "INSERT INTO LopHoc(id, id_khoa_hoc, hocky, tong_buoi, id_giang_vien, ngay_bat_dau, ngay_ket_thuc) VALUES(?, ?, ?, ?, ?, ?, ?)"; 
    String updateSql = "UPDATE LopHoc SET id_khoa_hoc=?, hocky=?, tong_buoi=?, id_giang_vien=?, ngay_bat_dau=?, ngay_ket_thuc=? WHERE id=?"; 
    String deleteSql = "DELETE FROM LopHoc WHERE id=?"; 
    String findAllSql = "SELECT * FROM LopHoc"; 
    String findByIdSql = "SELECT * FROM LopHoc WHERE id=?"; 
    
    @Override 
    public Class create(Class entity) { 
        Object[] values = { 
            entity.getId(), 
            entity.getIdKhoaHoc(),
            entity.getHocKy(),
            entity.getTongBuoi(),
            entity.getIdGiangVien(),
            entity.getNgayBatDau(),
            entity.getNgayKetThuc()
        }; 
        XJdbc.executeUpdate(createSql, values); 
        return entity; 
    } 
    @Override 
    public void update(Class entity) { 
        Object[] values = {  
            entity.getIdKhoaHoc(),
            entity.getHocKy(),
            entity.getTongBuoi(),
            entity.getIdGiangVien(),
            entity.getNgayBatDau(),
            entity.getNgayKetThuc(),
            entity.getId()
        }; 
        XJdbc.executeUpdate(updateSql, values); 
    } 
    @Override 
    public void deleteById(String id) { 
        XJdbc.executeUpdate(deleteSql, id); 
    } 
    @Override 
    public List<Class> findAll() { 
        return XQuery.getBeanList(Class.class, findAllSql); 
    } 
    @Override 
    public Class findById(String id) { 
        return XQuery.getSingleBean(Class.class, findByIdSql, id); 
    } 
}
