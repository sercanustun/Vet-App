-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: mysql:3306
-- Generation Time: Jan 03, 2024 at 10:14 PM
-- Server version: 8.0.35
-- PHP Version: 8.2.13

SET FOREIGN_KEY_CHECKS = 0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT = @@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS = @@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION = @@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vet-app`
--
CREATE DATABASE IF NOT EXISTS `vet-app` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `vet-app`;

-- --------------------------------------------------------

--
-- Table structure for table `animal`
--

CREATE TABLE IF NOT EXISTS `animal`
(
    `id`            varchar(255) NOT NULL,
    `created_at`    datetime(6)  NOT NULL,
    `updated_at`    datetime(6)  NOT NULL,
    `breed`         varchar(255) NOT NULL,
    `color`         varchar(255) NOT NULL,
    `date_of_birth` date         NOT NULL,
    `gender`        varchar(255) NOT NULL,
    `name`          varchar(255) NOT NULL,
    `species`       varchar(255) NOT NULL,
    `customer_id`   varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `FK6pvxm5gfjqxclb651be9unswe` (`customer_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

--
-- Dumping data for table `animal`
--

INSERT INTO `animal` (`id`, `created_at`, `updated_at`, `breed`, `color`, `date_of_birth`, `gender`, `name`, `species`,
                      `customer_id`)
