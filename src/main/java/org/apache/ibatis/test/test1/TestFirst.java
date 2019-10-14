package org.apache.ibatis.test.test1;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.test.test1.entity.Author;
import org.apache.ibatis.test.test1.entity.Blog;
import org.apache.ibatis.test.test1.entity.Comment;
import org.apache.ibatis.test.test1.mapper.AuthorMapper;
import org.apache.ibatis.test.test1.mapper.BlogMapper;
import org.apache.ibatis.test.test1.mapper.CommentMapper;
import org.apache.ibatis.test.util.SqlSessionFactoryUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestFirst
 * @auther mjlf
 * @Date 2019/10/11 9:39
 * @Description TODO
 */
public class TestFirst {
  public static void main(String[] args) throws IOException {
    String resourcePath = "mybatis-config.xml";

    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory(resourcePath);
    //设置自动事务提交
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {

      BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

//      List<Integer> authors = new ArrayList<>();
//      authors.add(1);
//      authors.add(2);

      Blog blog = new Blog();
      blog.setContent("哈哈");

      System.out.println(mapper.getOtherBlogByCondition(blog).size());
    }
  }
}
