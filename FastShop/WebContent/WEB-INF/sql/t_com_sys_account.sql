/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 100113
Source Host           : localhost:3306
Source Database       : fastshop

Target Server Type    : MYSQL
Target Server Version : 100113
File Encoding         : 65001

Date: 2016-10-16 19:20:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_com_sys_account
-- ----------------------------
DROP TABLE IF EXISTS `t_com_sys_account`;
CREATE TABLE `t_com_sys_account` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `account_num` varchar(10) NOT NULL COMMENT '账号编码',
  `email` varchar(32) NOT NULL COMMENT '邮箱',
  `phone` varchar(20) NOT NULL COMMENT '手机号码',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `salt` varchar(10) NOT NULL COMMENT '盐值',
  `create_time` datetime NOT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_account_num` (`account_num`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_com_sys_account
-- ----------------------------
