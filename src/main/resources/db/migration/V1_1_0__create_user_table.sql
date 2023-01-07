CREATE TABLE IF NOT EXISTS `province`
(
    `id`   int         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(50) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS `city`
(
    `id`          int         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name`        varchar(50) NOT NULL UNIQUE,
    `province_id` int         NOT NULL REFERENCES province (id)
);

CREATE TABLE IF NOT EXISTS `user`
(
    `id`            int          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `email`         varchar(50)  NOT NULL UNIQUE,
    `password`      varchar(250) NOT NULL,
    `first_name`    varchar(20)  NOT NULL,
    `last_name`     varchar(30)  NOT NULL,
    `birth_date`    datetime     NOT NULL,
    `creation_date` datetime     NOT NULL DEFAULT NOW(),
    `is_active`     boolean      NOT NULL DEFAULT FALSE,
    `last_visit`    datetime     NOT NULL DEFAULT NOW(),
    `city_id`       int          NOT NULL REFERENCES city (id)
);
