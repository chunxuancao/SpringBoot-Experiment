package com.springboot.demo.service;

//业务操作类，实现查询、删除、更新操作

import com.springboot.demo.domain.Comment;
import com.springboot.demo.repository.CommentRepository;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

//步骤1：加入@Service注解，生成实例，存入容器中
@Service
public class CommentService {
    // 步骤3：注入@Autowired 注解:可以对实例对象commentRepository进行标注,让 spring 完成 bean 自动装配的工作
    @Autowired
    // 步骤2；引入CommentRepository类实例对象，用来完成后续的数据操作
    private CommentRepository commentRepository;
    /*
     * 步骤id查询,返回Comment对象
     */

    public Comment findById(Integer id) {
        Optional<Comment> byId = commentRepository.findById(id);
        if (byId.isPresent()) { // 判断是否有值
            return byId.get();
        }
        return null;// 没值返回空值
    }

    /*
     * 步骤5：实现更新操作
     */
    public int updateComment(Comment comment) {// 更新操作有无返回值均可
        // updateComment为CommentRepository定义的方法，传递作者和id两个参数
        int i = commentRepository.updateComment(comment.getAuthor(), comment.getId());
        return i;
    }

    /*
     * 步骤6：实现删除操作
     */
    public void deleteComment(Integer id) {
        commentRepository.deleteById(id);
    }
}
