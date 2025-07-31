

package Until;

import DAO.NguoiDungDAO;
import com.raven.model.NguoiDung;
import java.util.List;


public class Test {
     public static void main(String[] args) {
        NguoiDungDAO dao = new NguoiDungDAO();

        // Thêm người dùng mới
        NguoiDung nd = new NguoiDung("ND10", "user10", "pass10", "Người Dùng 10", "0999999999", "user10@example.com", "HOC_VIEN");
        boolean success = dao.insert(nd);
        System.out.println("Insert thành công? " + success);

        // Lấy tất cả người dùng
        List<NguoiDung> ds = dao.getAll();
        for (NguoiDung n : ds) {
            System.out.println(n.getId() + " - " + n.getTenDangNhap() + " - " + n.getVaiTro());
        }
    }
}

