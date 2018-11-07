package com.leyou.item.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leyou.item.dao.mapper.CategoryMapper;
import com.leyou.item.dao.po.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * @author coofive
 * @version : 1.0.0
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    /**
     * 添加商品分类
     *
     * @param category 商品分类
     * @return boolean
     */
    @Override
    public boolean addCategory(Category category) {
        return this.save(category);
    }

    /**
     * 修改商品分类
     *
     * @param category 商品分类
     * @return boolean
     */
    @Override
    public boolean updateCategory(Category category) {
        return this.updateById(category);
    }

    /**
     * 删除商品分类
     *
     * @param id 商品分类id
     * @return boolean
     */
    @Override
    public boolean deleteCategory(Long id) {
        return this.removeById(id);
    }

    /**
     * 根据商品分类id查询商品分类
     *
     * @param id 商品分类id
     * @return boolean
     */
    @Override
    public Category getCategoryById(Long id) {
        return this.getById(id);
    }
}
