package com.bdqn.services.answers;

import com.bdqn.entity.Answers;

import java.util.List;

/**
 * Created by Administrator on 2018/3/13.
 */
public interface AnswerServices {
    public List<Answers> queryAnswerByQuestionId(Integer questionId);
    public Integer addAnswer(Answers answers);
}
