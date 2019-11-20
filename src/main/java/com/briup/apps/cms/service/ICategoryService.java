package com.briup.apps.cms.service;

import com.briup.apps.cms.bean.Category;
import com.briup.apps.cms.bean.extend.CategoryExtend;
import com.briup.apps.cms.exception.CustomerException;

import java.util.List;

/**
 * @author GX Cui
 * @ClassName: ICategoryService
 * @Description: Category表业务功能
 * @date 2019/11/19 17:07
 */
public interface ICategoryService {

    /**
     * 查询全部分类
     * @return
     */
    List<Category> findAll();

    /**
     * 级联查询分类的所有信息，包括其父类目
     * @return
     */
    List<CategoryExtend> cascadeFindAll();

    /**
     *新增或更新类目
     * @param category
     * @return
     */
    int saveOrUpdate(Category category);

    /**
     * 根据id删除类目。有级联操作
     * 如果文章中有该类目的外键，则删除失败
     * @param id
     * @return
     */
    int removeById(long id) throws CustomerException;

    /**
     * 根据id的数组批量删除类目
     * @param ids
     */
    void batchRemoveByIds(long[] ids);
}
