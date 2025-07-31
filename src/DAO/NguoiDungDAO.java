
package DAO;

import Until.XJDBC;
import com.raven.model.NguoiDung;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NguoiDungDAO {
    public List<NguoiDung> getAll() {
        List<NguoiDung> list = new ArrayList<>();
        String sql = "SELECT * FROM NguoiDung";
        try (Connection conn = XJDBC.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                NguoiDung nd = new NguoiDung(
                    rs.getString("id"),
                    rs.getString("ten_dang_nhap"),
                    rs.getString("mat_khau"),
                    rs.getString("ho_ten"),
                    rs.getString("so_dien_thoai"),
                    rs.getString("email"),
                    rs.getString("vai_tro")
                );
                list.add(nd);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean insert(NguoiDung nd) {
        String sql = "INSERT INTO NguoiDung (id, ten_dang_nhap, mat_khau, ho_ten, so_dien_thoai, email, vai_tro) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = XJDBC.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nd.getId());
            stmt.setString(2, nd.getTenDangNhap());
            stmt.setString(3, nd.getMatKhau());
            stmt.setString(4, nd.getHoTen());
            stmt.setString(5, nd.getSoDienThoai());
            stmt.setString(6, nd.getEmail());
            stmt.setString(7, nd.getVaiTro());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
