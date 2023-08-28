-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 09, 2021 at 08:28 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_sinarharapanpos`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_akun`
--

CREATE TABLE `tb_akun` (
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `level` enum('admin','karyawan') NOT NULL,
  `id_karyawan` char(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_akun`
--

INSERT INTO `tb_akun` (`username`, `password`, `level`, `id_karyawan`) VALUES
('admin', '123456', 'admin', 'AD0001'),
('adr', '456', 'karyawan', 'KR0002'),
('syp', '123', 'karyawan', 'KR0001');

-- --------------------------------------------------------

--
-- Table structure for table `tb_barang`
--

CREATE TABLE `tb_barang` (
  `id_barang` char(6) NOT NULL,
  `nama_barang` varchar(225) NOT NULL,
  `kuantitas` int(6) NOT NULL,
  `harga_beli` int(8) NOT NULL,
  `harga_jual` int(8) NOT NULL,
  `id_jenis` char(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_barang`
--

INSERT INTO `tb_barang` (`id_barang`, `nama_barang`, `kuantitas`, `harga_beli`, `harga_jual`, `id_jenis`) VALUES
('BR0001', 'Nippon paint 1kg', 42, 12000, 15000, 'JS001'),
('BR0002', 'Nippont paint 2kg', 110, 20000, 23000, 'JS001'),
('BR0003', 'rucika tipe 1', 31, 20000, 22000, 'JS002'),
('BR0004', 'Pipa Tipe 77', 2571, 12300, 15000, 'JS002'),
('BR001', 'Paku Tipe 1', 598, 1250, 1500, 'JS003'),
('BR003', 'Tes', 50, 12000, 13000, 'JS003');

-- --------------------------------------------------------

--
-- Table structure for table `tb_detail_pembelian`
--

CREATE TABLE `tb_detail_pembelian` (
  `id_pembelian` int(11) NOT NULL,
  `id_barang` char(6) NOT NULL,
  `jumlah` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_detail_pembelian`
--

INSERT INTO `tb_detail_pembelian` (`id_pembelian`, `id_barang`, `jumlah`) VALUES
(3, 'BR0001', 3),
(3, 'BR0002', 3),
(4, 'BR0001', 3),
(4, 'BR0002', 3),
(5, 'BR0001', 100),
(6, 'BR0001', 4),
(6, 'BR001', 42),
(6, 'BR0003', 1),
(7, 'BR0001', 3),
(7, 'BR0003', 4),
(7, 'BR001', 410),
(8, 'BR0002', 2),
(9, 'BR0002', 5),
(9, 'BR0002', 54),
(9, 'BR0004', 3),
(10, 'BR0002', 5),
(10, 'BR001', 4),
(11, 'BR0001', 6),
(11, 'BR0003', 6),
(11, 'BR001', 3),
(12, 'BR0001', 4),
(12, 'BR0003', 2),
(13, 'BR001', 12),
(13, 'BR0004', 122),
(14, 'BR0001', 2),
(14, 'BR003', 2),
(15, 'BR0003', 2),
(15, 'BR003', 3);

-- --------------------------------------------------------

--
-- Table structure for table `tb_detail_penjualan`
--

CREATE TABLE `tb_detail_penjualan` (
  `id_penjualan` int(11) NOT NULL,
  `id_barang` char(6) NOT NULL,
  `jumlah` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_detail_penjualan`
--

INSERT INTO `tb_detail_penjualan` (`id_penjualan`, `id_barang`, `jumlah`) VALUES
(80, 'BR0001', 2),
(80, 'BR0003', 2),
(81, 'BR0004', 2),
(81, 'BR0001', 2),
(84, 'BR0003', 2),
(84, 'BR001', 2),
(85, 'BR0003', 2),
(85, 'BR0004', 22),
(86, 'BR0002', 2),
(86, 'BR0003', 22),
(87, 'BR0002', 2),
(88, 'BR0001', 4),
(88, 'BR001', 43),
(89, 'BR0001', 2),
(89, 'BR001', 23),
(90, 'BR0002', 2),
(90, 'BR0004', 3),
(93, 'BR0001', 2),
(93, 'BR0004', 2),
(93, 'BR001', 3),
(94, 'BR0001', 100),
(95, 'BR0001', 2),
(95, 'BR0004', 23),
(96, 'BR0003', 2),
(96, 'BR001', 4),
(97, 'BR0003', 2),
(97, 'BR0004', 3),
(110, 'BR0002', 2);

-- --------------------------------------------------------

--
-- Table structure for table `tb_jenis_barang`
--

CREATE TABLE `tb_jenis_barang` (
  `id_jenis` char(6) NOT NULL,
  `nama_jenis` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_jenis_barang`
--

INSERT INTO `tb_jenis_barang` (`id_jenis`, `nama_jenis`) VALUES
('JS001', 'Cat Tembok'),
('JS002', 'Pipa'),
('JS003', 'Paku'),
('JS004', 'Semen'),
('JS005', 'Kapur'),
('JS006', 'Tes');

-- --------------------------------------------------------

--
-- Table structure for table `tb_karyawan`
--

CREATE TABLE `tb_karyawan` (
  `id_karyawan` char(6) NOT NULL,
  `nama_karyawan` varchar(225) NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `email` varchar(225) NOT NULL,
  `tgl_lahir` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_karyawan`
--

INSERT INTO `tb_karyawan` (`id_karyawan`, `nama_karyawan`, `jenis_kelamin`, `alamat`, `no_hp`, `email`, `tgl_lahir`) VALUES
('AD0001', 'admin', 'Laki-laki', '-', '-', '-', '1992-11-02'),
('KR0001', 'Satria Yuda Pamungkas', 'Laki-laki', 'Situbondo', '082332665746', 'satria@gmail.com', '1999-07-02'),
('KR0002', 'Andru Christo', 'Laki-laki', 'Jember', '082334554345', 'andru@gmail.com', '2002-03-23');

-- --------------------------------------------------------

--
-- Table structure for table `tb_ongkir`
--

CREATE TABLE `tb_ongkir` (
  `id_ongkir` int(11) NOT NULL,
  `id_penjualan` int(11) NOT NULL,
  `berat` float NOT NULL,
  `jarak` float NOT NULL,
  `harga_ongkir` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_ongkir`
--

INSERT INTO `tb_ongkir` (`id_ongkir`, `id_penjualan`, `berat`, `jarak`, `harga_ongkir`) VALUES
(50, 80, 2, 2, 4000),
(51, 85, 12, 12, 144000),
(52, 86, 2, 3, 6000),
(53, 87, 0, 0, 0),
(54, 88, 2, 2, 4000),
(55, 90, 2, 3, 6000),
(56, 91, 0, 0, 0),
(57, 92, 0, 0, 0),
(58, 94, 0, 0, 0),
(59, 96, 12, 2, 72000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_pembelian`
--

CREATE TABLE `tb_pembelian` (
  `id_pembelian` int(4) NOT NULL,
  `tgl_pembelian` datetime NOT NULL,
  `total_harga` int(10) NOT NULL,
  `id_supplier` char(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pembelian`
--

INSERT INTO `tb_pembelian` (`id_pembelian`, `tgl_pembelian`, `total_harga`, `id_supplier`) VALUES
(3, '2021-12-06 22:51:35', 96000, 'SP0002'),
(4, '2021-12-06 22:51:40', 96000, 'SP0002'),
(5, '2021-12-06 22:52:11', 1200000, 'SP0001'),
(6, '2021-12-06 22:55:31', 164944, 'SP0001'),
(7, '2021-12-06 22:56:13', 628500, 'SP0002'),
(8, '2021-12-06 22:57:16', 40000, 'SP0001'),
(9, '2021-12-06 22:59:43', 1216900, 'SP0002'),
(10, '2021-12-06 23:01:00', 105000, 'SP0002'),
(11, '2021-12-07 08:53:32', 195750, 'SP0005'),
(12, '2021-12-08 00:10:47', 88000, 'SP0001'),
(13, '2021-12-08 09:22:44', 1528600, 'SP0005'),
(14, '2021-12-08 09:23:01', 1348000, 'SP0001'),
(15, '2021-12-08 18:58:08', 76000, 'SP0001');

-- --------------------------------------------------------

--
-- Table structure for table `tb_penjualan`
--

CREATE TABLE `tb_penjualan` (
  `id_penjualan` int(11) NOT NULL,
  `tgl_penjualan` datetime NOT NULL,
  `total_harga` int(10) NOT NULL,
  `id_karyawan` char(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_penjualan`
--

INSERT INTO `tb_penjualan` (`id_penjualan`, `tgl_penjualan`, `total_harga`, `id_karyawan`) VALUES
(80, '2021-12-07 18:23:37', 0, 'KR0001'),
(81, '2021-12-07 18:23:48', 52600, 'KR0001'),
(84, '2021-12-07 18:26:46', 46500, 'KR0001'),
(85, '2021-12-07 21:26:09', 454600, 'KR0001'),
(86, '2021-12-07 21:28:14', 486000, 'KR0001'),
(87, '2021-12-07 21:29:49', 40000, 'KR0001'),
(88, '2021-12-07 22:48:27', 105750, 'KR0001'),
(89, '2021-12-07 22:50:17', 52750, 'KR0001'),
(90, '2021-12-08 00:11:23', 82900, 'KR0001'),
(91, '2021-12-08 08:32:19', 0, 'KR0001'),
(92, '2021-12-08 08:34:58', 0, 'KR0001'),
(93, '2021-12-08 09:53:08', 52350, 'KR0001'),
(94, '2021-12-08 10:39:34', 1500000, 'KR0001'),
(95, '2021-12-08 11:11:31', 375000, 'KR0001'),
(96, '2021-12-08 14:21:42', 122000, 'KR0001'),
(97, '2021-12-08 16:10:55', 89000, 'KR0001'),
(110, '2021-12-08 16:26:47', 46000, 'KR0001');

-- --------------------------------------------------------

--
-- Table structure for table `tb_supplier`
--

CREATE TABLE `tb_supplier` (
  `id_supplier` char(6) NOT NULL,
  `nama_supplier` varchar(225) NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_supplier`
--

INSERT INTO `tb_supplier` (`id_supplier`, `nama_supplier`, `alamat`, `no_hp`) VALUES
('SP0001', 'PT Indo Jaya', 'Jl Kenangan No 22', '084332443567'),
('SP0002', 'PT Indah Bunga', 'Jl Ahmad Yani No 33', '082332445435'),
('SP0005', 'PT Maju Mundur', 'Situbondo', '082334554567');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_akun`
--
ALTER TABLE `tb_akun`
  ADD PRIMARY KEY (`username`),
  ADD KEY `id_karyawan` (`id_karyawan`);

--
-- Indexes for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD PRIMARY KEY (`id_barang`),
  ADD KEY `id_jenis` (`id_jenis`);

--
-- Indexes for table `tb_detail_pembelian`
--
ALTER TABLE `tb_detail_pembelian`
  ADD KEY `id_barang` (`id_barang`),
  ADD KEY `id_pembelian` (`id_pembelian`);

--
-- Indexes for table `tb_detail_penjualan`
--
ALTER TABLE `tb_detail_penjualan`
  ADD KEY `id_barang` (`id_barang`),
  ADD KEY `id_pembelian` (`id_penjualan`);

--
-- Indexes for table `tb_jenis_barang`
--
ALTER TABLE `tb_jenis_barang`
  ADD PRIMARY KEY (`id_jenis`);

--
-- Indexes for table `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indexes for table `tb_ongkir`
--
ALTER TABLE `tb_ongkir`
  ADD PRIMARY KEY (`id_ongkir`),
  ADD KEY `id_penjualan` (`id_penjualan`);

--
-- Indexes for table `tb_pembelian`
--
ALTER TABLE `tb_pembelian`
  ADD PRIMARY KEY (`id_pembelian`),
  ADD KEY `id_supplier` (`id_supplier`);

--
-- Indexes for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `id_karyawan` (`id_karyawan`);

--
-- Indexes for table `tb_supplier`
--
ALTER TABLE `tb_supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_ongkir`
--
ALTER TABLE `tb_ongkir`
  MODIFY `id_ongkir` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- AUTO_INCREMENT for table `tb_pembelian`
--
ALTER TABLE `tb_pembelian`
  MODIFY `id_pembelian` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  MODIFY `id_penjualan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=167;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_akun`
--
ALTER TABLE `tb_akun`
  ADD CONSTRAINT `tb_akun_ibfk_1` FOREIGN KEY (`id_karyawan`) REFERENCES `tb_karyawan` (`id_karyawan`);

--
-- Constraints for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD CONSTRAINT `tb_barang_ibfk_1` FOREIGN KEY (`id_jenis`) REFERENCES `tb_jenis_barang` (`id_jenis`);

--
-- Constraints for table `tb_detail_pembelian`
--
ALTER TABLE `tb_detail_pembelian`
  ADD CONSTRAINT `tb_detail_pembelian_ibfk_2` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id_barang`),
  ADD CONSTRAINT `tb_detail_pembelian_ibfk_3` FOREIGN KEY (`id_pembelian`) REFERENCES `tb_pembelian` (`id_pembelian`) ON UPDATE CASCADE;

--
-- Constraints for table `tb_detail_penjualan`
--
ALTER TABLE `tb_detail_penjualan`
  ADD CONSTRAINT `tb_detail_penjualan_ibfk_2` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id_barang`),
  ADD CONSTRAINT `tb_detail_penjualan_ibfk_3` FOREIGN KEY (`id_penjualan`) REFERENCES `tb_penjualan` (`id_penjualan`) ON UPDATE CASCADE;

--
-- Constraints for table `tb_ongkir`
--
ALTER TABLE `tb_ongkir`
  ADD CONSTRAINT `tb_ongkir_ibfk_1` FOREIGN KEY (`id_penjualan`) REFERENCES `tb_penjualan` (`id_penjualan`) ON UPDATE CASCADE;

--
-- Constraints for table `tb_pembelian`
--
ALTER TABLE `tb_pembelian`
  ADD CONSTRAINT `tb_pembelian_ibfk_1` FOREIGN KEY (`id_supplier`) REFERENCES `tb_supplier` (`id_supplier`);

--
-- Constraints for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  ADD CONSTRAINT `penjualan_karyawan` FOREIGN KEY (`id_karyawan`) REFERENCES `tb_karyawan` (`id_karyawan`) ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_penjualan_ibfk_1` FOREIGN KEY (`id_karyawan`) REFERENCES `tb_karyawan` (`id_karyawan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
