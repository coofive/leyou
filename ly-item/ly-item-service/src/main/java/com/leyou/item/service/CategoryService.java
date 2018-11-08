package com.leyou.item.service;


import com.leyou.item.dao.po.Category;

import java.util.List;

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

    /**
     * 根据父节点id查询商品分类
     *
     * @param parentId 商品分类父节点id
     * @return List
     */
    List<Category> getCategoryByParentId(Long parentId);

    /**
     * 根据商品分类ids查询商品分类
     *
     * @param ids 商品分类id
     * @return List
     */
    List<Category> getCategoryByIds(List<Long> ids);

    /**
     * 根据cid查询层级所有商品分类
     *
     * @param cid 商品分类id
     * @return List
     */
    List<Category> getCategoryByCid(Long cid);
}
