-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 25, 2025 at 04:11 AM
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
-- Database: `libraryproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `doc_id` int(11) NOT NULL,
  `isbn` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Triggers `book`
--
DELIMITER $$
CREATE TRIGGER `trg_book_type_check_before_insert` BEFORE INSERT ON `book` FOR EACH ROW BEGIN
    IF (SELECT doc_type FROM document WHERE doc_id = NEW.doc_id) <> 'BOOK' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Document doc_type must be BOOK for book subtype';
    END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `book_authors`
--

CREATE TABLE `book_authors` (
  `doc_id` int(11) NOT NULL,
  `author_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `borrows`
--

CREATE TABLE `borrows` (
  `member_id` int(11) NOT NULL,
  `doc_id` int(11) NOT NULL,
  `copy_num` int(11) NOT NULL,
  `borrow_date` date NOT NULL,
  `return_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `copy`
--

CREATE TABLE `copy` (
  `doc_id` int(11) NOT NULL,
  `copy_num` int(11) NOT NULL,
  `branch_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `document`
--

CREATE TABLE `document` (
  `doc_id` int(11) NOT NULL,
  `publisher` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `doc_type` enum('BOOK','JOURNAL','DVD') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Triggers `document`
--
DELIMITER $$
CREATE TRIGGER `trg_document_disjoint_after_insert` AFTER INSERT ON `document` FOR EACH ROW BEGIN
    CASE NEW.doc_type
        WHEN 'BOOK' THEN
            SET @ok := 1;
        WHEN 'JOURNAL' THEN SET @ok := 1;
        WHEN 'DVD' THEN SET @ok := 1;
        ELSE SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Invalid doc_type';
    END CASE;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Stand-in structure for view `document_num_copies`
-- (See below for the actual view)
--
CREATE TABLE `document_num_copies` (
`doc_id` int(11)
,`num_copies` bigint(21)
);

-- --------------------------------------------------------

--
-- Table structure for table `dvd`
--

CREATE TABLE `dvd` (
  `doc_id` int(11) NOT NULL,
  `dvd_id` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Triggers `dvd`
--
DELIMITER $$
CREATE TRIGGER `trg_dvd_type_check_before_insert` BEFORE INSERT ON `dvd` FOR EACH ROW BEGIN
    IF (SELECT doc_type FROM document WHERE doc_id = NEW.doc_id) <> 'DVD' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Document doc_type must be DVD for dvd subtype';
    END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `dvd_directors`
--

CREATE TABLE `dvd_directors` (
  `doc_id` int(11) NOT NULL,
  `director_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `journal`
--

CREATE TABLE `journal` (
  `doc_id` int(11) NOT NULL,
  `journal_id` varchar(50) NOT NULL,
  `volume` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Triggers `journal`
--
DELIMITER $$
CREATE TRIGGER `trg_journal_type_check_before_insert` BEFORE INSERT ON `journal` FOR EACH ROW BEGIN
    IF (SELECT doc_type FROM document WHERE doc_id = NEW.doc_id) <> 'JOURNAL' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Document doc_type must be JOURNAL for journal subtype';
    END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `journal_editors`
--

CREATE TABLE `journal_editors` (
  `doc_id` int(11) NOT NULL,
  `editor_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `librarian`
--

CREATE TABLE `librarian` (
  `userid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Triggers `librarian`
--
DELIMITER $$
CREATE TRIGGER `trg_prevent_orphan_user_after_delete_librarian` AFTER DELETE ON `librarian` FOR EACH ROW BEGIN
    IF (SELECT COUNT(*) FROM member WHERE userid = OLD.userid) = 0 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'User must be at least a Librarian or Member';
    END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `lib_branch`
--

CREATE TABLE `lib_branch` (
  `branch_id` int(11) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `lib_user`
--

CREATE TABLE `lib_user` (
  `userid` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `userid` int(11) NOT NULL,
  `fine` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Triggers `member`
--
DELIMITER $$
CREATE TRIGGER `trg_prevent_orphan_user_after_delete_member` AFTER DELETE ON `member` FOR EACH ROW BEGIN
    IF (SELECT COUNT(*) FROM librarian WHERE userid = OLD.userid) = 0 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'User must be at least a Librarian or Member';
    END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Stand-in structure for view `member_current_borrow_count`
-- (See below for the actual view)
--
CREATE TABLE `member_current_borrow_count` (
`member_id` int(11)
,`num_borrowed` bigint(21)
);

-- --------------------------------------------------------

--
-- Table structure for table `reserves`
--

CREATE TABLE `reserves` (
  `member_id` int(11) NOT NULL,
  `doc_id` int(11) NOT NULL,
  `copy_num` int(11) NOT NULL,
  `reservation_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `runs`
--

CREATE TABLE `runs` (
  `librarian_id` int(11) NOT NULL,
  `branch_id` int(11) NOT NULL,
  `start_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Stand-in structure for view `users_without_role`
-- (See below for the actual view)
--
CREATE TABLE `users_without_role` (
`userid` int(11)
);

-- --------------------------------------------------------

--
-- Structure for view `document_num_copies`
--
DROP TABLE IF EXISTS `document_num_copies`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `document_num_copies`  AS SELECT `d`.`doc_id` AS `doc_id`, count(`c`.`copy_num`) AS `num_copies` FROM (`document` `d` left join `copy` `c` on(`c`.`doc_id` = `d`.`doc_id`)) GROUP BY `d`.`doc_id` ;

-- --------------------------------------------------------

--
-- Structure for view `member_current_borrow_count`
--
DROP TABLE IF EXISTS `member_current_borrow_count`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `member_current_borrow_count`  AS SELECT `m`.`userid` AS `member_id`, count(`b`.`copy_num`) AS `num_borrowed` FROM (`member` `m` left join `borrows` `b` on(`b`.`member_id` = `m`.`userid` and `b`.`return_date` is null)) GROUP BY `m`.`userid` ;

-- --------------------------------------------------------

--
-- Structure for view `users_without_role`
--
DROP TABLE IF EXISTS `users_without_role`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `users_without_role`  AS SELECT `u`.`userid` AS `userid` FROM ((`lib_user` `u` left join `member` `m` on(`m`.`userid` = `u`.`userid`)) left join `librarian` `l` on(`l`.`userid` = `u`.`userid`)) WHERE `m`.`userid` is null AND `l`.`userid` is null ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`doc_id`),
  ADD UNIQUE KEY `isbn` (`isbn`);

--
-- Indexes for table `book_authors`
--
ALTER TABLE `book_authors`
  ADD PRIMARY KEY (`doc_id`,`author_name`);

--
-- Indexes for table `borrows`
--
ALTER TABLE `borrows`
  ADD PRIMARY KEY (`member_id`,`doc_id`,`copy_num`,`borrow_date`),
  ADD KEY `doc_id` (`doc_id`,`copy_num`);

--
-- Indexes for table `copy`
--
ALTER TABLE `copy`
  ADD PRIMARY KEY (`doc_id`,`copy_num`),
  ADD KEY `branch_id` (`branch_id`);

--
-- Indexes for table `document`
--
ALTER TABLE `document`
  ADD PRIMARY KEY (`doc_id`);

--
-- Indexes for table `dvd`
--
ALTER TABLE `dvd`
  ADD PRIMARY KEY (`doc_id`),
  ADD UNIQUE KEY `dvd_id` (`dvd_id`);

--
-- Indexes for table `dvd_directors`
--
ALTER TABLE `dvd_directors`
  ADD PRIMARY KEY (`doc_id`,`director_name`);

--
-- Indexes for table `journal`
--
ALTER TABLE `journal`
  ADD PRIMARY KEY (`doc_id`),
  ADD UNIQUE KEY `journal_id` (`journal_id`);

--
-- Indexes for table `journal_editors`
--
ALTER TABLE `journal_editors`
  ADD PRIMARY KEY (`doc_id`,`editor_name`);

--
-- Indexes for table `librarian`
--
ALTER TABLE `librarian`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `lib_branch`
--
ALTER TABLE `lib_branch`
  ADD PRIMARY KEY (`branch_id`);

--
-- Indexes for table `lib_user`
--
ALTER TABLE `lib_user`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `reserves`
--
ALTER TABLE `reserves`
  ADD PRIMARY KEY (`member_id`,`doc_id`,`copy_num`,`reservation_date`),
  ADD KEY `doc_id` (`doc_id`,`copy_num`);

--
-- Indexes for table `runs`
--
ALTER TABLE `runs`
  ADD PRIMARY KEY (`librarian_id`),
  ADD KEY `branch_id` (`branch_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `document`
--
ALTER TABLE `document`
  MODIFY `doc_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `lib_branch`
--
ALTER TABLE `lib_branch`
  MODIFY `branch_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `lib_user`
--
ALTER TABLE `lib_user`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `book`
--
ALTER TABLE `book`
  ADD CONSTRAINT `book_ibfk_1` FOREIGN KEY (`doc_id`) REFERENCES `document` (`doc_id`);

--
-- Constraints for table `book_authors`
--
ALTER TABLE `book_authors`
  ADD CONSTRAINT `book_authors_ibfk_1` FOREIGN KEY (`doc_id`) REFERENCES `book` (`doc_id`);

--
-- Constraints for table `borrows`
--
ALTER TABLE `borrows`
  ADD CONSTRAINT `borrows_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `member` (`userid`),
  ADD CONSTRAINT `borrows_ibfk_2` FOREIGN KEY (`doc_id`,`copy_num`) REFERENCES `copy` (`doc_id`, `copy_num`);

--
-- Constraints for table `copy`
--
ALTER TABLE `copy`
  ADD CONSTRAINT `copy_ibfk_1` FOREIGN KEY (`doc_id`) REFERENCES `document` (`doc_id`),
  ADD CONSTRAINT `copy_ibfk_2` FOREIGN KEY (`branch_id`) REFERENCES `lib_branch` (`branch_id`);

--
-- Constraints for table `dvd`
--
ALTER TABLE `dvd`
  ADD CONSTRAINT `dvd_ibfk_1` FOREIGN KEY (`doc_id`) REFERENCES `document` (`doc_id`);

--
-- Constraints for table `dvd_directors`
--
ALTER TABLE `dvd_directors`
  ADD CONSTRAINT `dvd_directors_ibfk_1` FOREIGN KEY (`doc_id`) REFERENCES `dvd` (`doc_id`);

--
-- Constraints for table `journal`
--
ALTER TABLE `journal`
  ADD CONSTRAINT `journal_ibfk_1` FOREIGN KEY (`doc_id`) REFERENCES `document` (`doc_id`);

--
-- Constraints for table `journal_editors`
--
ALTER TABLE `journal_editors`
  ADD CONSTRAINT `journal_editors_ibfk_1` FOREIGN KEY (`doc_id`) REFERENCES `journal` (`doc_id`);

--
-- Constraints for table `librarian`
--
ALTER TABLE `librarian`
  ADD CONSTRAINT `librarian_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `lib_user` (`userid`);

--
-- Constraints for table `member`
--
ALTER TABLE `member`
  ADD CONSTRAINT `member_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `lib_user` (`userid`);

--
-- Constraints for table `reserves`
--
ALTER TABLE `reserves`
  ADD CONSTRAINT `reserves_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `member` (`userid`),
  ADD CONSTRAINT `reserves_ibfk_2` FOREIGN KEY (`doc_id`,`copy_num`) REFERENCES `copy` (`doc_id`, `copy_num`);

--
-- Constraints for table `runs`
--
ALTER TABLE `runs`
  ADD CONSTRAINT `runs_ibfk_1` FOREIGN KEY (`librarian_id`) REFERENCES `librarian` (`userid`),
  ADD CONSTRAINT `runs_ibfk_2` FOREIGN KEY (`branch_id`) REFERENCES `lib_branch` (`branch_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
