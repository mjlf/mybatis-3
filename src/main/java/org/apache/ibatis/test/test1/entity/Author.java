package org.apache.ibatis.test.test1.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @ClassName Author
 * @auther mjlf
 * @Date 2019/10/12 11:10
 * @Description 作者
 */
@Data
@Alias("author")
public class Author {
  private Integer id;
  private String authorName;
}
