package com.mazhiwei.mapper;

import com.mazhiwei.pojo.Brand;
import org.apache.ibatis.annotations.Param;

/**
 * @author 马治伟
 * @version 1.0
 */
public interface BrandMapper {
   Brand selectByIdBrand(@Param("id") Integer id);
}
