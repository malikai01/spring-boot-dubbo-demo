CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `org_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `test`.`users` (`id`, `username`, `password`, `org_id`) VALUES ('1', 'admin', '123456', '1001');
INSERT INTO `test`.`users` (`id`, `username`, `password`, `org_id`) VALUES ('2', 'test1', '123565', '1000');
