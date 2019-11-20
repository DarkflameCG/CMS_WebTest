package com.briup.apps.cms.dao.extend;

import com.briup.apps.cms.bean.extend.CategoryExtend;

import java.util.List;

/**
 * @author GX Cui
 * @ClassName: CategoryExtendMapper
 * @Description: Category表扩展mapper
 * @date 2019/11/20 11:08
 */
public interface CategoryExtendMapper {

    /**
     * 级联查询所有分类
     * @return
     */
    List<CategoryExtend> cascadeFindAllCategory();
}
