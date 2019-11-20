package com.briup.apps.cms.web.controller;

import com.briup.apps.cms.bean.Article;
import com.briup.apps.cms.bean.Category;
import com.briup.apps.cms.service.impl.CategoryServiceImpl;
import com.briup.apps.cms.util.Message;
import com.briup.apps.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.Arrays;

/**
 * @author GX Cui
 * @ClassName: CategoryController
 * @Description: Categroy表操作接口
 * @date 2019/11/20 15:07
 */
@Api("栏目操作接口")
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryService;

    @ApiOperation(value = "查询全部分类",httpMethod = "GET")
    @GetMapping("/findAll")
    public Message cascadeFindAllCategory(){
        return MessageUtil.success("查询成功",categoryService.findAll());
    }

    @ApiOperation(value = "根据id删除分类",httpMethod = "GET")
    @ApiImplicitParam(name = "id",value = "分类编号",paramType = "query",required = true)
    @GetMapping("/deleteById")
    public Message deleteCategoryById(long id){
        if(categoryService.removeById(id)!=0) {
            return MessageUtil.success("删除成功");
        }
        return MessageUtil.success("删除操作异常");
    }

    //有问题需要解决
    @ApiOperation(value = "批量删除分类",httpMethod = "POST")
    @ApiImplicitParam(name = "ids",value = "id数组",allowMultiple = true,paramType = "query",dataType = "long")
    @PostMapping("/batchDelete")
    public Message batchDeleteCategoryByIds(long[] ids){
        categoryService.batchRemoveByIds(ids);
        return MessageUtil.success("删除成功");
    }

    @ApiOperation(value = "新增或更新分类",httpMethod = "POST",notes = "如果参数中包含id，则认为是更新操作；如果参数中不含id，则认为是新增操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "编号", paramType = "form"),
            @ApiImplicitParam(name = "name", value = "分类名字", paramType = "form", required = true),
            @ApiImplicitParam(name = "description", value = "描述", paramType = "form"),
            @ApiImplicitParam(name = "no", value = "这个可能是序号，还没有用到", paramType = "form"),
            @ApiImplicitParam(name = "parent_id", value = "所属父栏目id", paramType = "form"),
    })
    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdateCategory(Long id,
                                       @NotNull String name,
                                       String description,
                                       int no,
                                       Long parent_id){
        Category category = new Category();
        category.setDescription(description);
        category.setId(id);
        category.setName(name);
        category.setNo(no);
        category.setParentId(parent_id);
        int flag = categoryService.saveOrUpdate(category);
        if(flag!=0) {
            return MessageUtil.success("操作成功");
        }
        return MessageUtil.success("操作失败");
    }


}
