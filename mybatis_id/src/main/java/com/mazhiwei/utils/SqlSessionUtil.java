package com.mazhiwei.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 马治伟
 * @version 1.0
 */
public class SqlSessionUtil {

   public static SqlSession getSqlSession() {
      SqlSession sqlSession = null;
      //读取mybatis核心配置文件
      try {
         InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
         //创建对象
         SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
         SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
         //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
         sqlSession = sqlSessionFactory.openSession();
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
      return sqlSession;
   }
}
