-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th9 17, 2023 lúc 07:06 PM
-- Phiên bản máy phục vụ: 10.4.28-MariaDB
-- Phiên bản PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quản lý siêu thị mini`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `anhsp`
--

CREATE TABLE `anhsp` (
  `MASP` char(13) NOT NULL,
  `LINK_ANH` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bangluong`
--

CREATE TABLE `bangluong` (
  `MANV` char(7) NOT NULL,
  `TONGCONG` int(11) NOT NULL,
  `NGAYBDTINHCONG` date NOT NULL,
  `NGAYKTTINHCONG` date NOT NULL,
  `PHUCAP` int(11) NOT NULL,
  `TIENTHUONG` int(11) NOT NULL,
  `TIENPHAT` int(11) NOT NULL,
  `UNGLUONG` int(11) NOT NULL,
  `THUCLANH` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `bangluong`
--

INSERT INTO `bangluong` (`MANV`, `TONGCONG`, `NGAYBDTINHCONG`, `NGAYKTTINHCONG`, `PHUCAP`, `TIENTHUONG`, `TIENPHAT`, `UNGLUONG`, `THUCLANH`) VALUES
('A070103', 1800000, '2023-09-18', '2023-10-18', 5000, 0, 0, 0, 1805000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bienbanbangiaoca`
--

CREATE TABLE `bienbanbangiaoca` (
  `MACA1` char(1) NOT NULL,
  `MACA2` char(1) NOT NULL,
  `MANVCA1` char(7) NOT NULL,
  `MANVCA2` char(7) NOT NULL,
  `SOTIENBANGIAO` int(11) NOT NULL,
  `SOTIENTRENHT` int(11) NOT NULL,
  `THOIGIANBANGIAO` datetime NOT NULL,
  `CHECKLIST` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `bienbanbangiaoca`
--

INSERT INTO `bienbanbangiaoca` (`MACA1`, `MACA2`, `MANVCA1`, `MANVCA2`, `SOTIENBANGIAO`, `SOTIENTRENHT`, `THOIGIANBANGIAO`, `CHECKLIST`) VALUES
('1', '2', 'A140403', 'A070103', 1328000, 1328000, '2023-09-17 18:56:36', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `calamviec`
--

CREATE TABLE `calamviec` (
  `MACA` char(1) NOT NULL,
  `THOIGIANBATDAU` time NOT NULL,
  `THOIGIANKETTHUC` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `calamviec`
--

INSERT INTO `calamviec` (`MACA`, `THOIGIANBATDAU`, `THOIGIANKETTHUC`) VALUES
('1', '07:00:00', '12:00:00'),
('2', '12:00:00', '17:00:00'),
('3', '17:00:00', '22:00:00');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chamcong`
--

CREATE TABLE `chamcong` (
  `MANV` char(7) NOT NULL,
  `THOIGIANCI` datetime NOT NULL,
  `THOIGIANCO` datetime NOT NULL,
  `TONGGIOCONG` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chamcong`
--

INSERT INTO `chamcong` (`MANV`, `THOIGIANCI`, `THOIGIANCO`, `TONGGIOCONG`) VALUES
('A000001', '2023-09-18 06:58:33', '2023-09-18 12:01:00', 5),
('A070103', '2023-09-18 11:55:41', '2023-09-18 17:05:41', 5),
('A140403', '2023-09-18 06:54:50', '2023-09-18 12:00:50', 5);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hanghoa`
--

CREATE TABLE `hanghoa` (
  `MASP` char(13) NOT NULL,
  `TENSP` text NOT NULL,
  `MANH` char(7) NOT NULL,
  `NGAYSX` date NOT NULL,
  `HSD` date NOT NULL,
  `MANCC` char(7) NOT NULL,
  `DONVI` text NOT NULL,
  `GIANHAP` int(11) NOT NULL,
  `GIABAN` int(11) NOT NULL,
  `SOLUONG` int(11) NOT NULL,
  `XUATXU` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hanghoa`
--

INSERT INTO `hanghoa` (`MASP`, `TENSP`, `MANH`, `NGAYSX`, `HSD`, `MANCC`, `DONVI`, `GIANHAP`, `GIABAN`, `SOLUONG`, `XUATXU`) VALUES
('4902430556781', 'Tã dán Pampers nội địa Nhật Bản cao cấp thượng hạn', '0000004', '2022-01-01', '2023-12-30', 'NCCDYQN', 'VN', 30960, 46440, 10, 'Mỹ'),
('8657882990341', 'Nước giặt Downy vườn hoa thơm ngát túi 3.05kg', '0000003', '2022-01-01', '2023-12-30', 'NCCDYQN', 'VN', 89400, 134000, 20, 'Mỹ'),
('8809541033891', 'Mặt nạ chiết xuất từ nghệ Purederm dưỡng da', '0000005', '2022-01-01', '2023-12-30', 'NCCDYQN', 'VN', 5000, 8000, 100, 'Mỹ'),
('8835166023316', 'Lốc 3 cuộn túi rác đen tự huỷ sinh học', '0000002', '2022-01-01', '2023-12-30', 'NCCDYQN', 'VN', 33600, 50400, 50, 'Mỹ'),
('8843331098667', 'hùng 24 bịch sữa tiệt trùng ít đường Dutch Lady 180ml', '0000007', '2022-01-01', '2023-12-30', 'NCCDYQN', 'vn', 76200, 114300, 5, 'Mỹ'),
('8853301530293', 'Thức ăn cho chó lớn Pedigree vị bò kho và rau củ túi 130g', '0000001', '2022-01-01', '2023-12-30', 'NCCDYQN', 'vn', 9000, 13500, 100, 'Mỹ'),
('8934558928122', 'Dầu ăn cao cấp Happi Koki chai 1 lít', '0000012', '2022-01-01', '2023-12-30', 'NCCDYQN', 'VN', 20700, 31, 50, 'Mỹ'),
('8934561667891', 'Thùng 30 gói mì Hảo Hảo tôm chua cay 75g', '0000010', '2022-01-01', '2023-12-30', 'NCCDYQN', 'VN', 64800, 97200, 10, 'Mỹ'),
('8934822561234', 'Thùng 12 lon bia Bia Việt 330ml', '0000008', '2022-01-01', '2023-12-30', 'NCCDYQN', 'VN', 76200, 114300, 10, 'Mỹ'),
('8935162895621', 'Gạo thơm đặc sản Neptune ST25 túi 5kg', '0000009', '2022-01-01', '2023-12-30', 'NCCDYQN', 'VN', 81000, 129000, 10, 'Mỹ'),
('8936011896782', 'Sữa chua dẻo phô mai Merino gói 50g', '0000011', '2022-01-01', '2023-12-30', 'NCCDYQN', 'vn', 3600, 5400, 50, 'Mỹ'),
('8936021003321', 'Bánh trung thu Kinh Đô Heo Vàng nhân phô mai 120g', '0000006', '2022-01-01', '2023-12-30', 'NCCDYQN', 'vn', 27000, 40500, 10, 'Mỹ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `SOHD` int(11) NOT NULL,
  `MANV` char(7) NOT NULL,
  `THOIGIANLAP` datetime NOT NULL,
  `MAKH` char(7) NOT NULL,
  `TONGHD` int(11) NOT NULL,
  `CHIETKHAU` int(11) NOT NULL,
  `THANHTOAN` int(11) NOT NULL,
  `TIENKHACHDUA` int(11) NOT NULL,
  `TIENTRAKHACH` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `MAKH` char(7) NOT NULL,
  `TENKH` text NOT NULL,
  `NGAYSINH` date NOT NULL,
  `SDT` char(10) NOT NULL,
  `CCCD` char(12) NOT NULL,
  `DIACHI` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `MANCC` char(7) NOT NULL,
  `TENNCC` text NOT NULL,
  `SDT` char(10) NOT NULL,
  `DIACHI` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhacungcap`
--

INSERT INTO `nhacungcap` (`MANCC`, `TENNCC`, `SDT`, `DIACHI`) VALUES
('NCCDYQN', 'Nhà cung cấp cho CH', '0358808913', '477 Au duong lan');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MANV` char(7) NOT NULL,
  `TENNV` text NOT NULL,
  `NGAYSINH` date NOT NULL,
  `GIOITINH` text NOT NULL,
  `CCCD` char(12) NOT NULL,
  `SDT` char(10) NOT NULL,
  `EMAIL` text NOT NULL,
  `DIACHI` text NOT NULL,
  `MAQUYEN` char(7) NOT NULL,
  `NGAYBATDAU` date NOT NULL,
  `NGAYNGHIVIEC` date NOT NULL,
  `HESOLUONG` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MANV`, `TENNV`, `NGAYSINH`, `GIOITINH`, `CCCD`, `SDT`, `EMAIL`, `DIACHI`, `MAQUYEN`, `NGAYBATDAU`, `NGAYNGHIVIEC`, `HESOLUONG`) VALUES
('A000001', 'Võ Đinh Xuân Hoàng', '2003-02-02', 'nam', '068000000002', '0944313407', 'vodinhxuanhoang@gmail.com', '277 Au Duong Lan', 'NVBH203', '2023-01-01', '0000-00-00', 1),
('A000003', 'Nguyễn Trần Yến Nhi', '2003-02-02', 'nữ', '068000000000', '0368562519', 'tuoi@gmail.com', 'Thủ Đức', 'NVTK203', '2023-01-01', '0000-00-00', 1),
('A038645', 'Nguyễn Thị Anh Thư ', '2003-08-15', 'nữ', '068303002628', '0368779041', 'nguyenanhthu15082003@gmail.com', '101 Nguyễn Thị Tần', 'NVTK203', '2023-01-01', '0000-00-00', 1),
('A070103', 'Nguyễn Kế Cường', '2003-01-07', 'nam', '052000000000', '0682620178', 'kecuong0701@gmail.com', '477 Tân Sơn', 'NVBH203', '2023-01-01', '0000-00-00', 1),
('A140403', 'Đỗ Minh Khang', '2003-04-14', 'nam', '068000000001', '0838208944', 'khanglag@gmail.com', 'Duong Quan Ham', 'NVBH203', '2023-01-01', '0000-00-00', 1),
('B041003', 'Lê Duy Khang', '2003-10-04', 'nam', '091203002454', '0358808913', 'lehoanggiakhuong@gmail.com', '277 Âu Dương Lân', 'QL20003', '2023-01-01', '0000-00-00', 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhomhang`
--

CREATE TABLE `nhomhang` (
  `MANH` char(7) NOT NULL,
  `TENNH` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhomhang`
--

INSERT INTO `nhomhang` (`MANH`, `TENNH`) VALUES
('', ''),
('0000001', 'Chăm sóc thú cưng'),
('0000002', 'Đồ dùng gia đình'),
('0000003', 'Vệ sinh nhà cửa'),
('0000004', 'Sản phẩm cho mẹ và bé'),
('0000005', 'Chăm sóc cá nhân'),
('0000006', 'Bánh kẹo các loại'),
('0000007', 'Sửa các loại'),
('0000008', 'Bia, nước các loại'),
('0000009', 'gạo, bột, đồ khô'),
('0000010', 'mì, miến, cháo, phở'),
('0000011', 'kem, thực phẩm đông mát'),
('0000012', 'dầu ăn, nước chấm, gia vị');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phanca`
--

CREATE TABLE `phanca` (
  `MACA` char(1) NOT NULL,
  `MANV` char(7) NOT NULL,
  `SOGIO` int(11) NOT NULL,
  `NGAYLAM` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phanca`
--

INSERT INTO `phanca` (`MACA`, `MANV`, `SOGIO`, `NGAYLAM`) VALUES
('1', 'A000001', 5, '2023-09-18'),
('1', 'A140403', 5, '2023-09-18'),
('1', 'B041003', 5, '2023-09-18'),
('2', 'A070103', 5, '2023-09-18'),
('2', 'B041003', 5, '2023-09-18'),
('3', 'A000003', 5, '2023-09-18'),
('3', 'A038645', 5, '2023-09-18'),
('3', 'B041003', 5, '2023-09-18');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phanquyen`
--

CREATE TABLE `phanquyen` (
  `MAQUYEN` char(7) NOT NULL,
  `TENQUYEN` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phanquyen`
--

INSERT INTO `phanquyen` (`MAQUYEN`, `TENQUYEN`) VALUES
('NVBH203', 'Nhân viên bán hàng'),
('NVTK203', 'Nhân viên thủ kho'),
('QL20003', 'Quản lý');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieuchi`
--

CREATE TABLE `phieuchi` (
  `MAPHIEUCHI` char(7) NOT NULL,
  `SOTIEN` int(11) NOT NULL,
  `MANV` char(7) NOT NULL,
  `THOIGIANCHI` datetime NOT NULL,
  `LYDO` text NOT NULL,
  `GHICHU` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phieuchi`
--

INSERT INTO `phieuchi` (`MAPHIEUCHI`, `SOTIEN`, `MANV`, `THOIGIANCHI`, `LYDO`, `GHICHU`) VALUES
('0000001', 11269060, 'B041003', '2023-09-20 07:30:00', 'Chi tiền hàng', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MAPHIEUNHAP` char(7) NOT NULL,
  `MANV` char(7) NOT NULL,
  `MAHANGNHAP` char(13) NOT NULL,
  `TENHANGNHAP` text NOT NULL,
  `MANCC` char(7) NOT NULL,
  `THOIGIANNHAP` datetime NOT NULL,
  `SOLUONG` int(11) NOT NULL,
  `VAT` text NOT NULL,
  `TONGTIEN` double NOT NULL,
  `GIANHAP` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phieunhap`
--

INSERT INTO `phieunhap` (`MAPHIEUNHAP`, `MANV`, `MAHANGNHAP`, `TENHANGNHAP`, `MANCC`, `THOIGIANNHAP`, `SOLUONG`, `VAT`, `TONGTIEN`, `GIANHAP`) VALUES
('0000001', 'B041003', '4902430556781', 'Tã dán Pampers nội địa Nhật Bản cao cấp thượng hạng size M 52 miếng 6-11 kg', 'NCCDYQN', '2023-09-20 07:00:00', 10, '10%', 1000560, 30960),
('0000001', 'B041003', '8657882990341', 'Nước giặt Downy vườn hoa thơm ngát túi 3.05kg', 'NCCDYQN', '2023-09-20 07:00:00', 20, '10%', 1966800, 89400),
('0000001', 'B041003', '8809541033891', 'Mặt nạ chiết xuất từ nghệ Purederm dưỡng da', 'NCCDYQN', '2023-09-20 07:00:00', 100, '10%', 550000, 5000),
('0000001', 'B041003', '8835166023316', 'Lốc 3 cuộn túi rác đen tự huỷ sinh học Bách Hóa XANH 64x78cm (1kg)\r\n', 'NCCDYQN', '2023-09-20 07:00:00', 50, '10%', 1848000, 33600),
('0000001', 'B041003', '8843331098667', 'Thùng 24 bịch sữa tiệt trùng ít đường Dutch Lady Canxi & Protein 180ml', 'NCCDYQN', '2023-09-20 07:00:00', 5, '10%', 838200, 76200),
('0000001', 'B041003', '8853301530293', 'Thức ăn cho chó lớn Pedigree vị bò kho và rau củ túi 130g', 'NCCDYQN', '2023-09-20 07:00:00', 100, '10%', 990000, 9000),
('0000001', 'B041003', '8934558928122', 'Dầu ăn cao cấp Happi Koki chai 1 lít', 'NCCDYQN', '2023-09-20 07:00:00', 50, '10%', 1138500, 20700),
('0000001', 'B041003', '8934561667891', 'Thùng 30 gói mì Hảo Hảo tôm chua cay 75g', 'NCCDYQN', '2023-09-20 07:00:00', 10, '10%', 712800, 64800),
('0000001', 'B041003', '8934822561234', 'Thùng 12 lon bia Bia Việt 330ml', 'NCCDYQN', '2023-09-20 07:00:00', 10, '10%', 838200, 76200),
('0000001', 'B041003', '8935162895621', 'Gạo thơm đặc sản Neptune ST25 túi 5kg', 'NCCDYQN', '2023-09-20 07:00:00', 10, '10%', 891000, 81000),
('0000001', 'B041003', '8936011896782', 'Sữa chua dẻo phô mai Merino gói 50g', 'NCCDYQN', '2023-09-20 07:00:00', 50, '10%', 198000, 3600),
('0000001', 'B041003', '8936021003321', 'Bánh trung thu Kinh Đô Heo Vàng nhân phô mai 120g', 'NCCDYQN', '2023-09-20 07:00:00', 10, '10%', 297000, 27000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieuxuat`
--

CREATE TABLE `phieuxuat` (
  `MAPHIEUXUAT` char(7) NOT NULL,
  `MANV` char(7) NOT NULL,
  `THOIGIANXUAT` datetime NOT NULL,
  `MAHANGXUAT` char(13) NOT NULL,
  `SOLUONG` int(11) NOT NULL,
  `LYDO` text NOT NULL,
  `GHICHU` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phieuxuat`
--

INSERT INTO `phieuxuat` (`MAPHIEUXUAT`, `MANV`, `THOIGIANXUAT`, `MAHANGXUAT`, `SOLUONG`, `LYDO`, `GHICHU`) VALUES
('0000001', 'B041003', '2023-09-25 07:00:00', '4902430556781', 5, 'xuất hàng lên kệ', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `MANV` char(7) NOT NULL,
  `MATKHAU` text NOT NULL,
  `MAPQ` char(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`MANV`, `MATKHAU`, `MAPQ`) VALUES
('A000001', 'xhne', 'NVBH203'),
('A000003', 'tuoine', 'NVTK203'),
('A038645', '130613', 'NVTK203'),
('A070103', '070103', 'NVBH203'),
('A140403', '140403', 'NVBH203'),
('B041003', '100403', 'QL20003');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `anhsp`
--
ALTER TABLE `anhsp`
  ADD PRIMARY KEY (`MASP`);

--
-- Chỉ mục cho bảng `bangluong`
--
ALTER TABLE `bangluong`
  ADD PRIMARY KEY (`MANV`,`NGAYBDTINHCONG`);

--
-- Chỉ mục cho bảng `bienbanbangiaoca`
--
ALTER TABLE `bienbanbangiaoca`
  ADD PRIMARY KEY (`THOIGIANBANGIAO`),
  ADD KEY `MACA1` (`MACA1`),
  ADD KEY `MACA2` (`MACA2`),
  ADD KEY `MANVCA1` (`MANVCA1`),
  ADD KEY `MANVCA2` (`MANVCA2`);

--
-- Chỉ mục cho bảng `calamviec`
--
ALTER TABLE `calamviec`
  ADD PRIMARY KEY (`MACA`);

--
-- Chỉ mục cho bảng `chamcong`
--
ALTER TABLE `chamcong`
  ADD PRIMARY KEY (`MANV`,`THOIGIANCI`);

--
-- Chỉ mục cho bảng `hanghoa`
--
ALTER TABLE `hanghoa`
  ADD PRIMARY KEY (`MASP`),
  ADD KEY `MANH` (`MANH`),
  ADD KEY `MANCC` (`MANCC`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`SOHD`),
  ADD KEY `MANV` (`MANV`),
  ADD KEY `MAKH` (`MAKH`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MAKH`);

--
-- Chỉ mục cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`MANCC`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MANV`,`MAQUYEN`),
  ADD KEY `MAQUYEN` (`MAQUYEN`);

--
-- Chỉ mục cho bảng `nhomhang`
--
ALTER TABLE `nhomhang`
  ADD PRIMARY KEY (`MANH`);

--
-- Chỉ mục cho bảng `phanca`
--
ALTER TABLE `phanca`
  ADD PRIMARY KEY (`MACA`,`MANV`,`NGAYLAM`),
  ADD KEY `MACA` (`MACA`),
  ADD KEY `MANV` (`MANV`);

--
-- Chỉ mục cho bảng `phanquyen`
--
ALTER TABLE `phanquyen`
  ADD PRIMARY KEY (`MAQUYEN`);

--
-- Chỉ mục cho bảng `phieuchi`
--
ALTER TABLE `phieuchi`
  ADD PRIMARY KEY (`MAPHIEUCHI`),
  ADD KEY `MANV` (`MANV`);

--
-- Chỉ mục cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MAPHIEUNHAP`,`MAHANGNHAP`),
  ADD KEY `MANV` (`MANV`),
  ADD KEY `MANCC` (`MANCC`);

--
-- Chỉ mục cho bảng `phieuxuat`
--
ALTER TABLE `phieuxuat`
  ADD PRIMARY KEY (`MAPHIEUXUAT`),
  ADD KEY `MANV` (`MANV`),
  ADD KEY `MAHANGXUAT` (`MAHANGXUAT`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`MANV`),
  ADD KEY `MANV` (`MANV`,`MAPQ`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `anhsp`
--
ALTER TABLE `anhsp`
  ADD CONSTRAINT `anhsp_ibfk_1` FOREIGN KEY (`MASP`) REFERENCES `hanghoa` (`MASP`);

--
-- Các ràng buộc cho bảng `bangluong`
--
ALTER TABLE `bangluong`
  ADD CONSTRAINT `bangluong_ibfk_1` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`);

--
-- Các ràng buộc cho bảng `bienbanbangiaoca`
--
ALTER TABLE `bienbanbangiaoca`
  ADD CONSTRAINT `bienbanbangiaoca_ibfk_1` FOREIGN KEY (`MACA1`) REFERENCES `calamviec` (`MACA`),
  ADD CONSTRAINT `bienbanbangiaoca_ibfk_2` FOREIGN KEY (`MACA2`) REFERENCES `calamviec` (`MACA`),
  ADD CONSTRAINT `bienbanbangiaoca_ibfk_3` FOREIGN KEY (`MANVCA1`) REFERENCES `nhanvien` (`MANV`),
  ADD CONSTRAINT `bienbanbangiaoca_ibfk_4` FOREIGN KEY (`MANVCA2`) REFERENCES `nhanvien` (`MANV`);

--
-- Các ràng buộc cho bảng `chamcong`
--
ALTER TABLE `chamcong`
  ADD CONSTRAINT `chamcong_ibfk_1` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`);

--
-- Các ràng buộc cho bảng `hanghoa`
--
ALTER TABLE `hanghoa`
  ADD CONSTRAINT `hanghoa_ibfk_2` FOREIGN KEY (`MANCC`) REFERENCES `phieunhap` (`MANCC`),
  ADD CONSTRAINT `hanghoa_ibfk_3` FOREIGN KEY (`MANH`) REFERENCES `nhomhang` (`MANH`);

--
-- Các ràng buộc cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`),
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`MAKH`) REFERENCES `khachhang` (`MAKH`);

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`MAQUYEN`) REFERENCES `phanquyen` (`MAQUYEN`);

--
-- Các ràng buộc cho bảng `phanca`
--
ALTER TABLE `phanca`
  ADD CONSTRAINT `phanca_ibfk_1` FOREIGN KEY (`MACA`) REFERENCES `calamviec` (`MACA`),
  ADD CONSTRAINT `phanca_ibfk_2` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`);

--
-- Các ràng buộc cho bảng `phieuchi`
--
ALTER TABLE `phieuchi`
  ADD CONSTRAINT `phieuchi_ibfk_1` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`);

--
-- Các ràng buộc cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`),
  ADD CONSTRAINT `phieunhap_ibfk_2` FOREIGN KEY (`MANCC`) REFERENCES `nhacungcap` (`MANCC`);

--
-- Các ràng buộc cho bảng `phieuxuat`
--
ALTER TABLE `phieuxuat`
  ADD CONSTRAINT `phieuxuat_ibfk_1` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`),
  ADD CONSTRAINT `phieuxuat_ibfk_2` FOREIGN KEY (`MAHANGXUAT`) REFERENCES `hanghoa` (`MASP`);

--
-- Các ràng buộc cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`MANV`,`MAPQ`) REFERENCES `nhanvien` (`MANV`, `MAQUYEN`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
