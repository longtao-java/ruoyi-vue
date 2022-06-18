package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 oplog
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class Oplog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 添加日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "添加日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date adddate;

    /** 操作内容 */
    @Excel(name = "操作内容")
    private String operate;

    /** 操作员ID */
    @Excel(name = "操作员ID")
    private Long hrid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAdddate(Date adddate) 
    {
        this.adddate = adddate;
    }

    public Date getAdddate() 
    {
        return adddate;
    }
    public void setOperate(String operate) 
    {
        this.operate = operate;
    }

    public String getOperate() 
    {
        return operate;
    }
    public void setHrid(Long hrid) 
    {
        this.hrid = hrid;
    }

    public Long getHrid() 
    {
        return hrid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("adddate", getAdddate())
            .append("operate", getOperate())
            .append("hrid", getHrid())
            .toString();
    }
}
