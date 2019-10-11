package org.apache.ibatis.test.test1.plugin;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * @ClassName MyInterceptor
 * @auther mjlf
 * @Date 2019/10/11 16:12
 * @Description TODO
 */
@Intercepts(
  @Signature(method = "query",
    type = Executor.class,
  args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})
)
public class MyInterceptor implements Interceptor {

  @Override
  public Object intercept(Invocation invocation) throws Throwable {
    System.out.println("拦截方法执行前");
    Object object = invocation.proceed();
    System.out.println("拦截方法执行后");
    return object;
  }

  @Override
  public Object plugin(Object target) {
    return Plugin.wrap(target, this);
  }

  @Override
  public void setProperties(Properties properties) {

  }
}
