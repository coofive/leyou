package com.leyou.item.web.controller;

import com.leyou.common.constants.StatusCode;
import com.leyou.common.dto.ResultDTO;
import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 添加商品分类
     *
     * @param category
     * @return
     */
    @PostMapping
    public ResultDTO add(@RequestBody Category category){
        this.categoryService.add(category);
        return null;
    }
}
