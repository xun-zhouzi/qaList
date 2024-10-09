package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.QuestionnaierMapper;
import com.ruoyi.system.domain.Questionnaier;
import com.ruoyi.system.service.IQuestionnaierService;

/**
 * 存储调查问卷数据Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-08
 */
@Service
public class QuestionnaierServiceImpl implements IQuestionnaierService
{
    @Autowired
    private QuestionnaierMapper questionnaierMapper;

    /**
     * 查询存储调查问卷数据
     *
     * @param id 存储调查问卷数据主键
     * @return 存储调查问卷数据
     */
    @Override
    public Questionnaier selectQuestionnaierById(Long id)
    {
        return questionnaierMapper.selectQuestionnaierById(id);
    }

    /**
     * 查询存储调查问卷数据列表
     *
     * @param questionnaier 存储调查问卷数据
     * @return 存储调查问卷数据
     */
    @Override
    public List<Questionnaier> selectQuestionnaierList(Questionnaier questionnaier)
    {
        return questionnaierMapper.selectQuestionnaierList(questionnaier);
    }

    /**
     * 新增存储调查问卷数据
     *
     * @param questionnaier 存储调查问卷数据
     * @return 结果
     */
    @Override
    public int insertQuestionnaier(Questionnaier questionnaier)
    {
        questionnaier.setCreateTime(DateUtils.getNowDate());
        return questionnaierMapper.insertQuestionnaier(questionnaier);
    }

    /**
     * 修改存储调查问卷数据
     *
     * @param questionnaier 存储调查问卷数据
     * @return 结果
     */
    @Override
    public int updateQuestionnaier(Questionnaier questionnaier)
    {
        return questionnaierMapper.updateQuestionnaier(questionnaier);
    }

    /**
     * 批量删除存储调查问卷数据
     *
     * @param ids 需要删除的存储调查问卷数据主键
     * @return 结果
     */
    @Override
    public int deleteQuestionnaierByIds(Long[] ids)
    {
        return questionnaierMapper.deleteQuestionnaierByIds(ids);
    }

    /**
     * 删除存储调查问卷数据信息
     *
     * @param id 存储调查问卷数据主键
     * @return 结果
     */
    @Override
    public int deleteQuestionnaierById(Long id)
    {
        return questionnaierMapper.deleteQuestionnaierById(id);
    }
}
