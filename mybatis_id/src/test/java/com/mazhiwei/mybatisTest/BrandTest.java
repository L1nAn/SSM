package com.mazhiwei.mybatisTest;

import com.mazhiwei.mapper.UserMapper;
import com.mazhiwei.pojo.User;
import com.mazhiwei.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author 马治伟
 * @version 1.0
 */
public class BrandTest {

    @Test
    public void insertBrand() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "鱼皮");
        mapper.insertUser(user);

        sqlSession.commit();

        System.out.println(user);
        sqlSession.close();
    }
}
