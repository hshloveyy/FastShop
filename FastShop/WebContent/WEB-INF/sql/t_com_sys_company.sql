/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : fastshop

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-10-14 15:15:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_com_sys_company
-- ----------------------------
DROP TABLE IF EXISTS `t_com_sys_company`;
CREATE TABLE `t_com_sys_company` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `company_name` varchar(64) NOT NULL,
  `legal_person` varchar(32) DEFAULT NULL COMMENT '企业法人',
  `legal_representative` varchar(32) DEFAULT NULL COMMENT '法定代表人',
  `registered_capital` decimal(10,0) DEFAULT NULL COMMENT '注册资金',
  `establishment_date` date DEFAULT NULL COMMENT '成立日期',
  `enterprise_type` varchar(255) DEFAULT NULL COMMENT '企业类型',
  `registration_institution` varchar(255) DEFAULT NULL COMMENT '登记机关',
  `registration_no` varchar(64) DEFAULT NULL COMMENT '工商注册号',
  `business_license` varchar(255) DEFAULT NULL COMMENT '营业执照',
  `business` varchar(255) DEFAULT NULL COMMENT '经营范围',
  `registered_address` varchar(255) DEFAULT NULL COMMENT '注册地址',
  `approval_date` date DEFAULT NULL COMMENT '核准日期',
  `start_time` date DEFAULT NULL COMMENT '经营开始时间',
  `end_time` date DEFAULT NULL COMMENT '经营结束时间',
  `industry` varchar(32) DEFAULT NULL COMMENT '行业',
  `certificate_organization_code` varchar(64) DEFAULT NULL COMMENT '组织机构代码',
  `uniform_credit_code` varchar(64) DEFAULT NULL COMMENT '统一信用代码',
  `phone` varchar(32) DEFAULT NULL COMMENT '电话',
  `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `website` varchar(64) DEFAULT NULL COMMENT '网址',
  `fax` varchar(255) DEFAULT NULL COMMENT '传真',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `status` varchar(32) DEFAULT NULL COMMENT '状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '最后修改时间',
  `creater` varchar(64) DEFAULT 'admin' COMMENT '创建人',
  `is_delete` int(2) DEFAULT '0' COMMENT '删除标识 0 - 未删除 1 - 已删除',
  `is_enable` int(2) DEFAULT '1' COMMENT ' 启用标识0 - 未启用 1 - 已启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_com_sys_company
-- ----------------------------
INSERT INTO `t_com_sys_company` VALUES ('0000000001', '名扬机械厂', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'http://www.91mingyang.cn', null, null, null, null, null, 'admin', '0', '1');
