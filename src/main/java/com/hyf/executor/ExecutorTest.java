/*
 *    Copyright 2009-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.hyf.executor;

import org.apache.ibatis.executor.SimpleExecutor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2021/6/9]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ExecutorTest {

  private static Configuration configuration;
  private static Connection connection;
  private static JdbcTransaction transaction;

  static {
    SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();

    SqlSessionFactory factory = factoryBuilder.build(ExecutorTest.class.getResourceAsStream("/config.xml"));
    configuration = factory.getConfiguration();
    connection = factory.openSession().getConnection();
    transaction = new JdbcTransaction(connection);
  }

  public static void main(String[] args) throws SQLException {

    SimpleExecutor simpleExecutor = new SimpleExecutor(configuration, transaction);
    MappedStatement mappedStatement = configuration.getMappedStatement("com.hyf.test.UserMapper" +
      ".selectUserById");
    simpleExecutor.doQuery(mappedStatement, "1", RowBounds.DEFAULT, SimpleExecutor.NO_RESULT_HANDLER,
      mappedStatement.getBoundSql(1));
  }
}
