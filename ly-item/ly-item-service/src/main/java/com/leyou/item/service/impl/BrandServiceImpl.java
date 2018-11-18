package com.leyou.item.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leyou.item.dao.mapper.BrandMapper;
import com.leyou.item.entity.Brand;
import com.leyou.item.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 11/18/2018 2:22 PM
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    /**
     * 添加商品品牌
     *
     * @param brand 商品品牌
     * @return boolean
     */
    @Override
    public boolean addBrand(Brand brand) {
        return this.save(brand);
    }

    /**
     * 根据id删除商品品牌
     *
     * @param id 商品品牌id
     * @return boolean
     */
    @Override
    public boolean deleteBrandById(Long id) {
        return this.removeById(id);
    }

    /**
     * 根据id修改商品品牌
     *
     * @param brand 商品品牌
     * @return boolean
     */
    @Override
    public boolean updateBrandById(Brand brand) {
        return this.updateById(brand);
    }

    /**
     * 根据id查询商品品牌
     *
     * @param id 商品品牌id
     * @return Brand
     */
    @Override
    public Brand getBrandById(Long id) {
        return this.getById(id);
    }
}
