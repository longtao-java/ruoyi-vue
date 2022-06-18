package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 employeetrain
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class Employeetrain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 员工编号 */
    @Excel(name = "员工编号")
    private Long eid;

    /** 培训日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "培训日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date traindate;

    /** 培训内容 */
    @Excel(name = "培训内容")
    private String traincontent;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setEid(Long eid) 
    {
        this.eid = eid;
    }

    public Long getEid() 
    {
        return eid;
    }
    public void setTraindate(Date traindate) 
    {
        this.traindate = traindate;
    }

    public Date getTraindate() 
    {
        return traindate;
    }
    public void setTraincontent(String traincontent) 
    {
        this.traincontent = traincontent;
    }

    public String getTraincontent() 
    {
        return traincontent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("eid", getEid())
            .append("traindate", getTraindate())
            .append("traincontent", getTraincontent())
            .append("remark", getRemark())
            .toString();
    }
}
