-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2025 at 11:51 AM
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
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bookings`
--

INSERT INTO `bookings` (`booking_id`, `passenger_id`, `flight_id`, `booking_date`, `status`) VALUES
(8, 35, 3, '2025-05-05 01:07:33', 'Confirmed'),
(9, 36, 4, '2025-05-05 17:12:14', 'Confirmed'),
(10, 36, 4, '2025-05-05 17:20:43', 'Confirmed'),
(11, 35, 4, '2025-05-05 17:26:23', 'Confirmed');

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
(3, 'CA12345', 'MACTAN AIRPORT', 'MANILA AIRPORT', '2025-05-03 15:00:00', '2025-05-03 18:00:00', 'MATRIX AIRLINES', 245, 15000, 'Scheduled'),
(4, 'BA12345', 'MANILA AIRPORT', 'MACTAN AIRPORT', '2025-05-03 18:00:00', '2025-05-03 21:00:00', 'MATRIX AIRLINES', 244, 15000, 'Scheduled'),
(5, 'BBK321', 'Japan', 'Mactan', '2023-11-15 14:30:00', '2023-11-15 20:30:00', 'MATRIX AIRLINES', 200, 30000, 'Scheduled');

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
(29, 'Fritzie', 'Waskin', 'waskin', 'waskin@gmail.com', 'BA12345', '0912345678', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Passenger', 'Pending', '', 'What city were you born in?', '8fTAdauUny/Z6EdZhi3IiXxOVM8JP1ea+5j7zNgF0NE='),
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
(1, -1, 'ADMIN', 'LOGIN', '2025-05-05 02:25:29'),
(2, -1, 'PASSENGER', 'LOGIN', '2025-05-05 02:26:39'),
(3, 0, 'PASSENGER', 'LOGOUT', '2025-05-05 02:26:40'),
(4, -1, 'ADMIN', 'LOGIN', '2025-05-05 02:26:43'),
(5, -1, 'ADMIN', 'LOGIN', '2025-05-05 02:28:08'),
(6, -1, 'ADMIN', 'LOGIN', '2025-05-05 02:28:44'),
(7, 28, 'ADMIN', 'LOGIN', '2025-05-05 17:08:15'),
(8, 28, 'ADMIN', 'LOGIN', '2025-05-05 17:10:52'),
(9, 0, 'ADMIN', 'LOGOUT', '2025-05-05 17:11:09'),
(10, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:11:13'),
(11, 0, 'PASSENGER', 'LOGOUT', '2025-05-05 17:11:31'),
(12, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:11:34'),
(13, 0, 'PASSENGER', 'LOGOUT', '2025-05-05 17:11:36'),
(14, 28, 'ADMIN', 'LOGIN', '2025-05-05 17:11:39'),
(15, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:11:59'),
(16, 0, 'PASSENGER', 'LOGOUT', '2025-05-05 17:12:48'),
(17, 35, 'PASSENGER', 'LOGIN', '2025-05-05 17:15:00'),
(18, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:15:59'),
(19, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:16:43'),
(20, 0, 'PASSENGER', 'LOGOUT', '2025-05-05 17:16:54'),
(21, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:17:27'),
(22, 0, 'PASSENGER', 'LOGOUT', '2025-05-05 17:17:37'),
(23, 35, 'PASSENGER', 'LOGIN', '2025-05-05 17:19:54'),
(24, 36, 'PASSENGER', 'LOGIN', '2025-05-05 17:20:36'),
(25, 35, 'PASSENGER', 'LOGIN', '2025-05-05 17:26:13'),
(26, 28, 'ADMIN', 'LOGIN', '2025-05-05 17:27:01'),
(27, 28, 'ADMIN', 'LOGIN', '2025-05-05 17:27:51'),
(28, 35, 'PASSENGER', 'LOGIN', '2025-05-05 17:32:03'),
(29, 0, 'PASSENGER', 'LOGOUT', '2025-05-05 17:32:13');

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
  ADD PRIMARY KEY (`log_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bookings`
--
ALTER TABLE `bookings`
  MODIFY `booking_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

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
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
