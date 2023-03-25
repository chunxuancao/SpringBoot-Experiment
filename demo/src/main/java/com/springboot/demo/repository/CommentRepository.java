package com.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.demo.domain.Comment;

//步骤1：声明是JpaRepository接口，操作的实体为Comment,主键的数据类型为Integer
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    @Transactional
    // 加入@Modifying ，表明这是更新操作
    @Modifying
    // 步骤3：根据修改方法的使用，利用JPA方法写数据库操作语句@Query
    @Query("update t_comment c set c.author = ?1 where id=?2") // 1?表示该占位符等于下句话的第1个参数author，?2表示该占位符等于第2个参数id
    // 步骤2：根据评论id修改评论作者author
    public int updateComment(String author, Integer id);
}
// package com.springboot.demo.repository;

// import com.springboot.demo.domain.Comment;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
// import org.springframework.data.jpa.repository.Query;

// import javax.transaction.Transactional;

// public interface CommentRepository extends JpaRepository<Comment,Integer> {
// @Transactional
// @Modifying
// @Query("UPDATE t_comment c SET c.author = ?1 WHERE c.id=?2")
// public int updateComment(String author,Integer id);
// }
// // 这是后面可执行的代码区别在于@Transactional的注解，这一步一定要注意，导致了自己定义的update操作不能使用