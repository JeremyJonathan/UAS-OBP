-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 16, 2020 at 07:04 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.3.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `car_rental`
--

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE `car` (
  `id` int(11) NOT NULL,
  `nopol` varchar(10) NOT NULL,
  `merk` varchar(120) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`id`, `nopol`, `merk`, `price`) VALUES
(1, 'B1402DEX', 'Avanza', 1000000),
(2, 'B2020DES', 'Mercedes Benz', 10000000),
(4, 'B2803MAR', 'Kijang', 500000);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `nik` varchar(20) NOT NULL,
  `name` varchar(120) NOT NULL,
  `place` varchar(120) NOT NULL,
  `date` date NOT NULL,
  `phone` varchar(12) NOT NULL,
  `sex` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `nik`, `name`, `place`, `date`, `phone`, `sex`) VALUES
(1, '202028039810001', 'Joko Susanto', 'Jakart1', '2020-05-05', '0213909997', 0),
(2, '2020280039710001', 'Susi Juniarti', 'Bandung', '2020-03-05', '021987654', 1);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `uname` varchar(120) NOT NULL,
  `pswd` varchar(120) NOT NULL,
  `name` varchar(120) NOT NULL,
  `email` varchar(60) NOT NULL,
  `role` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `uname`, `pswd`, `name`, `email`, `role`) VALUES
(1, 'admin', 'admin', 'admin', 'admin@rental.com', 0),
(2, 'employee1', 'employee1', 'Employee 1', 'employee@rental.com', 1),
(3, 'employee2', 'employee2', 'Employee 2', 'employee2@rental.com', 1),
(4, 'employee3', 'employee3', 'Employee 3', 'employee3@rental.com', 1);

-- --------------------------------------------------------

--
-- Table structure for table `rent`
--

CREATE TABLE `rent` (
  `id` int(11) NOT NULL,
  `customer` int(11) NOT NULL,
  `car` int(11) NOT NULL,
  `start` date NOT NULL,
  `duration` int(11) NOT NULL,
  `finish` date NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rent`
--

INSERT INTO `rent` (`id`, `customer`, `car`, `start`, `duration`, `finish`, `total`) VALUES
(1, 1, 1, '2020-03-03', 7, '2020-03-10', 7000000),
(2, 2, 1, '2020-03-03', 3, '2020-03-06', 3000000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `car`
--
ALTER TABLE `car`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rent`
--
ALTER TABLE `rent`
  ADD PRIMARY KEY (`id`),
  ADD KEY `customer` (`customer`),
  ADD KEY `car` (`car`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `car`
--
ALTER TABLE `car`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `rent`
--
ALTER TABLE `rent`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
