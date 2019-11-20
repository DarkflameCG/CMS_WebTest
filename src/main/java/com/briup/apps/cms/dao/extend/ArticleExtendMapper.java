package com.briup.apps.cms.dao.extend;

import com.briup.apps.cms.bean.extend.ArticleExtend;

import java.util.List;

public interface ArticleExtendMapper {

    /**
     * 级联查询文章的所有信息
     * @return
     */
    List<ArticleExtend> cascadeFindAllArticle();

    /**
     * 根据id查询文章的所有信息
     * @param id
     * @return
     */
    ArticleExtend findArticleById(long id);


}