VALUES ('0043728b-6d4f-481a-9634-7ff9b0def3d0', '2024-01-03 02:28:56.000000', '2024-01-03 02:28:56.000000',
        'alman kurdu', 'siyah', '2024-01-03', 'ERKEK', 'alman kurdu', 'albino', '538d5540-90f4-4d53-adcf-e09858edf7af'),
       ('98a5a3bd-5c0c-475a-8fae-aeb573921c49', '2024-01-03 02:28:56.000000', '2024-01-03 02:28:56.000000', 'doberman',
        'siyah', '2024-01-03', 'KIZ', 'doberman', 'kisa kulak', '04ca2c82-eb43-4632-ab8b-5fc6c9e04335'),
       ('f9bb130e-0685-4cb6-be50-e551eaaf3c77', '2024-01-03 02:28:56.000000', '2024-01-03 02:28:56.000000', 'fino',
        'siyah', '2024-01-03', 'ERKEK', 'fino', 'kisa tuy', '04ca2c82-eb43-4632-ab8b-5fc6c9e04335');

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE IF NOT EXISTS `appointment`
(
    `id`               varchar(255) NOT NULL,
    `created_at`       datetime(6)  NOT NULL,
    `updated_at`       datetime(6)  NOT NULL,
    `appointment_date` datetime(6)  NOT NULL,
    `animal_id`        varchar(255) DEFAULT NULL,
    `doctor_id`        varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `FK2kkeptdxfuextg5ch7xp3ytie` (`animal_id`),
    KEY `FKoeb98n82eph1dx43v3y2bcmsl` (`doctor_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`id`, `created_at`, `updated_at`, `appointment_date`, `animal_id`, `doctor_id`)
VALUES ('01f300c1-23a6-46be-b891-0e4e7759c3f3', '2024-01-03 00:54:16.807893', '2024-01-03 00:54:16.807907',
        '2023-12-31 00:00:00.000000', '0043728b-6d4f-481a-9634-7ff9b0def3d0', '0311cde6-d6b6-41de-a6c4-9c40a007dbd9'),
       ('5184b540-f0a8-47c2-85ce-2263a1d3a5e5', '2024-01-03 00:55:38.819994', '2024-01-03 00:55:38.820068',
        '2023-12-31 00:00:00.000000', '0043728b-6d4f-481a-9634-7ff9b0def3d0', '0311cde6-d6b6-41de-a6c4-9c40a007dbd9'),
       ('6bdcecdf-013d-4f20-8a87-cba963c083c2', '2024-01-03 00:56:38.428172', '2024-01-03 00:56:38.428211',
        '2023-12-31 21:00:00.000000', '0043728b-6d4f-481a-9634-7ff9b0def3d0', '0311cde6-d6b6-41de-a6c4-9c40a007dbd9'),
       ('847cbcd6-82e0-4854-924a-12b0dea6cc6b', '2024-01-03 01:03:55.687968', '2024-01-03 01:03:55.688009',
        '2023-12-31 22:00:00.000000', '0043728b-6d4f-481a-9634-7ff9b0def3d0', '0311cde6-d6b6-41de-a6c4-9c40a007dbd9'),
       ('9bcc9227-8282-40ed-b2e5-348a33ef7bf8', '2024-01-03 01:04:04.244111', '2024-01-03 01:04:04.244122',
        '2023-12-31 23:00:00.000000', '0043728b-6d4f-481a-9634-7ff9b0def3d0', '0311cde6-d6b6-41de-a6c4-9c40a007dbd9'),
       ('bad94ae7-a35a-4b50-933c-f2cc6bd1a228', '2024-01-03 00:53:50.789566', '2024-01-03 00:53:50.789608',
        '2023-12-31 00:00:00.000000', '0043728b-6d4f-481a-9634-7ff9b0def3d0', '0311cde6-d6b6-41de-a6c4-9c40a007dbd9');

-- --------------------------------------------------------

--
-- Table structure for table `available_date`
--

CREATE TABLE IF NOT EXISTS `available_date`
(
    `id`         varchar(255) NOT NULL,
    `created_at` datetime(6)  NOT NULL,
    `updated_at` datetime(6)  NOT NULL,
    `date`       date         NOT NULL,
    `doctor_id`  varchar(255) NOT NULL,
    PRIMARY KEY (`id`),
    KEY `FKk0d6pu1wxarsoou0x2e1cc2on` (`doctor_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

--
-- Dumping data for table `available_date`
--

INSERT INTO `available_date` (`id`, `created_at`, `updated_at`, `date`, `doctor_id`)
VALUES ('20499065-6740-474a-b465-56693818a185', '2024-01-03 02:31:34.000000', '2024-01-03 02:31:34.000000',
        '2024-01-03', '9bb0b851-2d03-4c7a-b57c-6b4283f78a39'),
       ('49a0efce-5b96-41cb-8bde-6d93c9ec59b1', '2024-01-03 02:31:34.000000', '2024-01-03 02:31:34.000000',
        '2024-01-05', '9bb0b851-2d03-4c7a-b57c-6b4283f78a39'),
       ('a2e0138f-dbe5-4309-8845-af81599bd53b', '2024-01-03 02:31:34.000000', '2024-01-03 02:31:34.000000',
        '2024-01-01', '0311cde6-d6b6-41de-a6c4-9c40a007dbd9'),
       ('db84f126-c583-448e-badb-c4cf3cf1e8f8', '2024-01-03 02:31:34.000000', '2024-01-03 02:31:34.000000',
        '2024-01-04', '9bb0b851-2d03-4c7a-b57c-6b4283f78a39');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer`
(
    `id`         varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      NOT NULL,
    `created_at` datetime(6)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       NOT NULL,
    `updated_at` datetime(6)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       NOT NULL,
    `address`    varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      NOT NULL,
    `city`       enum ('ADANA','ADIYAMAN','AFYONKARAHISAR','AGRI','AMASYA','ANKARA','ANTALYA','ARTVIN','AYDIN','BALIKESIR','BILECIK','BINGOL','BITLIS','BOLU','BURDUR','BURSA','CANAKKALE','CANKIRI','CORUM','DENIZLI','DIYARBAKIR','EDIRNE','ELAZIG','ERZINCAN','ERZURUM','ESKISEHIR','GAZIANTEP','GIRESUN','GUMUSHANE','HAKKARI','HATAY','ISPARTA','MERSIN','ISTANBUL','IZMIR','KARS','KASTAMONU','KAYSERI','KIRKLARELI','KIRSEHIR','KOCAELI','KONYA','KUTAHYA','MALATYA','MANISA','KAHRAMANMARAS','MARDIN','MUGLA','MUS','NEVSEHIR','NIGDE','ORDU','RIZE','SAKARYA','SAMSUN','SIIRT','SINOP','SIVAS','TEKIRDAG','TOKAT','TRABZON','TUNCELI','SANLIURFA','USAK','VAN','YOZGAT','ZONGULDAK','AKSARAY','BAYBURT','KARAMAN','KIRIKKALE','BATMAN','SIRNAK','BARTIN','ARDAHAN','IGDIR','YALOVA','KARABUK','KILIS','OSMANIYE','DUZCE') NOT NULL,
    `mail`       varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      NOT NULL,
    `name`       varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      NOT NULL,
    `phone`      varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `UK_9bs0cm53439brbopbpxhg68e` (`mail`),
    UNIQUE KEY `UK_o3uty20c6csmx5y4uk2tc5r4m` (`phone`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `created_at`, `updated_at`, `address`, `city`, `mail`, `name`, `phone`)
VALUES ('04ca2c82-eb43-4632-ab8b-5fc6c9e04335', '2024-01-02 23:25:49.631706', '2024-01-02 23:25:49.631720', 'adresveli',
        'ADANA', 'veli2@gmail.com', 'veli', '222222'),
       ('538d5540-90f4-4d53-adcf-e09858edf7af', '2024-01-02 23:25:29.870617', '2024-01-02 23:25:29.870677', 'adresali',
        'ANKARA', 'ali1@gmail.com', 'ali', '111111111'),
       ('e70f39a4-9417-4e1e-9fc4-83b5e6f93e84', '2024-01-02 23:26:06.152625', '2024-01-02 23:26:06.152646',
        'adreshasan', 'MANISA', 'hasan3@gmail.com', 'hasan', '3333333');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE IF NOT EXISTS `doctor`
(
    `id`         varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      NOT NULL,
    `created_at` datetime(6)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       NOT NULL,
    `updated_at` datetime(6)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       NOT NULL,
    `address`    varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      NOT NULL,
    `city`       enum ('ADANA','ADIYAMAN','AFYONKARAHISAR','AGRI','AMASYA','ANKARA','ANTALYA','ARTVIN','AYDIN','BALIKESIR','BILECIK','BINGOL','BITLIS','BOLU','BURDUR','BURSA','CANAKKALE','CANKIRI','CORUM','DENIZLI','DIYARBAKIR','EDIRNE','ELAZIG','ERZINCAN','ERZURUM','ESKISEHIR','GAZIANTEP','GIRESUN','GUMUSHANE','HAKKARI','HATAY','ISPARTA','MERSIN','ISTANBUL','IZMIR','KARS','KASTAMONU','KAYSERI','KIRKLARELI','KIRSEHIR','KOCAELI','KONYA','KUTAHYA','MALATYA','MANISA','KAHRAMANMARAS','MARDIN','MUGLA','MUS','NEVSEHIR','NIGDE','ORDU','RIZE','SAKARYA','SAMSUN','SIIRT','SINOP','SIVAS','TEKIRDAG','TOKAT','TRABZON','TUNCELI','SANLIURFA','USAK','VAN','YOZGAT','ZONGULDAK','AKSARAY','BAYBURT','KARAMAN','KIRIKKALE','BATMAN','SIRNAK','BARTIN','ARDAHAN','IGDIR','YALOVA','KARABUK','KILIS','OSMANIYE','DUZCE') NOT NULL,
    `mail`       varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      NOT NULL,
    `name`       varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      NOT NULL,
    `phone`      varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `UK_n301mmkjvy2j0d4fk4q1xexc3` (`mail`),
    UNIQUE KEY `UK_2ow2k8dbvtnp7wfc8ywo8fg2e` (`phone`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`id`, `created_at`, `updated_at`, `address`, `city`, `mail`, `name`, `phone`)
VALUES ('0311cde6-d6b6-41de-a6c4-9c40a007dbd9', '2024-01-03 02:26:27.000000', '2024-01-03 02:26:27.000000', 'adresdoc1',
        'NEVSEHIR', 'doctor1@gmail.com', 'doctor1', '111111111'),
       ('9bb0b851-2d03-4c7a-b57c-6b4283f78a39', '2024-01-03 02:28:06.000000', '2024-01-03 02:28:06.000000',
        'addressdoctor2', 'ERZURUM', 'doctor2mail@gmail.com', 'doctor2', '222222222');

-- --------------------------------------------------------

--
-- Table structure for table `flyway_schema_history`
--

CREATE TABLE IF NOT EXISTS `flyway_schema_history`
(
    `installed_rank` int           NOT NULL,
    `version`        varchar(50)            DEFAULT NULL,
    `description`    varchar(200)  NOT NULL,
    `type`           varchar(20)   NOT NULL,
    `script`         varchar(1000) NOT NULL,
    `checksum`       int                    DEFAULT NULL,
    `installed_by`   varchar(100)  NOT NULL,
    `installed_on`   timestamp     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `execution_time` int           NOT NULL,
    `success`        tinyint(1)    NOT NULL,
    PRIMARY KEY (`installed_rank`),
    KEY `flyway_schema_history_s_idx` (`success`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

--
-- Dumping data for table `flyway_schema_history`
--

INSERT INTO `flyway_schema_history` (`installed_rank`, `version`, `description`, `type`, `script`, `checksum`,
                                     `installed_by`, `installed_on`, `execution_time`, `success`)
VALUES (1, '1', 'init', 'SQL', 'V1__init.sql', -640141163, 'root', '2024-01-02 23:25:09', 1652, 1);

-- --------------------------------------------------------

--
-- Table structure for table `vaccine`
--

CREATE TABLE IF NOT EXISTS `vaccine`
(
    `id`                    varchar(255) NOT NULL,
    `created_at`            datetime(6)  NOT NULL,
    `updated_at`            datetime(6)  NOT NULL,
    `code`                  varchar(255) NOT NULL,
    `name`                  varchar(255) NOT NULL,
    `protection_end_date`   date         NOT NULL,
    `protection_start_date` date         NOT NULL,
    `animal_id`             varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `FKne3kmh8y5pcyxwl4u2w9prw6j` (`animal_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

--
-- Dumping data for table `vaccine`
--

INSERT INTO `vaccine` (`id`, `created_at`, `updated_at`, `code`, `name`, `protection_end_date`, `protection_start_date`,
                       `animal_id`)
VALUES ('005cb189-3b27-4ae9-81ef-76710fe41fc5', '2024-01-03 21:00:08.262250', '2024-01-03 21:00:08.262273', 'KDZ',
        'KUDUZ', '2024-01-03', '2024-01-03', '0043728b-6d4f-481a-9634-7ff9b0def3d0'),
       ('d33ee437-107b-4403-8ad1-6d8d54eb835e', '2024-01-03 21:08:57.982816', '2024-01-03 21:08:57.982867', 'KDZ',
        'KUDUZ', '2024-01-04', '2024-01-04', '0043728b-6d4f-481a-9634-7ff9b0def3d0');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `animal`
--
ALTER TABLE `animal`
    ADD CONSTRAINT `FK6pvxm5gfjqxclb651be9unswe` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`);

--
-- Constraints for table `appointment`
--
ALTER TABLE `appointment`
    ADD CONSTRAINT `FK2kkeptdxfuextg5ch7xp3ytie` FOREIGN KEY (`animal_id`) REFERENCES `animal` (`id`),
    ADD CONSTRAINT `FKoeb98n82eph1dx43v3y2bcmsl` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`id`);

--
-- Constraints for table `available_date`
--
ALTER TABLE `available_date`
    ADD CONSTRAINT `FKk0d6pu1wxarsoou0x2e1cc2on` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`id`);

--
-- Constraints for table `vaccine`
--
ALTER TABLE `vaccine`
    ADD CONSTRAINT `FKne3kmh8y5pcyxwl4u2w9prw6j` FOREIGN KEY (`animal_id`) REFERENCES `animal` (`id`);
SET FOREIGN_KEY_CHECKS = 1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT = @OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS = @OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION = @OLD_COLLATION_CONNECTION */;