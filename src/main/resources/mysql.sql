use test;

CREATE TABLE `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bill_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

INSERT INTO `test` (`id`,`bill_no`) VALUES (18,'1');
INSERT INTO `test` (`id`,`bill_no`) VALUES (19,'1');
INSERT INTO `test` (`id`,`bill_no`) VALUES (20,'1');