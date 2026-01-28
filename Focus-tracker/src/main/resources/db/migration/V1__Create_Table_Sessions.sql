CREATE TABLE `sessions` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `begin_date` datetime(6) DEFAULT NULL,
    `category` enum('READ','STUDY','WORK') DEFAULT NULL,
    `end_date` datetime(6) DEFAULT NULL,
    `title` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
