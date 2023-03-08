package com.mazhiwei.mybatis.mapper;

import com.mazhiwei.mybatis.pojo.User;

import java.util.List;

/**
 * @author 马治伟
 * @version 1.0
 */
public interface JobMapper {

    /**
     *
     * 添加信息
     * @return
     */
    int insertJob();
    /**
     *
     * 删除操作
     */
    void deleteJob();

    /**
     *
     * 修改操作
     */

    void updateJob();

    /**
     * 查询功能
     */

   User selectByIdJob();
   List<User> selectAllUser();
}
