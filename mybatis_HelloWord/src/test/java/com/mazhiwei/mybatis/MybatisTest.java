package com.mazhiwei.mybatis;

import com.mazhiwei.mybatis.mapper.JobMapper;
import com.mazhiwei.mybatis.pojo.User;
import com.mazhiwei.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 马治伟
 * @version 1.0
 */
public class MybatisTest {

    /**
     * SqlSession：代表Java程序和数据库之间的会话。（HttpSession是Java程序和浏览器之间的
     * 会话）
     * SqlSessionFactory：是“生产”SqlSession的“工厂”。
     * 工厂模式：如果创建某一个对象，使用的过程基本固定，那么我们就可以把创建这个对象的
     * 相关代码封装到一个“工厂类”中，以后都使用这个工厂类来“生产”我们需要的对象。
     */
    @Test
    public void insertJob() {
        //读取mybatis核心配置文件
//        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
//        //创建对象
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
//        //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
//        SqlSession sqlSession = sqlSessionFactory.openSession();
        ////创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        // 创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
//        SqlSession session = sqlSessionFactory.openSession(true);
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        //通过代理模式创建UserMapper接口的代理实现类对象
        JobMapper mapper = sqlSession.getMapper(JobMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，
        //通过调用的方法名匹配 映射文件中的SQL标签，并执行标签中的SQL语句

        //invoke是执行的方法
        int i = mapper.insertJob();

        //提交事务
        sqlSession.commit();
        //输出结果
        System.out.println("结果是" + i);
        //关闭流，停止对话
        sqlSession.close();
    }

    @Test
    public void deleteJob() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        JobMapper mapper = sqlSession.getMapper(JobMapper.class);
        mapper.deleteJob();
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateJob() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        JobMapper mapper = sqlSession.getMapper(JobMapper.class);
        mapper.updateJob();
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectJob() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        JobMapper mapper = sqlSession.getMapper(JobMapper.class);
        User user = mapper.selectByIdJob();

        System.out.println(user);
    }


    @Test
    public void selectAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        JobMapper mapper = sqlSession.getMapper(JobMapper.class);
        List<User> users = mapper.selectAllUser();

        //记住这种写法
        for( User user : users) {
            System.out.println(user);
        }
//        System.out.println(users);
    }
}
