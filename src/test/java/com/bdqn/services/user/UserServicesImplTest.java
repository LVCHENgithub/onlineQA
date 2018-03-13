package com.bdqn.services.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2018/3/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServicesImplTest {
    @Autowired
    private UserServices  userServices;
    @Test
    public void queryUserByUserName() throws Exception {
        System.out.println(userServices.queryUserByUserName("admin"));
    }

}