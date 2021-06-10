package com.hyf.executor;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2021/6/9]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Test {

  public static void main(String[] args) throws Exception {
    Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println(clazz.newInstance());
  }
}
