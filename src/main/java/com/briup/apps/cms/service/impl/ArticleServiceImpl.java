package com.briup.apps.cms.service.impl;

import com.briup.apps.cms.bean.Article;
import com.briup.apps.cms.bean.ArticleExample;
import com.briup.apps.cms.bean.extend.ArticleExtend;
import com.briup.apps.cms.dao.ArticleMapper;
import com.briup.apps.cms.dao.extend.ArticleExtendMapper;
import com.briup.apps.cms.exception.CustomerException;
import com.briup.apps.cms.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author GX Cui
 * @ClassName: ArticleServiceImpl
 * @Description: Article表的业务逻辑实现层
 * @date 2019/11/13 16:55
 */
@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private ArticleMapper articleMapper ;
    @Autowired
    private ArticleExtendMapper aem;

    @Override
    public List<Article> findAll() {
        return articleMapper.selectByExample(new ArticleExample());
    }

    @Override
    public int saveAndUpdate(Article article) throws CustomerException {
        if(article.getId()!=null){
            //当id存在时，执行更新操作
            return articleMapper.updateByPrimaryKey(article);
        }else{
            //当id不存在时，执行插入操作
            //基本业务   ----->标题不能重复 后面可使用ajax局部请求
            ArticleExample articleExample = new ArticleExample();
            articleExample.createCriteria().andTitleEqualTo(article.getTitle());

            List<Article> articles = articleMapper.selectByExample(articleExample);
            if(articles.size()>0){
                throw  new CustomerException("标题不能重复");
            }

            //插入文章初始化
            article.setPublishTime(new Date().getTime());  //时间
            article.setStatus(ArticleExtend.STATUS_UNCHECK);//状态
            article.setThumbUp(1L);//点赞
            article.setThumbDown(1L);//鄙视
            return articleMapper.insert(article);

        }


    }

    @Override
    public List<ArticleExtend> casecadeFindAll() {
        return aem.cascadeFindAllArticle();
    }

    @Override
    public ArticleExtend findArticleById(long art_id) {
        return aem.findArticleById(art_id);
    }

    @Override
    public int removeArticleById(long art_id) {

        return  articleMapper.deleteByPrimaryKey(art_id);
    }
}
