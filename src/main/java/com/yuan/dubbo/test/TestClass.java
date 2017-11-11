package com.yuan.dubbo.test;

import com.yuan.dubbo.facade.ITest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-context.xml"})
public class TestClass {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ITest iTest;

    @org.junit.Test
    public void test(){

        String result = iTest.sayHello("yuanqing");
        logger.info(result);
    }
}
