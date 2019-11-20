package com.briup.apps.cms.service.impl;

import com.briup.apps.cms.bean.Article;
import com.briup.apps.cms.bean.ArticleExample;
import com.briup.apps.cms.bean.Category;
import com.briup.apps.cms.bean.CategoryExample;
import com.briup.apps.cms.bean.extend.ArticleExtend;
import com.briup.apps.cms.bean.extend.CategoryExtend;
import com.briup.apps.cms.dao.CategoryMapper;
import com.briup.apps.cms.dao.extend.CategoryExtendMapper;
import com.briup.apps.cms.exception.CustomerException;
import com.briup.apps.cms.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author GX Cui
 * @ClassName: CategoryServiceImpl
 * @Description: TODO
 * @date 2019/11/20 14:33
 */
@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private CategoryExtendMapper cem;


    @Override
    public List<Category> findAll() {
        return categoryMapper.selectByExample(new CategoryExample());

    }

    @Override
    public List<CategoryExtend> cascadeFindAll() {
        return cem.cascadeFindAllCategory();
    }

    @Override
    public int saveOrUpdate(Category category) {
        if(category.getId()!=null){
            //当id存在时，执行更新操作
            return categoryMapper.updateByPrimaryKey(category);
        }else{
            //当id不存在时，执行插入操作
            //基本业务   ----->标题不能重复 后面可使用ajax局部请求
            //判断新增是否重名
            CategoryExample categoryExample = new CategoryExample();
            categoryExample.createCriteria().andNameEqualTo(category.getName());

            List<Category> categories = categoryMapper.selectByExample(categoryExample);
            if(categories.size()>0){
                throw  new CustomerException("该栏目已经存在");
            }
            return categoryMapper.insert(category);
        }
    }

    @Override
    @Transactional
    public int removeById(long id) throws CustomerException{
        Category category = categoryMapper.selectByPrimaryKey(id);
        if(category == null){
            throw new CustomerException("要删除的栏目不存在");
        }
        return categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void batchRemoveByIds(long[] ids) {
        for(long id  :ids){
            this.removeById(id);
        }
    }
}
