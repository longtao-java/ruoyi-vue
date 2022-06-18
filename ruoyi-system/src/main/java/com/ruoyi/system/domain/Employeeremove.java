package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 employeeremove
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class Employeeremove extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long eid;

    /** 调动后部门 */
    @Excel(name = "调动后部门")
    private Long afterdepid;

    /** 调动后职位 */
    @Excel(name = "调动后职位")
    private Long afterjobid;

    /** 调动日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "调动日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date removedate;

    /** 调动原因 */
    @Excel(name = "调动原因")
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
    public void setAfterdepid(Long afterdepid) 
    {
        this.afterdepid = afterdepid;
    }

    public Long getAfterdepid() 
    {
        return afterdepid;
    }
    public void setAfterjobid(Long afterjobid) 
    {
        this.afterjobid = afterjobid;
    }

    public Long getAfterjobid() 
    {
        return afterjobid;
    }
    public void setRemovedate(Date removedate) 
    {
        this.removedate = removedate;
    }

    public Date getRemovedate() 
    {
        return removedate;
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
            .append("afterdepid", getAfterdepid())
            .append("afterjobid", getAfterjobid())
            .append("removedate", getRemovedate())
            .append("reason", getReason())
            .append("remark", getRemark())
            .toString();
    }
}
