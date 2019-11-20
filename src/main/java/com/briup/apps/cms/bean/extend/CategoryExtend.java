package com.briup.apps.cms.bean.extend;

import com.briup.apps.cms.bean.Category;

/**
 * @author GX Cui
 * @ClassName: CategoryExtend
 * @Description: Category表扩展bean类
 * @date 2019/11/20 10:35
 */
public class CategoryExtend extends Category{

    private Category parentCategory;

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    @Override
    public String toString() {
        return "CategoryExtend{" +
                "parentCategory=" + parentCategory +
                '}';
    }
}
