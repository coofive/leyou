package com.leyou.item.web.controller;

import com.leyou.item.api.BrandApi;
import com.leyou.item.entity.Brand;
import com.leyou.item.service.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 11/18/2018 2:20 PM
 */
@Api(tags = "BrandController", description = "商品品牌接口", produces = "application/json")
@RestController
public class BrandController implements BrandApi {

    @Autowired
    private BrandService brandService;

    /**
     * 添加商品品牌
     *
     * @param brand 商品品牌
     * @return ResponseEntity
     */
    @ApiOperation(value = "添加商品品牌", notes = "添加商品品牌")
    @Override
    public ResponseEntity<Void> add(@RequestBody @ApiParam(value = "商品品牌") Brand brand) {
        boolean result = this.brandService.addBrand(brand);
        return result ? ResponseEntity.status(HttpStatus.CREATED).build() : ResponseEntity.badRequest().build();
    }

    /**
     * 根据id删除商品品牌
     *
     * @param id 商品品牌id
     * @return ResponseEntity
     */
    @ApiOperation(value = "根据id删除商品品牌", notes = "删除商品品牌")
    @Override
    public ResponseEntity<Void> delete(@PathVariable @ApiParam(value = "商品品牌id")Long id) {
        boolean result = this.brandService.deleteBrandById(id);
        return result ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    /**
     * 根据id修改商品品牌
     *
     * @param brand 商品品牌
     * @param id 商品品牌id
     * @return ResponseEntity
     */
    @ApiOperation(value = "根据id修改商品品牌", notes = "修改商品品牌")
    @Override
    public ResponseEntity<Void> update(@RequestBody @ApiParam(value = "商品品牌") Brand brand,
                                       @PathVariable @ApiParam(value = "商品品牌id") Long id) {
        brand.setId(id);
        boolean result = this.brandService.updateBrandById(brand);
        return result ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseEntity<Brand> getById(Long id) {
        return null;
    }
}
