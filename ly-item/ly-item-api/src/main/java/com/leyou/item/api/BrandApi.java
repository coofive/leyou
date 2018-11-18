package com.leyou.item.api;

import com.leyou.item.entity.Brand;
import com.leyou.item.entity.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 11/18/2018 2:13 PM
 */
@RequestMapping("/item/brand")
public interface BrandApi {

    /**
     * 添加商品品牌
     *
     * @param brand 商品品牌
     * @return ResponseEntity
     */
    @PostMapping
    ResponseEntity<Void> add(@RequestBody Brand brand);

    /**
     * 删除商品品牌
     *
     * @param id 商品品牌id
     * @return ResponseEntity
     */
    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id);

    /**
     * 修改商品品牌
     * @param brand 商品品牌
     * @param id 商品品牌id
     * @return ResponseEntity
     */
    @PutMapping("/{id}")
    ResponseEntity<Void> update(@RequestBody Brand brand, @PathVariable Long id);

    /**
     * 根据id查询商品品牌
     *
     * @param id 商品品牌id
     * @return ResponseEntity
     */
    @GetMapping("/{id}")
    ResponseEntity<Brand> getById(@PathVariable Long id);
}
