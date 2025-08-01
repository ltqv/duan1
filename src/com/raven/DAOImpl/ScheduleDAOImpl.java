package com.raven.DAOImpl;

import com.raven.DAO.ScheduleDAO;
import com.raven.entity.Schedule;
import java.util.List;
import com.raven.util.XJdbc;
import com.raven.util.XQuery;

public class ScheduleDAOImpl implements ScheduleDAO{
    String createSql = "INSERT INTO LichHoc(id, id_lop, thu_trong_tuan, gio_bat_dau, gio_ket_thuc, phong_hoc) VALUES(?, ?, ?, ?, ?, ?)"; 
    String updateSql = "UPDATE LichHoc SET id_lop=?, thu_trong_tuan=?, gio_bat_dau=?, gio_ket_thuc=?, phong_hoc=? WHERE id=?"; 
    String deleteSql = "DELETE FROM LichHoc WHERE id=?"; 
    String findAllSql = "SELECT * FROM LichHoc"; 
    String findByIdSql = "SELECT * FROM LichHoc WHERE id=?"; 
    
    @Override 
    public Schedule create(Schedule entity) { 
        Object[] values = { 
            entity.getId(), 
            entity.getIdLop(),
            entity.getThuTrongTuan(),
            entity.getGioBatDau(),
            entity.getGioKetThuc(),
            entity.getPhongHoc()
        }; 
        XJdbc.executeUpdate(createSql, values); 
        return entity; 
    } 
    @Override 
    public void update(Schedule entity) { 
        Object[] values = {  
            entity.getIdLop(),
            entity.getThuTrongTuan(),
            entity.getGioBatDau(),
            entity.getGioKetThuc(),
            entity.getPhongHoc(),
            entity.getId()
        }; 
        XJdbc.executeUpdate(updateSql, values); 
    } 
    @Override 
    public void deleteById(String id) { 
        XJdbc.executeUpdate(deleteSql, id); 
    } 
    @Override 
    public List<Schedule> findAll() { 
        return XQuery.getBeanList(Schedule.class, findAllSql); 
    } 
    @Override 
    public Schedule findById(String id) { 
        return XQuery.getSingleBean(Schedule.class, findByIdSql, id); 
    } 
}
