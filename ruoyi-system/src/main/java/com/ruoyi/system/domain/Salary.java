package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 salary
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class Salary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 基本工资 */
    @Excel(name = "基本工资")
    private Long basicsalary;

    /** 奖金 */
    @Excel(name = "奖金")
    private Long bonus;

    /** 午餐补助 */
    @Excel(name = "午餐补助")
    private Long lunchsalary;

    /** 交通补助 */
    @Excel(name = "交通补助")
    private Long trafficsalary;

    /** 应发工资 */
    @Excel(name = "应发工资")
    private Long allsalary;

    /** 养老金基数 */
    @Excel(name = "养老金基数")
    private Long pensionbase;

    /** 养老金比率 */
    @Excel(name = "养老金比率")
    private Long pensionper;

    /** 启用时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "启用时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdate;

    /** 医疗基数 */
    @Excel(name = "医疗基数")
    private Long medicalbase;

    /** 医疗保险比率 */
    @Excel(name = "医疗保险比率")
    private Long medicalper;

    /** 公积金基数 */
    @Excel(name = "公积金基数")
    private Long accumulationfundbase;

    /** 公积金比率 */
    @Excel(name = "公积金比率")
    private Long accumulationfundper;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBasicsalary(Long basicsalary) 
    {
        this.basicsalary = basicsalary;
    }

    public Long getBasicsalary() 
    {
        return basicsalary;
    }
    public void setBonus(Long bonus) 
    {
        this.bonus = bonus;
    }

    public Long getBonus() 
    {
        return bonus;
    }
    public void setLunchsalary(Long lunchsalary) 
    {
        this.lunchsalary = lunchsalary;
    }

    public Long getLunchsalary() 
    {
        return lunchsalary;
    }
    public void setTrafficsalary(Long trafficsalary) 
    {
        this.trafficsalary = trafficsalary;
    }

    public Long getTrafficsalary() 
    {
        return trafficsalary;
    }
    public void setAllsalary(Long allsalary) 
    {
        this.allsalary = allsalary;
    }

    public Long getAllsalary() 
    {
        return allsalary;
    }
    public void setPensionbase(Long pensionbase) 
    {
        this.pensionbase = pensionbase;
    }

    public Long getPensionbase() 
    {
        return pensionbase;
    }
    public void setPensionper(Long pensionper) 
    {
        this.pensionper = pensionper;
    }

    public Long getPensionper() 
    {
        return pensionper;
    }
    public void setCreatedate(Date createdate) 
    {
        this.createdate = createdate;
    }

    public Date getCreatedate() 
    {
        return createdate;
    }
    public void setMedicalbase(Long medicalbase) 
    {
        this.medicalbase = medicalbase;
    }

    public Long getMedicalbase() 
    {
        return medicalbase;
    }
    public void setMedicalper(Long medicalper) 
    {
        this.medicalper = medicalper;
    }

    public Long getMedicalper() 
    {
        return medicalper;
    }
    public void setAccumulationfundbase(Long accumulationfundbase) 
    {
        this.accumulationfundbase = accumulationfundbase;
    }

    public Long getAccumulationfundbase() 
    {
        return accumulationfundbase;
    }
    public void setAccumulationfundper(Long accumulationfundper) 
    {
        this.accumulationfundper = accumulationfundper;
    }

    public Long getAccumulationfundper() 
    {
        return accumulationfundper;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("basicsalary", getBasicsalary())
            .append("bonus", getBonus())
            .append("lunchsalary", getLunchsalary())
            .append("trafficsalary", getTrafficsalary())
            .append("allsalary", getAllsalary())
            .append("pensionbase", getPensionbase())
            .append("pensionper", getPensionper())
            .append("createdate", getCreatedate())
            .append("medicalbase", getMedicalbase())
            .append("medicalper", getMedicalper())
            .append("accumulationfundbase", getAccumulationfundbase())
            .append("accumulationfundper", getAccumulationfundper())
            .append("name", getName())
            .toString();
    }
}
