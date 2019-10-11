package org.apache.ibatis.test.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @ClassName SqlSessionFactoryUtil
 * @auther mjlf
 * @Date 2019/10/11 10:09
 * @Description SqlSessionFactory工厂类
 */
public final class SqlSessionFactoryUtil {

  private static SqlSessionFactory sqlSessionFactory = null;

  public static SqlSessionFactory getSqlSessionFactory(String resource) throws IOException {
    if (sqlSessionFactory == null) {
      synchronized (SqlSessionFactoryUtil.class) {
        if (sqlSessionFactory == null) {
          sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        }
      }
    }
    return sqlSessionFactory;
  }
}
