package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sysmsg
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class Sysmsg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 消息id */
    @Excel(name = "消息id")
    private Long mid;

    /** 0表示群发消息 */
    @Excel(name = "0表示群发消息")
    private Long type;

    /** 这条消息是给谁的 */
    @Excel(name = "这条消息是给谁的")
    private Long hrid;

    /** 0 未读 1 已读 */
    @Excel(name = "0 未读 1 已读")
    private Long state;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setHrid(Long hrid) 
    {
        this.hrid = hrid;
    }

    public Long getHrid() 
    {
        return hrid;
    }
    public void setState(Long state) 
    {
        this.state = state;
    }

    public Long getState() 
    {
        return state;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mid", getMid())
            .append("type", getType())
            .append("hrid", getHrid())
            .append("state", getState())
            .toString();
    }
}
