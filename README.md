# learn-spring-boot

 1. springboot-sccurity:权限认证

      数据库脚本：

``
CREATE TABLE `account`  (
`id` int(10) NOT NULL AUTO_INCREMENT,
`username` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`role` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;


INSERT INTO `account` VALUES (1, 'user', '$2a$10$1MHNdZS.oCICxLRVbnNBZe4CRn9Rk1MVQhasSMhHr0G4BCNQjPpna', 'ROLE_USER');
INSERT INTO `account` VALUES (2, 'admin', '$2a$10$dKkrkgVzaCPX74TvxOjwNuFJjIRJeAuDPKFntwNwRvRHkwIAHV5Q6', 'ROLE_ADMIN');
INSERT INTO `account` VALUES (3, 'super_admin', '$2a$10$CqOXnSp6oks9UTvsops4U.0vMGbUE2Bp28xKaPmlug4W8Mk59Sj8y', 'ROLE_SUPER_ADMIN');
INSERT INTO `account` VALUES (4, 'test', '$2a$10$SQsuH1XfxHdsVmf2nE75wOAE6GHm1nd/xDp/08KYJmtbzJt2J6xIG', 'TEST');
``