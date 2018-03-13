package com.bdqn.services.questions;

import com.bdqn.entity.Questions;
import com.bdqn.entity.User;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class QuestionServicesImplTest {
    @Autowired
    private QuestionServices questionServices;
    @Test
    public void queryAllQuestions() throws Exception {
        PageInfo<Questions> pageInfo=questionServices.queryAllQuestions(1,2);
        System.out.println(pageInfo);
        List<Questions> list=pageInfo.getList();
        if (list!=null) {
            for (Questions questions : list) {
                System.out.println(questions);
            }
        }
    }

    @Test
    public void addNewQuestion() throws Exception {
        User user=new User();
        user.setId(1);
        int n=questionServices.addNewQuestion(new Questions(0,"傻逼是怎么炼成的","真的不知道那个人怎么那么傻逼,想知道傻逼社怎么炼成的",10,null,user));
        System.out.println(n);
    }

    @Test
    public void updateQuestion() throws Exception {
        int n=questionServices.updateQuestion(new Questions(2,null,null,3,new Date(),null));
        System.out.println(n);
    }

    @Test
    public void queryQuestionByUserId() throws Exception {
        PageInfo<Questions> pageInfo=questionServices.queryQuestionByUserId(1,1,1);
        System.out.println(pageInfo);
        List<Questions> list=pageInfo.getList();
        if (list!=null) {
            for (Questions q : list) {
                System.out.println(q);
            }
        }
    }

    @Test
    public void deleteQuestionById() throws Exception {
        int n=questionServices.deleteQuestionById(7);
        System.out.println(n);
    }

}