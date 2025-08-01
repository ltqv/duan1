CREATE DATABASE QLHOCVIEN;
GO
USE QLHOCVIEN;

CREATE TABLE NguoiDung (
    id NVARCHAR(10) PRIMARY KEY,
    ten_dang_nhap NVARCHAR(40) UNIQUE NOT NULL,
    mat_khau NVARCHAR(40) NOT NULL,
    ho_ten NVARCHAR(40),
    so_dien_thoai NVARCHAR(10),
    email NVARCHAR(30),
    vai_tro NVARCHAR(20) CHECK (vai_tro IN ('HOC_VIEN', 'GIAO_VIEN', 'QUAN_TRI')),
    ngay_tao DATETIME DEFAULT GETDATE()
);

CREATE TABLE KhoaHoc (
    id NVARCHAR(10) PRIMARY KEY,
    ten_khoa_hoc NVARCHAR(30),
    ngay_tao DATETIME DEFAULT GETDATE()
);

CREATE TABLE LopHoc (
    id NVARCHAR(10) PRIMARY KEY,
    id_khoa_hoc NVARCHAR(10),
    hoc_ky NVARCHAR(5),
    tong_buoi INT,
    id_giang_vien NVARCHAR(10),
    ngay_bat_dau DATE,
    ngay_ket_thuc DATE,
    FOREIGN KEY (id_khoa_hoc) REFERENCES KhoaHoc(id),
    FOREIGN KEY (id_giang_vien) REFERENCES NguoiDung(id)
);

CREATE TABLE HocVienTrongLop (
    id INT PRIMARY KEY IDENTITY,
    id_lop NVARCHAR(10),
    id_hoc_vien NVARCHAR(10),
    trang_thai NVARCHAR(15),
    FOREIGN KEY (id_lop) REFERENCES LopHoc(id),
    FOREIGN KEY (id_hoc_vien) REFERENCES NguoiDung(id)
);

CREATE TABLE LichHoc (
    id NVARCHAR(10) PRIMARY KEY,
    id_lop NVARCHAR(10),
    thu_trong_tuan INT,
    gio_bat_dau TIME,
    gio_ket_thuc TIME,
    phong_hoc NVARCHAR(10),
    FOREIGN KEY (id_lop) REFERENCES LopHoc(id)
);

CREATE TABLE BaiKiemTra (
    id NVARCHAR(10) PRIMARY KEY,
    tieu_de VARCHAR(40),
    ngay_tao DATETIME,
    thoi_luong INT,
    tong_so_cau INT,
    thoi_gian_bat_dau DATETIME,
    thoi_gian_ket_thuc DATETIME,
    kich_hoat BIT DEFAULT 0
);

CREATE TABLE CauHoi (
    id NVARCHAR(10) PRIMARY KEY,
    so_thu_tu INT,
    id_bai_kt NVARCHAR(10),
    noi_dung NVARCHAR(255),
    dap_an_a NVARCHAR(255),
    dap_an_b NVARCHAR(255),
    dap_an_c NVARCHAR(255),
    dap_an_d NVARCHAR(255),
    dap_an_dung NVARCHAR(1),
    FOREIGN KEY (id_bai_kt) REFERENCES BaiKiemTra(id)
);

CREATE TABLE BaiLam (
    id NVARCHAR(10) PRIMARY KEY,
    id_giang_vien NVARCHAR(10),
    id_bai_kt NVARCHAR(10),
    thoi_gian_nop DATETIME,
    ket_qua_json NVARCHAR(MAX),
    so_cau_dung INT,
    FOREIGN KEY (id_bai_kt) REFERENCES BaiKiemTra(id),
    FOREIGN KEY (id_giang_vien) REFERENCES NguoiDung(id)
);

CREATE TABLE HocVien_xembai (
    id INT PRIMARY KEY IDENTITY,
    id_hocvien NVARCHAR(10),
    id_bailam NVARCHAR(10),
    FOREIGN KEY (id_hocvien) REFERENCES NguoiDung(id),
    FOREIGN KEY (id_bailam) REFERENCES BaiLam(id)
);

-- Người dùng
INSERT INTO NguoiDung VALUES 
('ND01', 'hocvien1', '123456', N'Học Viên 1', '0911111111', 'hv1@example.com', 'HOC_VIEN', GETDATE()),
('ND02', 'giaovien1', '123456', N'Giáo Viên 1', '0922222222', 'gv1@example.com', 'GIAO_VIEN', GETDATE());

-- Khóa học
INSERT INTO KhoaHoc VALUES ('KH01', N'Toán Cao Cấp', GETDATE());

-- Lớp học
INSERT INTO LopHoc VALUES ('LH01', 'KH01', 'HK1', 20, 'ND02', '2025-09-01', '2025-12-01');

-- Học viên trong lớp
INSERT INTO HocVienTrongLop (id_lop, id_hoc_vien, trang_thai) VALUES ('LH01', 'ND01', N'Đang học');

-- Lịch học
INSERT INTO LichHoc VALUES ('LHLICH01', 'LH01', 2, '08:00:00', '10:00:00', N'P101');

-- Bài kiểm tra
INSERT INTO BaiKiemTra VALUES ('BKT01', 'Giữa kỳ', GETDATE(), 60, 20, '2025-10-01 08:00:00', '2025-10-01 09:00:00', 1);

-- Câu hỏi
INSERT INTO CauHoi VALUES ('CH01', 1, 'BKT01', N'Câu 1 là gì?', N'A', N'B', N'C', N'D', 'A');

-- Bài làm
INSERT INTO BaiLam VALUES ('BL01', 'ND02', 'BKT01', GETDATE(), N'{"CH01":"A"}', 1);

-- Học viên xem bài
INSERT INTO HocVien_xembai (id_hocvien, id_bailam) VALUES ('ND01', 'BL01');


select * from NguoiDung;
select * from LopHoc;