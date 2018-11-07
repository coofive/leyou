package com.leyou.item.web.controller;

import com.leyou.common.dto.ResultDTO;
import com.leyou.common.utils.ResponseGenerator;
import com.leyou.item.dao.po.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        boolean result = this.categoryService.addCategory(category);
        return result ? ResponseGenerator.success() : ResponseGenerator.fail("添加商品失败");
    }

    @PutMapping("/{id}")
    public ResultDTO update(@RequestBody Category category, @PathVariable Long id) {
        category.setId(id);
        boolean result = this.categoryService.updateCategory(category);
        return result ? ResponseGenerator.success() : ResponseGenerator.fail("修改商品失败");
    }

    @DeleteMapping("/{id}")
    public ResultDTO delete(@PathVariable Long id) {
        boolean result = this.categoryService.deleteCategory(id);
        return result ? ResponseGenerator.success() : ResponseGenerator.fail("删除商品失败");
    }

    @GetMapping("/{id}")
    public ResultDTO<Category> getById(@PathVariable Long id) {
        Category category = this.categoryService.getCategoryById(id);
        return ResponseGenerator.success(category);
    }
}
