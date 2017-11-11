package com.yuan.dubbo.test;

import com.yuan.dubbo.facade.ITest;
import com.yuan.dubbo.facade.UserFacade;
import com.yuan.dubbo.facade.entity.UserInfo;
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

    @Autowired
    private UserFacade userFacade;

    @org.junit.Test
    public void test(){

        String result = iTest.sayHello("yuanqing");
        logger.info(result);
    }

    @org.junit.Test
    public void getUser(){

        UserInfo userInfo = userFacade.findById("1");
        logger.info("getUser userInfo={}",userInfo);
    }
}
