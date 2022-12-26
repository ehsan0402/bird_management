CREATE TABLE IF NOT EXISTS `user` (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `email` varchar(50) NOT NULL,
    `first_name` varchar(20),
    `last_name` varchar(30)
)