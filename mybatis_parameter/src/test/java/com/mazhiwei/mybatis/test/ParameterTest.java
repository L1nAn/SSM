package com.mazhiwei.mybatis.test;

import com.mazhiwei.mybatis.mapper.SpeaicalMapper;
import com.mazhiwei.mybatis.mapper.UserMapper;
import com.mazhiwei.mybatis.pojo.User;
import com.mazhiwei.mybatis.pojo.Users;
import com.mazhiwei.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 马治伟
 * @version 1.0
 */
public class ParameterTest {

    @Test
    public void selectByUserName() {
        String username = "经理";
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectByUserName(username);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void loginUser() {
        int id = 2;
        String username = "经理";
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.loginUser(id, username);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void loginUsers() {
        int id = 2;
        String username = "经理";
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.loginUser(id, username);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void checkLogin() {
        int id = 2;
        String username = "经理";
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("username", username);

        User user = mapper.checkLogin(map);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(99);
        user.setJname("mazhi");
        user.setDescription("漂亮");

        mapper.insertUser(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectOne() {
        int id = 1;
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectOne(id);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void selectAll() {

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.selectAll();
        for (User user : list) {
            System.out.println(user);
            System.out.println("==================");
        }
        sqlSession.close();
    }

    @Test
    public void getCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int count = mapper.getCount();
        System.out.println(count);
        sqlSession.close();
    }

    @Test
    public void selectByUserId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = mapper.selectByUserId(77);
        System.out.println(map);
        sqlSession.close();
    }

    @Test
    public void selectByUserAll() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = mapper.selectByUserAll();
        System.out.println(map);
        sqlSession.close();
    }

    @Test
    public void selectAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Map<String, Object>> list = mapper.selectAllUser();

//        for(Map map :list) {
//            System.out.println(map);
//        }
        System.out.println(list);
        sqlSession.close();
    }


    @Test
    public void selectMo() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpeaicalMapper mapper = sqlSession.getMapper(SpeaicalMapper.class);
        List<Map<String, Object>> maps = mapper.selectMo("韩");

        for (Map map : maps) {
            System.out.println(map);
        }
        sqlSession.close();


    }

    @Test
    public void delrteSp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpeaicalMapper mapper = sqlSession.getMapper(SpeaicalMapper.class);
        mapper.deleteSp("7,89,99");//字符串就是这样写的
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void insertUsers() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Users users = new Users(null,"开发部", "天津");
        mapper.insertUsers(users);
        System.out.println(users);


    }


}
