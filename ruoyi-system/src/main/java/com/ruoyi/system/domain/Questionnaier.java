package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 存储调查问卷数据对象 questionnaier
 *
 * @author ruoyi
 * @date 2024-10-08
 */
public class Questionnaier extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一id */
    private Long id;

    /** 问题 */
    @Excel(name = "问题")
    private String question;

    /** 回答 */
    @Excel(name = "回答")
    private String answer;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setQuestion(String question)
    {
        this.question = question;
    }

    public String getQuestion()
    {
        return question;
    }
    public void setAnswer(String answer)
    {
        this.answer = answer;
    }

    public String getAnswer()
    {
        return answer;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("question", getQuestion())
            .append("answer", getAnswer())
            .append("createTime", getCreateTime())
            .append("remark", getRemark())
            .toString();
    }
}
