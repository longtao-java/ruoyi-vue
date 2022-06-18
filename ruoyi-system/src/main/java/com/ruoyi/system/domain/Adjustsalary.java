package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 adjustsalary
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class Adjustsalary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long eid;

    /** 调薪日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "调薪日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date asdate;

    /** 调前薪资 */
    @Excel(name = "调前薪资")
    private Long beforesalary;

    /** 调后薪资 */
    @Excel(name = "调后薪资")
    private Long aftersalary;

    /** 调薪原因 */
    @Excel(name = "调薪原因")
    private String reason;

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
    public void setAsdate(Date asdate) 
    {
        this.asdate = asdate;
    }

    public Date getAsdate() 
    {
        return asdate;
    }
    public void setBeforesalary(Long beforesalary) 
    {
        this.beforesalary = beforesalary;
    }

    public Long getBeforesalary() 
    {
        return beforesalary;
    }
    public void setAftersalary(Long aftersalary) 
    {
        this.aftersalary = aftersalary;
    }

    public Long getAftersalary() 
    {
        return aftersalary;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("eid", getEid())
            .append("asdate", getAsdate())
            .append("beforesalary", getBeforesalary())
            .append("aftersalary", getAftersalary())
            .append("reason", getReason())
            .append("remark", getRemark())
            .toString();
    }
}
