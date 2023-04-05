package com.springboot.demo.database.Repository;

import com.springboot.demo.database.domain.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;
import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    // 查询指定作者的所有文章
    // 查询指定作者的哪一个年某一个月的文章
    // 修改某一篇文章（Aid）的内容
    // 提交一篇自己的文章
    // 查看某一篇文章的内容
    // 获取文章的作者的名字

    // @Query("select c from t_comment c where c.aId = ?1")
    // public List<Discuss> getDiscussPaged(Integer aid, Pageable pageable);

    // @Query(value = "select * from t_comment where a_Id = ?1", nativeQuery = true)
    // public List<Discuss> getDiscussPaged2(Integer aid, Pageable pageable);

    // @Transactional
    // @Modifying
    // @Query("update t_comment c set c.author = ?1 where c.id = ?2")
    // public int updateDiscuss(String author, Integer id);

    // @Transactional
    // @Modifying
    // @Query("delete t_comment c where c.id = ?1")
    // public int deleteDiscuss(Integer id);
}
