package org.apache.ibatis.test.test1.mapper;

import org.apache.ibatis.test.test1.entity.Comment;

import java.util.List;

/**
 * @ClassName CommentMapper
 * @auther mjlf
 * @Date 2019/10/12 14:52
 * @Description 评论mapper
 */
public interface CommentMapper {

  void saveComment(Comment comment);

  List<Comment> getAllCommentByBlogId(Integer blogId);

  Comment getCommentById(Integer id);
}
