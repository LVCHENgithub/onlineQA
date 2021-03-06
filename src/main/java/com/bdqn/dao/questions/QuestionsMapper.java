package com.bdqn.dao.questions;

import com.bdqn.entity.Questions;

import java.util.List;

/**
 * Created by Administrator on 2018/3/12.
 */
public interface QuestionsMapper {
    public List<Questions> queryAllQuestions();
    public Integer addNewQuestion(Questions questions);
    public Integer updateQuestion(Questions questions);
    public List<Questions> queryQuestionByUserId(Integer userId);
    public Integer deleteQuestionById(Integer id);
}
