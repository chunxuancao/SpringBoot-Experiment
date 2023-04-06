package com.springboot.demo.database.service;

//业务操作类，实现查询、删除、更新操作

import com.springboot.demo.database.Repository.*;
import com.springboot.demo.database.domain.*;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

//步骤1：加入@Service注解，生成实例，存入容器中
@Service
public class ArticleService {
    // 步骤3：注入@Autowired 注解:可以对实例对象commentRepository进行标注,让 spring 完成 bean 自动装配的工作
    @Autowired
    // 步骤2；引入CommentRepository类实例对象，用来完成后续的数据操作
    private ArticleRepository articleRepository;
    /*
     * 步骤id查询,返回Comment对象
     */

    public Article findByAid(Integer aid) {
        Optional<Article> byAid = articleRepository.findById(aid);
        if (byAid.isPresent()) { // 判断是否有值
            return byAid.get();
        }
        return null;// 没值返回空值
    }

    /*
     * 步骤5：实现更新操作
     */
    public int updateArticle(Article article) {// 更新操作有无返回值均可
        // updateComment为CommentRepository定义的方法，传递作者和id两个参数
        int i = articleRepository.updateContent(article.getContent(), article.getAid());
        return i;
    }

    /*
     * 步骤6：实现删除操作
     */
    public void deleteArticle(Integer aid) {
        articleRepository.deleteById(aid);
    }

    public int addArticle(String title, String content, Integer uid){
        return articleRepository.addArticle(title, content, uid);
    };
}
