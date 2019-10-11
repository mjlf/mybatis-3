package org.apache.ibatis.test.test1.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.test.test1.entity.Blog;

/**
 * @ClassName BlogMapper
 * @auther mjlf
 * @Date 2019/10/11 11:19
 * @Description TODO
 */
public interface BlogMapper {

  Blog selectBlog(Integer id);

  @Select("SELECT * FROM Blog WHERE id = #{id}")
  Blog selectBlogById(Integer id);
}
