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

CREATE TABLE `card` (
  `id` int AUTO_INCREMENT PRIMARY KEY,
  `customer_id` int,
  `number` varchar(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  `total_limit` decimal(7,2) NOT NULL,
  `amount_used` decimal(7,2) NOT NULL,
  `available_amount` decimal(7,2) NOT NULL,
  `created_at` date DEFAULT NULL
);

INSERT INTO `card` (`customer_id`, `number`, `type`, `total_limit`, `amount_used`, `available_amount`, `created_at`)
 VALUES (1, '43432344387887', 'CREDIT', 10000.00, 110.00, 8900.00, CURDATE());

INSERT INTO `card` (`customer_id`, `number`, `type`, `total_limit`, `amount_used`, `available_amount`, `created_at`)
 VALUES (1, '989867875676', 'CREDIT', 16000.00, 6000.00, 10000.00, CURDATE());

INSERT INTO `card` (`customer_id`, `number`, `type`, `total_limit`, `amount_used`, `available_amount`, `created_at`)
 VALUES (2, '565409873451', 'CREDIT', 14000.00, 00.00, 14000.00, CURDATE());
