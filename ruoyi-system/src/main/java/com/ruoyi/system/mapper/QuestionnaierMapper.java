package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Questionnaier;

/**
 * 存储调查问卷数据Mapper接口
 *
 * @author ruoyi
 * @date 2024-10-08
 */
public interface QuestionnaierMapper
{
    /**
     * 查询存储调查问卷数据
     *
     * @param id 存储调查问卷数据主键
     * @return 存储调查问卷数据
     */
    public Questionnaier selectQuestionnaierById(Long id);

    /**
     * 查询存储调查问卷数据列表
     *
     * @param questionnaier 存储调查问卷数据
     * @return 存储调查问卷数据集合
     */
    public List<Questionnaier> selectQuestionnaierList(Questionnaier questionnaier);

    /**
     * 新增存储调查问卷数据
     *
     * @param questionnaier 存储调查问卷数据
     * @return 结果
     */
    public int insertQuestionnaier(Questionnaier questionnaier);

    /**
     * 修改存储调查问卷数据
     *
     * @param questionnaier 存储调查问卷数据
     * @return 结果
     */
    public int updateQuestionnaier(Questionnaier questionnaier);

    /**
     * 删除存储调查问卷数据
     *
     * @param id 存储调查问卷数据主键
     * @return 结果
     */
    public int deleteQuestionnaierById(Long id);

    /**
     * 批量删除存储调查问卷数据
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteQuestionnaierByIds(Long[] ids);
}
