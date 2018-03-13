package com.bdqn.services.answers;

import com.bdqn.dao.answers.AnswersMapper;
import com.bdqn.entity.Answers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/13.
 */
@Service
public class AnswerServicesImpl implements AnswerServices {
    @Resource
    private AnswersMapper answersMapper;
    @Override
    public List<Answers> queryAnswerByQuestionId(Integer questionId) {
        return answersMapper.queryAnswerByQuestionId(questionId);
    }

    @Override
    public Integer addAnswer(Answers answers) {
        return answersMapper.addAnswer(answers);
    }
}
