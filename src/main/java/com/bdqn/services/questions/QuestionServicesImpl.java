package com.bdqn.services.questions;

import com.bdqn.dao.questions.QuestionsMapper;
import com.bdqn.entity.Questions;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/13.
 */
@Service
public class QuestionServicesImpl implements QuestionServices {
    @Resource
    private QuestionsMapper questionsMapper;
    @Override
    public PageInfo<Questions> queryAllQuestions(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Questions> list=questionsMapper.queryAllQuestions();
        return new PageInfo<Questions>(list);
    }

    @Override
    public Integer addNewQuestion(Questions questions) {
        return questionsMapper.addNewQuestion(questions);
    }

    @Override
    public Integer updateQuestion(Questions questions) {
        return questionsMapper.updateQuestion(questions);
    }

    @Override
    public PageInfo<Questions> queryQuestionByUserId(Integer userId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Questions> list=questionsMapper.queryQuestionByUserId(userId);
        return new PageInfo<Questions>(list);
    }

    @Override
    public Integer deleteQuestionById(Integer id) {
        return questionsMapper.deleteQuestionById(id);
    }
}
