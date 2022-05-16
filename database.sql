create database QuanLiCamDo
go
use QuanLiCamDo
go
create table NguoiDung(
	tenDN nvarchar(20) not null primary key,
	SDT nchar(12) not null,
	matKhau nchar(20) not null
)

create table NhanVien(
	maNV	nvarchar(20) not null primary key,
	hoTen	nvarchar(50) not null,
	ngaySinh varchar(50) not null,
	chucVu	nvarchar(50),
	email	nvarchar(50),
	sdt		char(20),
	gioiTinh nvarchar(10) not null,
	diaChi	nvarchar(50)
	
)