
CREATE TABLE IF NOT EXISTS `reminder` (
  `id` bigint(20) NOT NULL DEFAULT 0,
  `TITLE` tinytext NOT NULL,
  `MESSAGE` mediumtext NOT NULL,
  `CREATED_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `USER_ID` tinytext NOT NULL,
  `NOTIFY_TIME` tinytext NOT NULL,
  `MODIFIED_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `STATUS` tinytext NOT NULL,
  PRIMARY KEY (`id`)
) ;
DELETE FROM `reminder`;
/*!40000 ALTER TABLE `reminder` DISABLE KEYS */;
INSERT INTO `reminder` (`id`, `TITLE`, `MESSAGE`, `CREATED_TIME`, `USER_ID`, `NOTIFY_TIME`, `MODIFIED_TIME`, `STATUS`) VALUES
	(0, '1', '1', '2022-07-10 22:25:27', 'goutham', 'dg', '0000-00-00 00:00:00', 'dg');
