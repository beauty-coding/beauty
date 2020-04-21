package com.beauty.mall.store.dao;

import com.beauty.mall.store.entity.Store;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 库存(Store)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-17 19:22:53
 */
public interface StoreDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Store queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Store> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param store 实例对象
     * @return 对象列表
     */
    List<Store> queryAll(Store store);

    /**
     * 新增数据
     *
     * @param store 实例对象
     * @return 影响行数
     */
    int insert(Store store);

    /**
     * 修改数据
     *
     * @param store 实例对象
     * @return 影响行数
     */
    int update(Store store);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}