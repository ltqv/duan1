package com.raven.DAOImpl;

import com.raven.DAO.QuestionDAO;
import com.raven.entity.Question;
import java.util.List;
import com.raven.util.XJdbc;
import com.raven.util.XQuery;

public class QuestionDAOImpl implements QuestionDAO{
    String createSql = "INSERT INTO CauHoi(id, so_thu_tu, id_bai_kt, noi_dung, dap_an_a, dap_an_b, dap_an_c, dap_an_d, dap_an_dung) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
    String updateSql = "UPDATE CauHoi SET so_thu_tu=?, id_bai_kt=?, noi_dung=?, dap_an_a=?, dap_an_b=?, dap_an_c=?, dap_an_d=?, dap_an_dung=? WHERE id=?"; 
    String deleteSql = "DELETE FROM CauHoi WHERE id=?"; 
    String findAllSql = "SELECT * FROM CauHoi"; 
    String findByIdSql = "SELECT * FROM CauHoi WHERE id=?"; 
    
    @Override 
    public Question create(Question entity) { 
        Object[] values = { 
            entity.getId(), 
            entity.getSoThuTu(),
            entity.getIdBaiKT(),
            entity.getNoiDung(),
            entity.getDapAnA(),
            entity.getDapAnB(),
            entity.getDapAnC(),
            entity.getDapAnD(),
            entity.getDapAnDung()
        }; 
        XJdbc.executeUpdate(createSql, values); 
        return entity; 
    } 
    @Override 
    public void update(Question entity) { 
        Object[] values = {  
            entity.getSoThuTu(),
            entity.getIdBaiKT(),
            entity.getNoiDung(),
            entity.getDapAnA(),
            entity.getDapAnB(),
            entity.getDapAnC(),
            entity.getDapAnD(),
            entity.getDapAnDung(),
            entity.getId()
        }; 
        XJdbc.executeUpdate(updateSql, values); 
    } 
    @Override 
    public void deleteById(String id) { 
        XJdbc.executeUpdate(deleteSql, id); 
    } 
    @Override 
    public List<Question> findAll() { 
        return XQuery.getBeanList(Question.class, findAllSql); 
    } 
    @Override 
    public Question findById(String id) { 
        return XQuery.getSingleBean(Question.class, findByIdSql, id); 
    } 
}
