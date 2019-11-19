package com.briup.apps.cms.service;

import com.briup.apps.cms.bean.Article;
import com.briup.apps.cms.bean.extend.ArticleExtend;

import java.util.List;

/**
 * @author GX Cui
 * @ClassName: IArticleService
 * @Description: Article表的相关业务逻辑接口
 * @date 2019/11/13 16:50
 */
public interface IArticleService {

    /**
     *返回该表下所有文章的List集合
     * @return
     */
    List<Article> findAll();

    /**
     * 文章的新增及修改功能
     * @param article
     * @return
     */
    int saveAndUpdate(Article article);

    /**
     *返回该表的级联属性：用户、分类、留言等
     * @return
     */
    List<ArticleExtend> casecadeFindAll();

    /**
     * 根据id查询文章，并返回分类和留言
     * @return
     */
    ArticleExtend findArticleById(long art_id);

    /***
     * 根据id删除文章
     * @param art_id
     * @return
     */
    int removeArticleById(long art_id);

}
