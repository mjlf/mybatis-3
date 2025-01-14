package org.apache.ibatis.test.test1.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * @ClassName Blog
 * @auther mjlf
 * @Date 2019/10/11 11:18
 * @Description 日志
 */
@Data
@Alias("Blog")
public class Blog {

  private Integer id;
  private Integer authorId;
  private String content;
  private Author author;
  private List<Comment> comments;
}
