/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 80027
Source Host           : localhost:3306
Source Database       : ruanxie

Target Server Type    : MYSQL
Target Server Version : 80027
File Encoding         : 65001

Date: 2022-02-19 17:08:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for competition
-- ----------------------------
DROP TABLE IF EXISTS `competition`;
CREATE TABLE `competition` (
  `id` int NOT NULL AUTO_INCREMENT,
  `imgUrl` varchar(60) DEFAULT NULL,
  `title` varchar(60) DEFAULT NULL,
  `para1` varchar(255) DEFAULT NULL,
  `para2` varchar(255) DEFAULT NULL,
  `para3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of competition
-- ----------------------------
INSERT INTO `competition` VALUES ('1', '/test', '互联网+大赛', '“竞赛宗旨:旨在深化高等教育综合改革,激发大学生的创造力,培养造就“大众创业、万众创新”生力军;鼓励广大青年扎根中国大地了解国情民情,在创新创业中增长智慧才干,在艰苦奋斗中锤炼意志品质,把激昂的青春梦融入伟大的中国梦。”', '以赛促学，培养创新创业生力军。\\n 以赛促教，探索素质教育新途径。\\n 以赛促创，搭建成果转化新平台。', '中国“互联网+”大学生创新创业大赛，由教育部与政府、各高校共同主办。大赛旨在深化高等教育综合改革，激发大学生的创造力，培养造就“大众创业、万众创新”的主力军；推动赛事成果转化，促进“互联网+”新业态形成，服务经济提质增效升级；以创新引领创业、创业带动就业，推动高校毕业生更高质量创业就业。');

-- ----------------------------
-- Table structure for gallery
-- ----------------------------
DROP TABLE IF EXISTS `gallery`;
CREATE TABLE `gallery` (
  `id` int NOT NULL AUTO_INCREMENT,
  `imgUrl` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of gallery
-- ----------------------------
INSERT INTO `gallery` VALUES ('1', '/test');

-- ----------------------------
-- Table structure for mailbox
-- ----------------------------
DROP TABLE IF EXISTS `mailbox`;
CREATE TABLE `mailbox` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL,
  `StuId` varchar(60) DEFAULT NULL,
  `theme` varchar(60) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of mailbox
-- ----------------------------
INSERT INTO `mailbox` VALUES ('12', 'zhangsan', '201922411111', '找茬', '跟我刘华强拼你有这个实力吗？');

-- ----------------------------
-- Table structure for major
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `id` int NOT NULL AUTO_INCREMENT,
  `label` varchar(60) DEFAULT NULL,
  `title` varchar(60) DEFAULT NULL,
  `para1` varchar(255) DEFAULT NULL,
  `para2` varchar(255) DEFAULT NULL,
  `imgUrl` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of major
-- ----------------------------
INSERT INTO `major` VALUES ('1', '前端开发', '前端开发方向', '前端开发是创建WEB页面或APP等前端界面呈现给用户的过程，通过HTML，CSS及JavaScript以及衍生出来的各种技术、框架、解决方案，来实现互联网产品的用户界面交互。', '前端工程师是互联网时代软件产品研发中不可缺少的一种专业研发角色。从狭义上讲，前端工程师使用 HTML、CSS、JavaScript 等专业技能和工具将产品UI设计稿实现成网站产品，涵盖用户PC端、移动端网页，处理视觉和交互问题。从广义上来讲，所有用户终端产品与视觉和交互有关的部分，都是前端工程师的专业领域。', '/test');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL,
  `label` varchar(60) DEFAULT NULL,
  `major` varchar(60) DEFAULT NULL,
  `phone` varchar(60) DEFAULT NULL,
  `StuId` varchar(60) DEFAULT NULL,
  `grade` varchar(60) DEFAULT NULL,
  `imgUrl` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1', '张三', 'C++', '后端开发', '110', '2019224xxxxx', '19', '/test');
INSERT INTO `member` VALUES ('2', '李四', 'Java', '后端开发', '120', '20xxx', '18', '/test2');
INSERT INTO `member` VALUES ('3', '王八', 'Html', '前端开发', '119', '1241214', '18', '/test3');
INSERT INTO `member` VALUES ('4', '田鸡', 'Android', '安卓开发', '123', '254357894', '20', '/test4');

-- ----------------------------
-- Table structure for sign
-- ----------------------------
DROP TABLE IF EXISTS `sign`;
CREATE TABLE `sign` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(60) DEFAULT NULL,
  `StuId` varchar(60) DEFAULT NULL,
  `major` varchar(60) DEFAULT NULL,
  `grade` varchar(60) DEFAULT NULL,
  `resume` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='报名表';

-- ----------------------------
-- Records of sign
-- ----------------------------
INSERT INTO `sign` VALUES ('1', 'harry', '1013449422@qq.com', '15133180212', '201922450706', '软件工程', '19', 'aaaaaaaaaaaa');
INSERT INTO `sign` VALUES ('30', '1', '1013449422@qq.com', '1', '1', '1', '1', '1');
INSERT INTO `sign` VALUES ('31', '张三', '1013449422@qq.com', '110', '201922450705', '软工', '19', '我叫马牛逼我敢吃屎');
INSERT INTO `sign` VALUES ('32', '', '', '', '', '', '', '');

-- ----------------------------
-- Table structure for testimonials
-- ----------------------------
DROP TABLE IF EXISTS `testimonials`;
CREATE TABLE `testimonials` (
  `id` int NOT NULL AUTO_INCREMENT,
  `imgUrl` varchar(60) DEFAULT NULL,
  `name` varchar(60) DEFAULT NULL,
  `label` varchar(60) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of testimonials
-- ----------------------------
INSERT INTO `testimonials` VALUES ('1', '/test', '刘书菡', '19级课题组成员', '拎起大刀向泉明哥砍去');
