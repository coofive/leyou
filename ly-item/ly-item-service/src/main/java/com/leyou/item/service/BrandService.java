package com.leyou.item.service;

import com.leyou.item.entity.Brand;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 11/18/2018 2:21 PM
 */
public interface BrandService {
    /**
     * 添加商品品牌
     *
     * @param brand 商品品牌
     * @return boolean
     */
    boolean addBrand(Brand brand);

    /**
     * 根据id删除商品品牌
     *
     * @param id 商品品牌id
     * @return boolean
     */
    boolean deleteBrandById(Long id);

    /**
     * 根据id修改商品品牌
     *
     * @param brand 商品品牌
     * @return boolean
     */
    boolean updateBrandById(Brand brand);

    /**
     * 根据id查询商品品牌
     *
     * @param id 商品品牌id
     * @return Brand
     */
    Brand getBrandById(Long id);
}
