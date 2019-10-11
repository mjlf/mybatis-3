package org.apache.ibatis.test.test1.entity;

import org.apache.ibatis.type.Alias;

/**
 * @ClassName Blog
 * @auther mjlf
 * @Date 2019/10/11 11:18
 * @Description TODO
 */
//@Alias("Blog")
public class Blog {

  private Integer id;

  @Override
  public String toString() {
    return "Blog{" +
      "id=" + id +
      '}';
  }
}
