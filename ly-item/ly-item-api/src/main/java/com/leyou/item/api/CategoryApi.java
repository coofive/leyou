package com.leyou.item.api;

import com.leyou.item.entity.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 11/13/2018 11:20 PM
 */
@RequestMapping("/item/category")
public interface CategoryApi {

    /**
     * 添加商品分类
     *
     * @param category 商品分类实体
     * @return ResponseEntity
     */
    @PostMapping
    ResponseEntity<Void> add(@RequestBody Category category);

    /**
     * 修改商品分类
     *
     * @param category 商品分类实体
     * @param id       商品分类id
     * @return ResponseEntity
     */
    @PutMapping("/{id}")
    ResponseEntity<Void> update(@RequestBody Category category, @PathVariable Long id);

    /**
     * 删除商品分类
     *
     * @param id 商品分类id
     * @return ResponseEntity
     */
    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id);

    /**
     * 根据id查询商品分类
     *
     * @param id 商品分类id
     * @return ResponseEntity
     */
    @GetMapping("/{id}")
    ResponseEntity<Category> getById(@PathVariable Long id);

    /**
     * 根据父节点id查询商品分类
     *
     * @param parentId 商品分类父节点id
     * @return ResponseEntity
     */
    @GetMapping("list/{pid}")
    ResponseEntity<List<Category>> getByParentId(@PathVariable(value = "pid") Long parentId);

    /**
     * 根据ids查询商品分类
     *
     * @param ids 商品分类ids
     * @return ResponseEntity
     */
    @GetMapping("list")
    ResponseEntity<List<Category>> getByIds(@RequestParam(value = "ids") List<Long> ids);

    /**
     * 根据cid查询层级所有商品分类
     *
     * @param cid 商品分类id
     * @return ResponseEntity
     */
    @GetMapping("all/level")
    ResponseEntity<List<Category>> getByCid(@RequestParam(value = "cid") Long cid);
}
