package com.briup.apps.cms;

import com.briup.apps.cms.bean.Article;
import com.briup.apps.cms.bean.extend.ArticleExtend;
import com.briup.apps.cms.dao.extend.ArticleExtendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CmsSpotinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsSpotinfoApplication.class, args);
    }

}
