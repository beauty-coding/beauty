
CREATE TABLE `store`  (
  `id` int UNSIGNED NOT NULL COMMENT '库存主键',
  `nums` bigint(255) UNSIGNED NOT NULL COMMENT '库存数量',
  `goodid` int UNSIGNED NOT NULL COMMENT '库存商品',
  PRIMARY KEY (`id`)
) COMMENT = '库存';

