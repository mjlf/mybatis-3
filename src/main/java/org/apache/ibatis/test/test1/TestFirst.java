package org.apache.ibatis.test.test1;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.test.test1.entity.Blog;
import org.apache.ibatis.test.test1.mapper.BlogMapper;
import org.apache.ibatis.test.util.SqlSessionFactoryUtil;

import java.io.IOException;
import java.io.InputStream;

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
    SqlSession sqlSession = sqlSessionFactory.openSession();

    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
    Blog blog = mapper.selectBlog(1);
    System.out.println(blog);

    System.out.println(mapper.selectBlogById(1));
  }
}
