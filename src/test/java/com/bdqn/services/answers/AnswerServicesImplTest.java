package com.bdqn.services.answers;

import com.bdqn.entity.Answers;
import com.bdqn.entity.Questions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AnswerServicesImplTest {
    @Resource
    private AnswerServices answerServices;
    @Test
    public void queryAnswerByQuestionId() throws Exception {
        List<Answers> list=answerServices.queryAnswerByQuestionId(1);
        for (Answers answers : list) {
            System.out.println(answers);
        }
    }

    @Test
    public void addAnswer() throws Exception {
        Questions questions=new Questions();
        questions.setId(1);
        int n=answerServices.addAnswer(new Answers(0,"先建库,再建表,其次是填写数据",null,questions));
        System.out.println(n);
    }

}