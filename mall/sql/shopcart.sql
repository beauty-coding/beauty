CREATE TABLE `map_shopcart_good`  (
  `id` int UNSIGNED NOT NULL COMMENT '主键',
  `shopcart_id` int UNSIGNED NOT NULL COMMENT '购物车主键',
  `good_id` int UNSIGNED NOT NULL COMMENT '商品主键',
  `nums` tinyint(255) UNSIGNED NOT NULL DEFAULT 0 COMMENT '购物车中此商品的数量',
  `add_time` bigint UNSIGNED NOT NULL COMMENT '加入购物车的时间毫秒数',
  PRIMARY KEY (`id`)
);

CREATE TABLE `shopcart`  (
  `id` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '主键',
  `userid` int UNSIGNED NOT NULL COMMENT '用户主键',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB COMMENT = '购物车';

