package com.hyf.test;


import com.hyf.executor.mapper.UserMapper;
import org.apache.ibatis.executor.SimpleExecutor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransaction;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2021/6/10]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

public class ExecutorTest {

  private static SqlSessionFactoryBuilder factoryBuilder;

  private static Configuration configuration;

  private static SqlSessionFactory factory;

  private static JdbcTransaction transaction;

  private static SqlSession sqlSession;

  static {
    try {
      factoryBuilder = new SqlSessionFactoryBuilder();
      factory = factoryBuilder.build(ExecutorTest.class.getResourceAsStream("/resources/config.xml"));
      configuration = factory.getConfiguration();
      sqlSession = factory.openSession();
      transaction = new JdbcTransaction(sqlSession.getConnection());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  void test() throws Exception {
    SimpleExecutor executor = new SimpleExecutor(configuration, transaction);
    MappedStatement statement = configuration.getMappedStatement("com.hyf.executor.mapper.UserMapper.selectUserById");
    List<Object> list = executor.doQuery(statement, 1, RowBounds.DEFAULT, SimpleExecutor.NO_RESULT_HANDLER,
      statement.getBoundSql(1));
    System.out.println(list);
  }

  @Test
  void test2() {
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    System.out.println(userMapper.selectUserById("1"));
  }
}
