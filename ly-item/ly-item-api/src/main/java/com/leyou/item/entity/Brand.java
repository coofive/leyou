package com.leyou.item.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 11/18/2018 2:07 PM
 */
@Data
@TableName(value = "tb_brand")
public class Brand {
    /**
     * 品牌id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 品牌名称
     */
    private String name;

    /**
     * 品牌图片
     */
    private String image;

    /**
     * 品牌首字母
     */
    private Character letter;
}
