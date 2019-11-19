package com.briup.apps.cms;

import com.briup.apps.cms.dao.extend.ArticleExtendMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CmsSpotinfoApplicationTests {

    @Autowired
    ArticleExtendMapper aem ;
    @Test
    void contextLoads() {
        System.out.println(aem.findArticleById(1));
    }

}
