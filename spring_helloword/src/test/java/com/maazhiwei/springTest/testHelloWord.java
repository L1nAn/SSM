package com.maazhiwei.springTest;

import com.mazhiwei.spring.HelloWord;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 马治伟
 * @version 1.0
 */
public class testHelloWord {

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWord helloWord = (HelloWord) ac.getBean("helloword");
        helloWord.sayHello();
    }
}
