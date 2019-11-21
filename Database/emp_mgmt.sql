-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 02, 2018 at 09:56 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `emp_mgmt`
--

-- --------------------------------------------------------

--
-- Table structure for table `emp`
--

CREATE TABLE `emp` (
  `Employee ID` int(8) NOT NULL,
  `Employee Name` varchar(50) NOT NULL,
  `Post` varchar(20) NOT NULL,
  `Age` int(3) NOT NULL,
  `Salary` int(8) NOT NULL,
  `Joining Date` date NOT NULL,
  `Password` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `emp`
--

INSERT INTO `emp` (`Employee ID`, `Employee Name`, `Post`, `Age`, `Salary`, `Joining Date`, `Password`) VALUES
(415484, 'fahim', 'Admin', 24, 25000, '2018-03-15', 123456),
(16320252, 'Hasan Shahrair', 'Software Engineer', 25, 65500, '2018-04-02', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `emp`
--
ALTER TABLE `emp`
  ADD PRIMARY KEY (`Employee ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `emp`
--
ALTER TABLE `emp`
  MODIFY `Employee ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16320253;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
