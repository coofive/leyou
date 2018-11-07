package com.leyou.item.service;


import com.leyou.item.dao.po.Category;

/**
 * @author coofive
 * @version 1.0.0
 */
public interface CategoryService {

    /**
     * 添加商品分类
     *
     * @param category 商品分类
     * @return boolean
     */
    boolean addCategory(Category category);

    /**
     * 修改商品分类
     *
     * @param category 商品分类
     * @return boolean
     */
    boolean updateCategory(Category category);
}
