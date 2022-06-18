package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 menu
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class Menu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String path;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String component;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String iconcls;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer keepalive;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer requireauth;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long parentid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer enabled;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setPath(String path) 
    {
        this.path = path;
    }

    public String getPath() 
    {
        return path;
    }
    public void setComponent(String component) 
    {
        this.component = component;
    }

    public String getComponent() 
    {
        return component;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setIconcls(String iconcls) 
    {
        this.iconcls = iconcls;
    }

    public String getIconcls() 
    {
        return iconcls;
    }
    public void setKeepalive(Integer keepalive) 
    {
        this.keepalive = keepalive;
    }

    public Integer getKeepalive() 
    {
        return keepalive;
    }
    public void setRequireauth(Integer requireauth) 
    {
        this.requireauth = requireauth;
    }

    public Integer getRequireauth() 
    {
        return requireauth;
    }
    public void setParentid(Long parentid) 
    {
        this.parentid = parentid;
    }

    public Long getParentid() 
    {
        return parentid;
    }
    public void setEnabled(Integer enabled) 
    {
        this.enabled = enabled;
    }

    public Integer getEnabled() 
    {
        return enabled;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("url", getUrl())
            .append("path", getPath())
            .append("component", getComponent())
            .append("name", getName())
            .append("iconcls", getIconcls())
            .append("keepalive", getKeepalive())
            .append("requireauth", getRequireauth())
            .append("parentid", getParentid())
            .append("enabled", getEnabled())
            .toString();
    }
}
