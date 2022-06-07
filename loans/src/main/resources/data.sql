DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS loan;

CREATE TABLE `customer` (
  `id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(100) NOT NULL,
  `number` varchar(20) NOT NULL,
  `created_at` date DEFAULT NULL
);

INSERT INTO `customer` (`name`, `number`,`created_at`)
 VALUES ('Kakashi','9993823234', CURDATE());

INSERT INTO `customer` (`name`, `number`,`created_at`)
  VALUES ('Orochimaru','9543625439', CURDATE());

CREATE TABLE `loan` (
  `id` int AUTO_INCREMENT PRIMARY KEY,
  `customer_id` int,
  `start_date` date NOT NULL,
  `type` varchar(100) NOT NULL,
  `total` decimal(7,2) NOT NULL,
  `amount_paid` decimal(7,2) NOT NULL,
  `created_at` date DEFAULT NULL
);

INSERT INTO `loan` (`customer_id`, `start_date`, `type`, `total`, `amount_paid`, `created_at`)
 VALUES (1, '2022-04-10', 'HOME', 10.000, 0, CURDATE());

INSERT INTO `loan` (`customer_id`, `start_date`, `type`, `total`, `amount_paid`, `created_at`)
 VALUES (1, '2022-05-20', 'VEHICLE', 16.000, 0, CURDATE());

INSERT INTO `loan` (`customer_id`, `start_date`, `type`, `total`, `amount_paid`, `created_at`)
 VALUES (2, '2022-04-10', 'VEHICLE', 14.000, 100.00, CURDATE());
