package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 employeeec
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class Employeeec extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 员工编号 */
    @Excel(name = "员工编号")
    private Long eid;

    /** 奖罚日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "奖罚日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ecdate;

    /** 奖罚原因 */
    @Excel(name = "奖罚原因")
    private String ecreason;

    /** 奖罚分 */
    @Excel(name = "奖罚分")
    private Long ecpoint;

    /** 奖罚类别，0：奖，1：罚 */
    @Excel(name = "奖罚类别，0：奖，1：罚")
    private Long ectype;

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
    public void setEcdate(Date ecdate) 
    {
        this.ecdate = ecdate;
    }

    public Date getEcdate() 
    {
        return ecdate;
    }
    public void setEcreason(String ecreason) 
    {
        this.ecreason = ecreason;
    }

    public String getEcreason() 
    {
        return ecreason;
    }
    public void setEcpoint(Long ecpoint) 
    {
        this.ecpoint = ecpoint;
    }

    public Long getEcpoint() 
    {
        return ecpoint;
    }
    public void setEctype(Long ectype) 
    {
        this.ectype = ectype;
    }

    public Long getEctype() 
    {
        return ectype;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("eid", getEid())
            .append("ecdate", getEcdate())
            .append("ecreason", getEcreason())
            .append("ecpoint", getEcpoint())
            .append("ectype", getEctype())
            .append("remark", getRemark())
            .toString();
    }
}
