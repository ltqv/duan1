package com.raven.DAOImpl;

import com.raven.DAO.ExamDAO;
import com.raven.entity.Exam;
import java.util.List;
import com.raven.util.XJdbc;
import com.raven.util.XQuery;

public class ExamDAOImpl implements ExamDAO{
    String createSql = "INSERT INTO BaiKiemTra(id, tieu_de, ngay_tao, thoi_luong, tong_so_cau, thoi_gian_bat_dau, thoi_gian_ket_thuc, kich_hoat) VALUES(?, ?, ?, ?, ?, ?, ?, ?)"; 
    String updateSql = "UPDATE BaiKiemTra SET tieu_de=?, ngay_tao=?, thoi_luong=?, tong_so_cau=?, thoi_gian_bat_dau=?, thoi_gian_ket_thuc=?, kich_hoat=? WHERE id=?"; 
    String deleteSql = "DELETE FROM BaiKiemTra WHERE id=?"; 
    String findAllSql = "SELECT * FROM BaiKiemTra"; 
    String findByIdSql = "SELECT * FROM BaiKiemTra WHERE id=?"; 
    
    @Override 
    public Exam create(Exam entity) { 
        Object[] values = { 
            entity.getId(), 
            entity.getTieuDe(),
            entity.getNgayTao(),
            entity.getThoiLuong(),
            entity.getTongSoCau(),
            entity.getThoiGianBatDau(),
            entity.getThoiGianKetThuc(),
            entity.isKichHoat()
        }; 
        XJdbc.executeUpdate(createSql, values); 
        return entity; 
    } 
    @Override 
    public void update(Exam entity) { 
        Object[] values = {  
            entity.getTieuDe(),
            entity.getNgayTao(),
            entity.getThoiLuong(),
            entity.getTongSoCau(),
            entity.getThoiGianBatDau(),
            entity.getThoiGianKetThuc(),
            entity.isKichHoat(),
            entity.getId()
        }; 
        XJdbc.executeUpdate(updateSql, values); 
    } 
    @Override 
    public void deleteById(String id) { 
        XJdbc.executeUpdate(deleteSql, id); 
    } 
    @Override 
    public List<Exam> findAll() { 
        return XQuery.getBeanList(Exam.class, findAllSql); 
    } 
    @Override 
    public Exam findById(String id) { 
        return XQuery.getSingleBean(Exam.class, findByIdSql, id); 
    } 
}
