CREATE TABLE `map_goods_order`  (
  `id` int UNSIGNED NOT NULL COMMENT '主键',
  `order_id` int NOT NULL COMMENT '订单主键',
  `good_id` int NOT NULL COMMENT '商品主键（订单中包含的商品）',
  `nums` int(255) UNSIGNED NOT NULL DEFAULT 0 COMMENT '订单中包含此商品数量',
  PRIMARY KEY (`id`)
);

CREATE TABLE `order`  (
  `id` int UNSIGNED NOT NULL COMMENT '主键',
  `createtime` bigint UNSIGNED NOT NULL COMMENT '生成日期',
  `userid` int UNSIGNED NOT NULL COMMENT '生成订单人',
  PRIMARY KEY (`id`)
);

