package com.beauty.mall.store.entity;

import java.io.Serializable;

/**
 * 库存(Store)实体类
 *
 * @author makejava
 * @since 2020-04-17 19:22:35
 */
public class Store implements Serializable {
    private static final long serialVersionUID = 381557132599439163L;
    /**
    * 库存主键
    */
    private Integer id;
    /**
    * 库存数量
    */
    private Object nums;
    /**
    * 库存商品
    */
    private Integer goodid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getNums() {
        return nums;
    }

    public void setNums(Object nums) {
        this.nums = nums;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

}