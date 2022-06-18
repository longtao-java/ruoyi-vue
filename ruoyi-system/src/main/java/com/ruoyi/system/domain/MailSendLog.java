package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 mail_send_log
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class MailSendLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String msgid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long empid;

    /** 0发送中，1发送成功，2发送失败 */
    @Excel(name = "0发送中，1发送成功，2发送失败")
    private Long status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String routekey;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String exchange;

    /** 重试次数 */
    @Excel(name = "重试次数")
    private Long count;

    /** 第一次重试时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "第一次重试时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date trytime;

    public void setMsgid(String msgid) 
    {
        this.msgid = msgid;
    }

    public String getMsgid() 
    {
        return msgid;
    }
    public void setEmpid(Long empid) 
    {
        this.empid = empid;
    }

    public Long getEmpid() 
    {
        return empid;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setRoutekey(String routekey) 
    {
        this.routekey = routekey;
    }

    public String getRoutekey() 
    {
        return routekey;
    }
    public void setExchange(String exchange) 
    {
        this.exchange = exchange;
    }

    public String getExchange() 
    {
        return exchange;
    }
    public void setCount(Long count) 
    {
        this.count = count;
    }

    public Long getCount() 
    {
        return count;
    }
    public void setTrytime(Date trytime) 
    {
        this.trytime = trytime;
    }

    public Date getTrytime() 
    {
        return trytime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("msgid", getMsgid())
            .append("empid", getEmpid())
            .append("status", getStatus())
            .append("routekey", getRoutekey())
            .append("exchange", getExchange())
            .append("count", getCount())
            .append("trytime", getTrytime())
            .toString();
    }
}
