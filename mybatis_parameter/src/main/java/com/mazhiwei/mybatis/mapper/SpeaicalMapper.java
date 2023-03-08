package com.mazhiwei.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 马治伟
 * @version 1.0
 */
public interface SpeaicalMapper {
    List<Map<String,Object>> selectMo(@Param("name") String name);

    void deleteSp(@Param("ids")String ids);


}
