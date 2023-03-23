package com.springboot.demo.mapper;

import com.springboot.demo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CommentMapper {
    @Select("select * from t_comment where id=#{id}")
    public Comment findById(Integer id);

    @Select("insert into t_comment(context,author,a_id)")
    public int insertComment(Comment comment);

    @Select("update t_comment set content=#{content} where id=#{id}")
    public int updataComment(Comment comment);

    @Select("delete from t_comment where id=#{id}")
    public int deleteComment(Integer id);
}
