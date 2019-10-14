package org.apache.ibatis.test.test1.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.test.test1.entity.Blog;

import java.util.List;

/**
 * @ClassName BlogMapper
 * @auther mjlf
 * @Date 2019/10/11 11:19
 * @Description 博客mapper
 */
public interface BlogMapper {

  Blog getBlobById(Integer id);

  Blog getOtherBlogById(Integer id);

  List<Blog> getOtherBlogByCondition(Blog blog);

  List<Blog> getAllBlob();

  void updateBlogById(Blog blog);

  List<Blog> getOtherBlogByAuthors(List<Integer> authors);
}
