## Spring Cloud Greenwich 版本系列架构demo实战

图文教程参考：<br/>
https://blog.csdn.net/forezp/article/details/70148833

### 模块

* businessservice-user ------------------ 业务模块-用户
* businessservice-user-client-feign ----- 业务模块-feign声明式调用
* businessservice-user-client-ribbon ---- 业务模块-ribbon负载均衡
* commonservice-config-client ----------- 公共配置-配置中心客户端
* commonservice-config-server ----------- 公共配置-配置中心服务端
* commonservice-eureka-server ----------- 公共配置-eureka服务端
* commonservice-eureka-client ----------- 公共配置-eureka客户端
* commonservice-gateway ----------------- 公共配置-新版gateway网关
* commonservice-zuul -------------------- 公共配置-旧版zuul网关

### 环境

* Redis、RabbitMQ、MySQL
* 服务较多，建议配置idea或者eclipse jvm启动参数 `-Xmx100m  -Xms50m  -Xmn25m`


#### 1、Redis

略

#### 2、RabbitMQ

参考地址：https://www.cnblogs.com/ericli-ericli/p/5902270.html

```jshelllanguage
rabbitmqctl.bat list_users
rabbitmqctl.bat add_user rabbitmq-qm 8zoYBxdV
rabbitmqctl.bat set_user_tags rabbitmq-qm administrator
rabbitmqctl.bat change_password userName newPassword
rabbitmqctl.bat delete_user guest
```
分配权限：

```sybase
rabbitmqctl.bat set_permissions -p "/" rabbitmq-qm "." "." ".*"
```


#### 3、MySQL

```MYSQL
/*
 Navicat Premium Data Transfer

 Source Server         : mysql-localhost
 Source Server Type    : MySQL
 Source Server Version : 50546
 Source Host           : localhost:3306
 Source Schema         : spring_cloud_demo_user

 Target Server Type    : MySQL
 Target Server Version : 50546
 File Encoding         : 65001

 Date: 21/03/2019 11:26:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for business_user
-- ----------------------------
DROP TABLE IF EXISTS `business_user`;
CREATE TABLE `business_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` datetime NULL DEFAULT NULL,
  `create_date` datetime NULL DEFAULT NULL,
  `status` tinyint(4) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;

```
