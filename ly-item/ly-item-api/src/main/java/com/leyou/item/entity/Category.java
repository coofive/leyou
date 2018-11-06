package com.leyou.item.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 商品分类实体类
 *
 * @author : coofive
 * @version : 1.0.0
 * @date : 2018/7/15 16:55
 */
@ToString
@Data
public class Category {
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;
}