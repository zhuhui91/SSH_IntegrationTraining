/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : shengdisoms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-09-20 23:21:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `om_cust_price_list`
-- ----------------------------
DROP TABLE IF EXISTS `om_cust_price_list`;
CREATE TABLE `om_cust_price_list` (
  `PL_YH_ITEM` varchar(20) DEFAULT NULL,
  `effective_date_from` date DEFAULT NULL,
  `effective_date_to` date DEFAULT NULL,
  `Base_price` double(20,2) DEFAULT NULL,
  `Spray_coating` int(20) DEFAULT NULL,
  `Screw` int(20) DEFAULT NULL,
  `Screw_price` double(20,0) DEFAULT NULL,
  `cust_code` varchar(120) NOT NULL,
  `TYPE` varchar(8) DEFAULT NULL,
  `PL_CUST_NAME` varchar(10) DEFAULT NULL,
  `SEGMENT8` varchar(20) DEFAULT NULL,
  `SEGMENT9` varchar(20) DEFAULT NULL,
  `SEGMENT10` varchar(20) DEFAULT NULL,
  `SEGMENT11` varchar(20) DEFAULT NULL,
  `SEGMENT12` varchar(20) DEFAULT NULL,
  `SEGMENT13` varchar(20) DEFAULT NULL,
  `SEGMENT14` varchar(20) DEFAULT NULL,
  `SEGMENT15` varchar(20) DEFAULT NULL,
  `SEGMENT16` varchar(20) DEFAULT NULL,
  `SEGMENT17` varchar(20) DEFAULT NULL,
  `SEGMENT18` varchar(20) DEFAULT NULL,
  `SEGMENT19` varchar(20) DEFAULT NULL,
  `SEGMENT20` varchar(20) DEFAULT NULL,
  `SEGMENT21` varchar(20) DEFAULT NULL,
  `SEGMENT22` varchar(20) DEFAULT NULL,
  `SEGMENT23` varchar(20) DEFAULT NULL,
  `SEGMENT24` varchar(20) DEFAULT NULL,
  `SEGMENT25` varchar(20) DEFAULT NULL,
  `SEGMENT26` varchar(20) DEFAULT NULL,
  `SEGMENT27` varchar(20) DEFAULT NULL,
  `SEGMENT28` varchar(20) DEFAULT NULL,
  `SEGMENT29` varchar(20) DEFAULT NULL,
  `SEGMENT30` varchar(20) DEFAULT NULL,
  `import_state` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cust_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of om_cust_price_list
-- ----------------------------
INSERT INTO `om_cust_price_list` VALUES ('PL_8828', '2015-09-19', '2015-09-19', '1.00', '2', '2', '2', 'cust_code11', 'STD', 'CUST8', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `om_cust_price_list` VALUES ('PL_8829', '2015-09-20', '2015-09-19', '1.00', '1', '1', '1', 'cust_code12', 'SSD', '12CUST9', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `om_cust_price_list` VALUES ('PL_8837', '2015-09-19', '2015-09-19', '1.00', '2', '2', '2', 'cust_code13', 'SSB', 'PL_NAME34', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `om_cust_price_list` VALUES ('PL_8837', '2015-09-19', '2015-09-19', '1.00', '2', '2', '2', 'SSB', '', '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `om_cust_price_list` VALUES ('PL_8829', '2015-09-20', '2015-09-19', '1.00', '1', '1', '1', 'SSD', '', '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `om_cust_price_list` VALUES ('PL_8828', '2015-09-19', '2015-09-19', '1.00', '2', '2', '2', 'STD', '', '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
