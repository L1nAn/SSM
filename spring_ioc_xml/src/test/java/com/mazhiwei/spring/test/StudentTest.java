package com.mazhiwei.spring.test;

import com.mazhiwei.spring.pojo.Person;
import com.mazhiwei.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 马治伟
 * @version 1.0
 */
public class StudentTest {
   @Test
   public void test() {
      //获取IOC容器
      ApplicationContext ac = new ClassPathXmlApplicationContext("spring-student.xml");
      //获取bean
//      Student studentOne = (Student) ac.getBean("StudentOne");
//      Student bean = ac.getBean(Student.class);
      Person bean = ac.getBean(Person.class);
      System.out.println(bean);
//      System.out.println(studentOne);
   }
}
