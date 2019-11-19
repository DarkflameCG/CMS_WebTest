package com.briup.apps.cms.web.controller;

import com.briup.apps.cms.bean.Article;
import com.briup.apps.cms.exception.CustomerException;
import com.briup.apps.cms.service.impl.ArticleServiceImpl;
import com.briup.apps.cms.util.Message;
import com.briup.apps.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author GX Cui
 * @ClassName: ArticleController
 * @Description: TODO
 * @date 2019/11/14 11:58
 */
@Api("文章操作接口")
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private  ArticleServiceImpl articleService;

    @ApiOperation(value = "单表请求全部文章",httpMethod = "GET")
    @GetMapping("/findAll")
    public Message findAllArticle(){
        return MessageUtil.success("查询成功",articleService.findAll());
    }

    @ApiOperation(value = "级联查询所有文章信息",httpMethod = "GET")
    @GetMapping("/cascadeFindAll")
    public Message cascadeFindAllArticle(){
        return MessageUtil.success("查询成功",articleService.casecadeFindAll());
    }

    @ApiOperation(value = "根据文章id查询文章信息",httpMethod = "GET")
    @ApiImplicitParam(name = "id",value = "文章编号",paramType = "query",required = true)
    @GetMapping("/findById")
    public Message findArticleInfoById(long id){
        return MessageUtil.success("查询成功",articleService.findArticleById(id));
    }

    @ApiOperation(value = "新增或更新文章",httpMethod = "POST",notes = "如果参数中包含id，则认为是更新操作；如果参数中不含id，则认为是新增操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "编号", paramType = "form", required = false),
            @ApiImplicitParam(name = "title", value = "标题", paramType = "form", required = true),
            @ApiImplicitParam(name = "content", value = "内容", paramType = "form", required = true),
            @ApiImplicitParam(name = "source", value = "源内容", paramType = "form", required = false),  //源内容暂时可以忽略
            @ApiImplicitParam(name = "categoryId", value = "所属栏目id", paramType = "form", required = true),
            @ApiImplicitParam(name = "authorId", value = "所属作者id", paramType = "form", required = false),
    })
    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdateArctile(Long id,
                                       @NotNull String title,
                                       @NotNull String content,
                                       String source,
                                       @NotNull long categoryId,
                                       long authorId){
        Article article = new Article();
        article.setId(id);
        article.setTitle(title);
        article.setContent(content);
        article.setSource(source);
        article.setCategoryId(categoryId);
        article.setAuthorId(authorId);
        int flag = articleService.saveAndUpdate(article);
        if(flag!=0) {
            return MessageUtil.success("操作成功");
        }
        return MessageUtil.success("操作失败");
    }

    @ApiOperation(value = "根据id删除接口",httpMethod = "GET")
    @ApiImplicitParam(name = "id",value = "文章编号",paramType = "query",required = true)
    @GetMapping("/removeById")
    public Message removeArticleByID(Long id){

        int flag = articleService.removeArticleById(id);
        if(flag!=0) {
            return MessageUtil.success("删除成功");
        }
        return MessageUtil.success("删除操作出错");
    }


}
