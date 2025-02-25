-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 25, 2025 at 12:08 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `flightdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `passengers`
--

CREATE TABLE `passengers` (
  `p_id` int(11) NOT NULL,
  `p_fname` varchar(50) NOT NULL,
  `p_lname` varchar(50) NOT NULL,
  `p_username` varchar(50) NOT NULL,
  `p_email` varchar(50) NOT NULL,
  `p_passport` varchar(50) NOT NULL,
  `p_pnumber` varchar(50) NOT NULL,
  `p_password` varchar(50) NOT NULL,
  `p_usertype` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `passengers`
--

INSERT INTO `passengers` (`p_id`, `p_fname`, `p_lname`, `p_username`, `p_email`, `p_passport`, `p_pnumber`, `p_password`, `p_usertype`, `status`) VALUES
(3, 'Aaron', 'Ruiz', 'zeyuru', 'requirosoaaronr@gmail.com', 'BSIT12345', '09455214472', '1234', 'Admin', 'Active'),
(4, 'Aaron', 'Ruiz', 'ruiz1217', 'requirosoaaron@gmail.com', 'BSIT2C', '09455214472', '12345678', 'Admin', 'Pending'),
(5, 'Aaron', 'Ruiz', 'aaron', 'ruiz@yahoo.com', 'BSIT2CCC', '0912345678', '12345678', 'Passenger', 'Pending'),
(6, 'Jonash', 'Nogra', 'nash', 'Nogger@gmail.com', 'NerdBehavior', '096996969', '12345678', 'Passenger', 'Pending'),
(7, 'Jericho', 'Alcala', 'jericho', 'eko@gmail.com', 'BSIT2C', '091234567', '12345678', 'Passenger', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `passengers`
--
ALTER TABLE `passengers`
  ADD PRIMARY KEY (`p_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `passengers`
--
ALTER TABLE `passengers`
  MODIFY `p_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
