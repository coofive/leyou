package com.leyou.item.web.controller;

import com.leyou.common.dto.ResultDTO;
import com.leyou.common.utils.ResponseGenerator;
import com.leyou.item.dao.po.Category;
import com.leyou.item.service.CategoryService;
import com.sun.jndi.toolkit.url.Uri;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

/**
 * 商品分类
 *
 * @author coofive
 * @version : 1.0.0
 */
@RestController
@RequestMapping("/item/category")
@Api(tags = "CategoryController", description = "商品分类接口", produces = "application/json")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 添加商品分类
     *
     * @param category 商品分类实体
     * @return ResponseEntity
     */
    @PostMapping
    @ApiOperation(value = "添加商品分类", notes = "添加商品分类")
    public ResponseEntity<Void> add(@RequestBody @ApiParam(value = "商品分类", required = true) Category category) {
        boolean result = this.categoryService.addCategory(category);
        return result ? ResponseEntity.status(HttpStatus.CREATED).build() : ResponseEntity.badRequest().build();
    }

    /**
     * 修改商品分类
     *
     * @param category 商品分类实体
     * @param id       商品分类id
     * @return ResponseEntity
     */
    @PutMapping("/{id}")
    @ApiOperation(value = "根据id修改商品分类", notes = "修改商品分类")
    public ResponseEntity<Void> update(@RequestBody @ApiParam(value = "商品分类", required = true) Category category,
                                       @PathVariable @ApiParam(value = "商品分类id", required = true) Long id) {
        category.setId(id);
        boolean result = this.categoryService.updateCategory(category);
        return result ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    /**
     * 删除商品分类
     *
     * @param id 商品分类id
     * @return ResponseEntity
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "根据id删除商品分类", notes = "删除商品分类")
    public ResponseEntity<Void> delete(@PathVariable @ApiParam(value = "商品分类id", required = true) Long id) {
        boolean result = this.categoryService.deleteCategory(id);
        return result ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    /**
     * 根据id查询商品分类
     *
     * @param id 商品分类id
     * @return ResponseEntity
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "根据id查询商品分类", notes = "查询商品分类")
    public ResponseEntity<Category> getById(@PathVariable @ApiParam(value = "商品分类id", required = true) Long id) {
        Category category = this.categoryService.getCategoryById(id);
        return category == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(category);
    }

    /**
     * 根据父节点id查询商品分类
     *
     * @param parentId 商品分类父节点id
     * @return ResponseEntity
     */
    @GetMapping("list/{pid}")
    @ApiOperation(value = "根据父节点id查询商品分类", notes = "查询商品分类")
    public ResponseEntity<List<Category>> getByParentId(@PathVariable(value = "pid") @ApiParam(value = "商品分类父节点id", required = true) Long parentId) {
        List<Category> categories = this.categoryService.getCategoryByParentId(parentId);
        return CollectionUtils.isEmpty(categories) ? ResponseEntity.notFound().build() : ResponseEntity.ok(categories);
    }

    /**
     * 根据ids查询商品分类
     *
     * @param ids 商品分类ids
     * @return ResponseEntity
     */
    @GetMapping("list")
    @ApiOperation(value = "根据ids查询商品分类", notes = "查询商品分类")
    public ResponseEntity<List<Category>> getByIds(@RequestParam(value = "ids") @ApiParam(value = "商品分类ids", required = true) List<Long> ids){
        List<Category> categories = this.categoryService.getCategoryByIds(ids);
        return CollectionUtils.isEmpty(categories) ? ResponseEntity.notFound().build() : ResponseEntity.ok(categories);
    }

    /**
     * 根据cid查询层级所有商品分类
     *
     * @param cid 商品分类id
     * @return ResponseEntity
     */
    @GetMapping("all/level")
    @ApiOperation(value = "根据cid查询层级所有商品分类", notes = "查询商品分类")
    public ResponseEntity<List<Category>> getByCid(@RequestParam(value = "cid") @ApiParam(value = "商品分类id", required = true) Long cid){
        List<Category> categories = this.categoryService.getCategoryByCid(cid);
        return CollectionUtils.isEmpty(categories) ? ResponseEntity.notFound().build() : ResponseEntity.ok(categories);
    }
}
