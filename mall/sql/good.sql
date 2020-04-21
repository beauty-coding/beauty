CREATE TABLE `good`  (
  `id` int NOT NULL DEFAULT '' COMMENT '主键',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '商品名称',
  `class` int NOT NULL COMMENT '所属分类主键',
  `price` decimal(10, 2) NOT NULL COMMENT '价格',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '描述',
  PRIMARY KEY (`id`)
);

CREATE TABLE `goodclass`  (
  `id` int UNSIGNED NOT NULL COMMENT '主键',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '分类名',
  `pid` int UNSIGNED NOT NULL COMMENT '父分类',
  `level` int(255) UNSIGNED NOT NULL DEFAULT 0 COMMENT '分类级别',
  PRIMARY KEY (`id`)
);

