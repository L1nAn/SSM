package com.mazhiwei.mybatisTest;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mazhiwei.mybatis.mapper.BrandMapper;
import com.mazhiwei.mybatis.pojo.Brand;
import com.mazhiwei.mybatis.pojo.BrandExample;
import com.mazhiwei.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 马治伟
 * @version 1.0
 */
public class testMBG {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectByExample(null);
        for (Brand brand : brands) {
            System.out.println(brand);
        }
    }

    @Test
    public void testS() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        BrandExample brandExample = new BrandExample();
        brandExample.createCriteria().andBrandNameEqualTo("华为").andOrderedEqualTo(100);
        brandExample.or().andStatusEqualTo(1);
        List<Brand> brands = mapper.selectByExample(brandExample);
        for (Brand brand : brands) {
            System.out.println(brand);
        }
        sqlSession.close();
    }

    /**
     * 测试修改功能(普通修改）
     */
    @Test
    public void update() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = new Brand(4, "马治伟", "林安", 1, "林安就是马治伟", 1);
        BrandExample brandExample = new BrandExample();
        brandExample.createCriteria().andIdEqualTo(4);
        int i = mapper.updateByExample(brand, brandExample);
        sqlSession.commit();
        sqlSession.close();
        System.out.println();
    }

    /**
     * 条件修改
     */
    @Test
    public void update1() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = new Brand(null, "马治伟", null, 1, "林安就是马治伟", null);
        BrandExample brandExample = new BrandExample();
        brandExample.createCriteria().andIdEqualTo(4);
        int i = mapper.updateByExampleSelective(brand, brandExample);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(i);
    }

    /**
     * 分页功能的使用
     */
    @Test
    public void testPage() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Page<Object> page = PageHelper.startPage(1, 2);
        List<Brand> brands = mapper.selectByExample(null);
        PageInfo<Brand> pageInfo = new PageInfo(brands, 5);
        for (Brand brand : brands) {
            System.out.println(brand);
        }
        System.out.println(pageInfo);

    }
}
