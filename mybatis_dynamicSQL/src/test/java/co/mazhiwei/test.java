package co.mazhiwei;

import com.mazhiwei.mapper.BrandMapper;
import com.mazhiwei.pojo.Brand;
import com.mazhiwei.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 马治伟
 * @version 1.0
 */
public class test {
   @Test
   public void selectById() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
      Brand brand = new Brand();
//      String companyName = "华为";
//      companyName = "%" + companyName + "%";
//      brand.setBrandName("华为");
//      brand.setCompanyName(companyName);

      List<Brand> list = mapper.selectBy(brand);
      for(Brand brand1: list) {
         System.out.println(brand1);
      }
   }
}
