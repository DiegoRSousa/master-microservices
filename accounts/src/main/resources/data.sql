DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS account;

CREATE TABLE `customer` (
  `id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(100) NOT NULL,
  `number` varchar(20) NOT NULL,
  `created_at` date DEFAULT NULL
);

INSERT INTO `customer` (`name`, `number`,`created_at`)
 VALUES ('Kakashi','9993823234', CURDATE());

CREATE TABLE `account` (
  `id` int AUTO_INCREMENT PRIMARY KEY,
  `customer_id` int,
  `number` varchar(20) NOT NULL,
  `type` varchar(100) NOT NULL,
  `created_at` date DEFAULT NULL
);

INSERT INTO `account` (`customer_id`, `number`, `type`, `created_at`)
 VALUES (1, 186576453, 'SAVING', CURDATE());
