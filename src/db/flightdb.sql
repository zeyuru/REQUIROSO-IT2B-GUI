-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2025 at 07:24 PM
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
-- Table structure for table `bookings`
--

CREATE TABLE `bookings` (
  `booking_id` int(11) NOT NULL,
  `passenger_id` int(11) NOT NULL,
  `flight_id` int(11) NOT NULL,
  `booking_date` datetime NOT NULL,
  `status` enum('Pending','Accepted','Rejected') DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bookings`
--

INSERT INTO `bookings` (`booking_id`, `passenger_id`, `flight_id`, `booking_date`, `status`) VALUES
(8, 35, 3, '2025-05-05 01:07:33', ''),
(9, 36, 4, '2025-05-05 17:12:14', ''),
(10, 36, 4, '2025-05-05 17:20:43', ''),
(11, 35, 4, '2025-05-05 17:26:23', ''),
(12, 35, 3, '2025-05-28 00:19:10', 'Accepted'),
(13, 35, 5, '2025-05-28 00:41:34', 'Rejected');

-- --------------------------------------------------------

--
-- Table structure for table `flights`
--

CREATE TABLE `flights` (
  `flight_id` int(11) NOT NULL,
  `flight_number` varchar(255) NOT NULL,
  `departure_airport` varchar(255) NOT NULL,
  `arrival_airport` varchar(255) NOT NULL,
  `departure_time` datetime NOT NULL,
  `arrival_time` datetime NOT NULL,
  `airline` varchar(255) NOT NULL,
  `capacity` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `flights`
--

INSERT INTO `flights` (`flight_id`, `flight_number`, `departure_airport`, `arrival_airport`, `departure_time`, `arrival_time`, `airline`, `capacity`, `price`, `status`) VALUES
(3, 'CA12345', 'MACTAN AIRPORT', 'MANILA AIRPORT', '2025-05-03 15:00:00', '2025-05-03 18:00:00', 'MATRIX AIRLINES', 244, 15000, 'Done'),
(4, 'BA12345', 'MANILA AIRPORT', 'MACTAN AIRPORT', '2025-05-03 18:00:00', '2025-05-03 21:00:00', 'MATRIX AIRLINES', 244, 15000, 'Scheduled'),
(5, 'BBK321', 'Japan', 'Mactan', '2023-11-15 14:30:00', '2023-11-15 20:30:00', 'MATRIX AIRLINES', 199, 30000, 'Scheduled');

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
  `p_password` varchar(150) NOT NULL,
  `p_usertype` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `p_image` varchar(100) DEFAULT NULL,
  `security_question` varchar(100) NOT NULL,
  `security_answer` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `passengers`
--

INSERT INTO `passengers` (`p_id`, `p_fname`, `p_lname`, `p_username`, `p_email`, `p_passport`, `p_pnumber`, `p_password`, `p_usertype`, `status`, `p_image`, `security_question`, `security_answer`) VALUES
(28, 'Aaron', 'Ruiz', 'zeyuru', 'requirosoaaronr@gmail.com', 'B12345', '09455214472', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Admin', 'Active', 'src/userimages/blazing.png', 'What was your first pet\'s name?', 'DHpIG8tR8uRj+gVoUiWVMFWLTwXkzd7ayRhf6yQ3eSw='),
(30, 'Jonash', 'Nogra', 'nash', 'nashu@gmail.com', 'CA16531', '0998765332', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Admin', 'Active', '', 'What was your first pet\'s name?', 'LzNhKxiqi16RLkczY1cCdvjq2TRuykwprc5pIlj33r4='),
(31, 'John', 'Lloyd', 'lloyd', 'lloyd@yahoo.com', 'BBKA213', '0986521421', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Passenger', 'Pending', 'src/userimages/bigman.png', 'What was your first pet\'s name?', 'JU3FtMxkBHEgdtR1h3oRETmNIGDbD0V7tfsyuuo9wbw='),
(32, 'Jodee', 'Somera', 'jd', 'jd@yahoo.com', 'BBKA321', '0936216231', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Passenger', 'Pending', 'default.jpg', 'What was your first pet\'s name?', 'rT5p6aqGBlfMZHZ3D+JT0IGYdGufz53DGGtH64XDAzU='),
(33, 'Lyle', 'Canoy', 'lyle', 'lyle@yahoo.com', 'BBKA23135', '093217213', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Passenger', 'Active', 'src/userimages/user.png', 'What city were you born in? ', 'sFkE7tNmG28r+u8hmctxF88lFD+haG+oNhl61NcAX7s='),
(34, 'test', 'test', 'test', 'test@gmail.com', '123123123', '123123123', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Admin', 'Pending', NULL, 'What was your first pet\'s name?', 'n4bQgYhMfWWaL+qgxVrQFaO/TxsrC4Is0V1sFbDwCgg='),
(35, 'Patty', 'Blaze', 'patty', 'patty@gmail.com', '123123123', '123123123', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Passenger', 'Active', NULL, 'What was your first pet\'s name?', '1HxvWRpne6gL0vTohPOn8V/ZtKujbGjfFhUX9ZT46UI='),
(36, 'ad', 'hd', 'adhd', 'adhd@yahoo.com', 'ADHD32134', '0912345678', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'Passenger', 'Active', NULL, 'What was your first pet\'s name?', '8/k6OF4jubHPPcQzUpp5e9qmaIQzCYE/Umn+9UIIYg8=');

-- --------------------------------------------------------

--
-- Table structure for table `system_logs`
--

CREATE TABLE `system_logs` (
  `log_id` int(11) NOT NULL,
  `p_id` int(11) NOT NULL,
  `user_type` enum('ADMIN','PASSENGER') NOT NULL,
  `action` enum('LOGIN','LOGOUT') NOT NULL,
  `timestamp` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `system_logs`
--

INSERT INTO `system_logs` (`log_id`, `p_id`, `user_type`, `action`, `timestamp`) VALUES
(7, 28, 'ADMIN', 'LOGIN', '2025-05-05 17:08:15'),
(8, 28, 'ADMIN', 'LOGIN', '2025-05-05 17:10:52'),
(10, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:11:13'),
(12, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:11:34'),
(14, 28, 'ADMIN', 'LOGIN', '2025-05-05 17:11:39'),
(15, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:11:59'),
(17, 35, 'PASSENGER', 'LOGIN', '2025-05-05 17:15:00'),
(18, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:15:59'),
(19, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:16:43'),
(21, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:17:27'),
(23, 35, 'PASSENGER', 'LOGIN', '2025-05-05 17:19:54'),
(24, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:20:36'),
(25, 35, 'PASSENGER', 'LOGIN', '2025-05-05 17:26:13'),
(26, 28, 'ADMIN', 'LOGIN', '2025-05-05 17:27:01'),
(27, 28, 'ADMIN', 'LOGIN', '2025-05-05 17:27:51'),
(28, 35, 'PASSENGER', 'LOGIN', '2025-05-05 17:32:03'),
(30, 35, 'PASSENGER', 'LOGIN', '2025-05-05 21:20:42'),
(31, 35, 'PASSENGER', 'LOGIN', '2025-05-05 21:22:18'),
(33, 28, 'ADMIN', 'LOGIN', '2025-05-05 21:25:51'),
(34, 28, 'ADMIN', 'LOGIN', '2025-05-14 17:49:32'),
(36, 35, 'PASSENGER', 'LOGIN', '2025-05-14 17:50:11'),
(37, 35, 'PASSENGER', 'LOGIN', '2025-05-14 17:57:30'),
(38, 35, 'PASSENGER', 'LOGIN', '2025-05-14 17:58:14'),
(39, 28, 'ADMIN', 'LOGIN', '2025-05-14 18:00:47'),
(41, 35, 'PASSENGER', 'LOGIN', '2025-05-14 18:00:51'),
(43, 35, 'PASSENGER', 'LOGIN', '2025-05-14 19:26:43'),
(44, 35, 'PASSENGER', 'LOGIN', '2025-05-14 19:27:23'),
(45, 35, 'PASSENGER', 'LOGIN', '2025-05-14 19:29:35'),
(46, 28, 'ADMIN', 'LOGIN', '2025-05-14 19:38:03'),
(47, 28, 'ADMIN', 'LOGIN', '2025-05-14 19:39:42'),
(48, 35, 'PASSENGER', 'LOGIN', '2025-05-14 19:50:31'),
(49, 35, 'PASSENGER', 'LOGIN', '2025-05-14 19:51:19'),
(50, 35, 'PASSENGER', 'LOGIN', '2025-05-14 19:54:19'),
(51, 35, 'PASSENGER', 'LOGIN', '2025-05-14 19:54:59'),
(52, 35, 'PASSENGER', 'LOGIN', '2025-05-14 19:55:20'),
(53, 35, 'PASSENGER', 'LOGIN', '2025-05-14 20:59:22'),
(54, 28, 'ADMIN', 'LOGIN', '2025-05-14 21:05:22'),
(55, 28, 'ADMIN', 'LOGIN', '2025-05-14 21:07:43'),
(56, 35, 'PASSENGER', 'LOGIN', '2025-05-14 21:09:10'),
(57, 35, 'PASSENGER', 'LOGIN', '2025-05-14 22:54:39'),
(58, 35, 'PASSENGER', 'LOGIN', '2025-05-14 22:57:08'),
(60, 28, 'ADMIN', 'LOGIN', '2025-05-14 22:57:26'),
(62, 35, 'PASSENGER', 'LOGIN', '2025-05-14 22:59:29'),
(63, 35, 'PASSENGER', 'LOGIN', '2025-05-14 23:30:29'),
(64, 28, 'ADMIN', 'LOGIN', '2025-05-28 00:11:46'),
(65, 28, 'ADMIN', 'LOGIN', '2025-05-28 00:13:28'),
(66, 28, 'ADMIN', 'LOGIN', '2025-05-28 00:17:22'),
(67, 35, 'PASSENGER', 'LOGIN', '2025-05-28 00:19:01'),
(68, 28, 'ADMIN', 'LOGIN', '2025-05-28 00:19:21'),
(69, 28, 'ADMIN', 'LOGIN', '2025-05-28 00:19:59'),
(71, 35, 'PASSENGER', 'LOGIN', '2025-05-28 00:20:12'),
(72, 28, 'ADMIN', 'LOGIN', '2025-05-28 00:22:52'),
(73, 35, 'PASSENGER', 'LOGIN', '2025-05-28 00:39:19'),
(74, 35, 'PASSENGER', 'LOGIN', '2025-05-28 00:39:28'),
(75, 35, 'PASSENGER', 'LOGIN', '2025-05-28 00:40:42'),
(77, 28, 'ADMIN', 'LOGIN', '2025-05-28 00:40:59'),
(79, 35, 'PASSENGER', 'LOGIN', '2025-05-28 00:41:07'),
(80, 35, 'PASSENGER', 'LOGIN', '2025-05-28 00:41:28'),
(82, 28, 'ADMIN', 'LOGIN', '2025-05-28 00:41:43'),
(84, 35, 'PASSENGER', 'LOGIN', '2025-05-28 00:41:55'),
(85, 28, 'ADMIN', 'LOGIN', '2025-05-28 00:42:20'),
(86, 28, 'ADMIN', 'LOGIN', '2025-05-28 00:44:03'),
(87, 28, 'ADMIN', 'LOGIN', '2025-05-28 00:45:47'),
(88, 28, 'ADMIN', 'LOGIN', '2025-05-28 00:46:38'),
(89, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:02:01'),
(91, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:02:59'),
(92, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:04:35'),
(93, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:06:30'),
(94, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:07:16'),
(95, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:09:00'),
(96, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:10:01'),
(97, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:10:46'),
(99, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:13:24'),
(100, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:13:39'),
(101, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:14:28'),
(102, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:14:42'),
(103, 28, 'ADMIN', 'LOGIN', '2025-05-28 01:15:40');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bookings`
--
ALTER TABLE `bookings`
  ADD PRIMARY KEY (`booking_id`),
  ADD KEY `flight_id` (`flight_id`),
  ADD KEY `fk_passenger` (`passenger_id`);

--
-- Indexes for table `flights`
--
ALTER TABLE `flights`
  ADD PRIMARY KEY (`flight_id`);

--
-- Indexes for table `passengers`
--
ALTER TABLE `passengers`
  ADD PRIMARY KEY (`p_id`),
  ADD UNIQUE KEY `p_email` (`p_email`);

--
-- Indexes for table `system_logs`
--
ALTER TABLE `system_logs`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `fk_logs_passenger` (`p_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bookings`
--
ALTER TABLE `bookings`
  MODIFY `booking_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `flights`
--
ALTER TABLE `flights`
  MODIFY `flight_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `passengers`
--
ALTER TABLE `passengers`
  MODIFY `p_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `system_logs`
--
ALTER TABLE `system_logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bookings`
--
ALTER TABLE `bookings`
  ADD CONSTRAINT `bookings_ibfk_1` FOREIGN KEY (`passenger_id`) REFERENCES `passengers` (`p_id`),
  ADD CONSTRAINT `bookings_ibfk_2` FOREIGN KEY (`flight_id`) REFERENCES `flights` (`flight_id`),
  ADD CONSTRAINT `fk_passenger` FOREIGN KEY (`passenger_id`) REFERENCES `passengers` (`p_id`);

--
-- Constraints for table `system_logs`
--
ALTER TABLE `system_logs`
  ADD CONSTRAINT `fk_logs_passenger` FOREIGN KEY (`p_id`) REFERENCES `passengers` (`p_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
