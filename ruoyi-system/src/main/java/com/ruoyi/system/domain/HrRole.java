package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 hr_role
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class HrRole extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long hrid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long rid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setHrid(Long hrid) 
    {
        this.hrid = hrid;
    }

    public Long getHrid() 
    {
        return hrid;
    }
    public void setRid(Long rid) 
    {
        this.rid = rid;
    }

    public Long getRid() 
    {
        return rid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hrid", getHrid())
            .append("rid", getRid())
            .toString();
    }
}
