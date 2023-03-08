package com.mazhiwei.mybatisTest;

import com.mazhiwei.mapper.BrandMapper;
import com.mazhiwei.pojo.Brand;
import com.mazhiwei.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author 马治伟
 * @version 1.0
 */
public class test {
   @Test
   public void selectByIdBrand() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
      Brand brand = mapper.selectByIdBrand(1);

      System.out.println(brand);

      sqlSession.close();
   }
}
