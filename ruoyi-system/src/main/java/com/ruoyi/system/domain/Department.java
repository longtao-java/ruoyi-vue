package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 department
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class Department extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long parentid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String deppath;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer enabled;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer isparent;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setParentid(Long parentid) 
    {
        this.parentid = parentid;
    }

    public Long getParentid() 
    {
        return parentid;
    }
    public void setDeppath(String deppath) 
    {
        this.deppath = deppath;
    }

    public String getDeppath() 
    {
        return deppath;
    }
    public void setEnabled(Integer enabled) 
    {
        this.enabled = enabled;
    }

    public Integer getEnabled() 
    {
        return enabled;
    }
    public void setIsparent(Integer isparent) 
    {
        this.isparent = isparent;
    }

    public Integer getIsparent() 
    {
        return isparent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("parentid", getParentid())
            .append("deppath", getDeppath())
            .append("enabled", getEnabled())
            .append("isparent", getIsparent())
            .toString();
    }
}
