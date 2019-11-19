package com.briup.apps.cms.bean.extend;

import com.briup.apps.cms.bean.Article;
import com.briup.apps.cms.bean.Category;
import com.briup.apps.cms.bean.Comment;

import java.util.List;

/**
 * @author GX Cui
 * @ClassName: ArticleExtend
 * @Description: Article的扩展类
 * @date 2019/11/13 16:28
 */
public class ArticleExtend extends Article {

    //状态常量
    public static final String STATUS_UNCHECK="未审核";
    public static final String STATUS_CHECK_PASS="审核通过";
    public static final String STATUS_CHECK_NOPASS="审核未通过";

    private Category category;
    private List<Comment> comments;
    private User author;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "ArticleExtend{" +
                "category=" + category +
                ", comments=" + comments +
                ", author=" + author +
                '}';
    }
}
