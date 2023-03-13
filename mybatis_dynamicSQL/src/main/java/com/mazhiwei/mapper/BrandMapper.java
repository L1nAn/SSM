package com.mazhiwei.mapper;

import com.mazhiwei.pojo.Brand;

import java.util.List;

/**
 * @author 马治伟
 * @version 1.0
 */
public interface BrandMapper {

    List<Brand> selectBy(Brand brand);

}
