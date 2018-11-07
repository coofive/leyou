package com.leyou.item.web.controller;

import com.leyou.common.dto.ResultDTO;
import com.leyou.common.utils.ResponseGenerator;
import com.leyou.item.entity.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品分类
 *
 * @author coofive
 * @version : 1.0.0
 */
@RestController
@RequestMapping("/item/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 添加商品分类
     *
     * @param category 商品分类实体
     * @return ResultDTO
     */
    @PostMapping
    public ResultDTO add(@RequestBody Category category) {
        boolean result = this.categoryService.add(category);
        return result ? ResponseGenerator.success() : ResponseGenerator.fail("添加商品失败");
    }
}
