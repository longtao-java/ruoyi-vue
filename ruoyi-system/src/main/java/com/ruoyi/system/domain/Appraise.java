package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 appraise
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class Appraise extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long eid;

    /** 考评日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "考评日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date appdate;

    /** 考评结果 */
    @Excel(name = "考评结果")
    private String appresult;

    /** 考评内容 */
    @Excel(name = "考评内容")
    private String appcontent;

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
    public void setAppdate(Date appdate) 
    {
        this.appdate = appdate;
    }

    public Date getAppdate() 
    {
        return appdate;
    }
    public void setAppresult(String appresult) 
    {
        this.appresult = appresult;
    }

    public String getAppresult() 
    {
        return appresult;
    }
    public void setAppcontent(String appcontent) 
    {
        this.appcontent = appcontent;
    }

    public String getAppcontent() 
    {
        return appcontent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("eid", getEid())
            .append("appdate", getAppdate())
            .append("appresult", getAppresult())
            .append("appcontent", getAppcontent())
            .append("remark", getRemark())
            .toString();
    }
}
