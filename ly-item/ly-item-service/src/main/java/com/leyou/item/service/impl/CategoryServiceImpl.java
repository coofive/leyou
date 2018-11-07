package com.leyou.item.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leyou.item.dao.mapper.CategoryMapper;
import com.leyou.item.entity.Category;
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
     * @param category
     */
    @Override
    public boolean add(Category category) {
        return this.save(category);
    }
}
