package com.beauty.mall.store.controller;

import com.beauty.mall.store.entity.Store;
import com.beauty.mall.store.service.StoreService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 库存(Store)表控制层
 *
 * @author makejava
 * @since 2020-04-17 19:22:55
 */
@RestController
@RequestMapping("store")
public class StoreController {
    /**
     * 服务对象
     */
    @Resource
    private StoreService storeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Store selectOne(Integer id) {
        return this.storeService.queryById(id);
    }

}