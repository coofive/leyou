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

    /**
     * 删除商品分类
     *
     * @param id 商品分类id
     * @return boolean
     */
    boolean deleteCategory(Long id);

    /**
     * 根据商品分类id查询商品分类
     *
     * @param id 商品分类id
     * @return boolean
     */
    Category getCategoryById(Long id);
}
