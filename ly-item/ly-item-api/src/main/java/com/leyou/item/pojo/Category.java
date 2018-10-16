package com.leyou.item.pojo;

/**
 * 商品分类实体类
 *
 * @author: cooFive
 * @CreateDate: 2018/7/15 16:55
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
//@Table(name="tb_category")
public class Category {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long parentId;
	private Boolean isParent;
	private Integer sort;
    // 注意isParent的get和set方法


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "Category{" +
				"id=" + id +
				", name='" + name + '\'' +
				", parentId=" + parentId +
				", isParent=" + isParent +
				", sort=" + sort +
				'}';
	}
}