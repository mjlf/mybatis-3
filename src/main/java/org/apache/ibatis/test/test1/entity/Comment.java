package org.apache.ibatis.test.test1.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @ClassName Comment
 * @auther mjlf
 * @Date 2019/10/12 11:11
 * @Description 日志评论
 */
@Data
@Alias("comment")
public class Comment {

  private Integer id;
  private Integer blogId;
  private Integer authorId;
  private String content;

  //评论者
  private Author author;
}
