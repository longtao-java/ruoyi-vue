package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 employee
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class Employee extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 员工编号 */
    private Long id;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String name;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idcard;

    /** 婚姻状况 */
    @Excel(name = "婚姻状况")
    private String wedlock;

    /** 民族 */
    @Excel(name = "民族")
    private Integer nationid;

    /** 籍贯 */
    @Excel(name = "籍贯")
    private String nativeplace;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private Integer politicid;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phone;

    /** 联系地址 */
    @Excel(name = "联系地址")
    private String address;

    /** 所属部门 */
    @Excel(name = "所属部门")
    private Long departmentid;

    /** 职称ID */
    @Excel(name = "职称ID")
    private Long joblevelid;

    /** 职位ID */
    @Excel(name = "职位ID")
    private Long posid;

    /** 聘用形式 */
    @Excel(name = "聘用形式")
    private String engageform;

    /** 最高学历 */
    @Excel(name = "最高学历")
    private String tiptopdegree;

    /** 所属专业 */
    @Excel(name = "所属专业")
    private String specialty;

    /** 毕业院校 */
    @Excel(name = "毕业院校")
    private String school;

    /** 入职日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date begindate;

    /** 在职状态 */
    @Excel(name = "在职状态")
    private String workstate;

    /** 工号 */
    @Excel(name = "工号")
    private String workid;

    /** 合同期限 */
    @Excel(name = "合同期限")
    private Long contractterm;

    /** 转正日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "转正日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date conversiontime;

    /** 离职日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "离职日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date notworkdate;

    /** 合同起始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "合同起始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date begincontract;

    /** 合同终止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "合同终止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endcontract;

    /** 工龄 */
    @Excel(name = "工龄")
    private Long workage;

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
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setIdcard(String idcard) 
    {
        this.idcard = idcard;
    }

    public String getIdcard() 
    {
        return idcard;
    }
    public void setWedlock(String wedlock) 
    {
        this.wedlock = wedlock;
    }

    public String getWedlock() 
    {
        return wedlock;
    }
    public void setNationid(Integer nationid) 
    {
        this.nationid = nationid;
    }

    public Integer getNationid() 
    {
        return nationid;
    }
    public void setNativeplace(String nativeplace) 
    {
        this.nativeplace = nativeplace;
    }

    public String getNativeplace() 
    {
        return nativeplace;
    }
    public void setPoliticid(Integer politicid) 
    {
        this.politicid = politicid;
    }

    public Integer getPoliticid() 
    {
        return politicid;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setDepartmentid(Long departmentid) 
    {
        this.departmentid = departmentid;
    }

    public Long getDepartmentid() 
    {
        return departmentid;
    }
    public void setJoblevelid(Long joblevelid) 
    {
        this.joblevelid = joblevelid;
    }

    public Long getJoblevelid() 
    {
        return joblevelid;
    }
    public void setPosid(Long posid) 
    {
        this.posid = posid;
    }

    public Long getPosid() 
    {
        return posid;
    }
    public void setEngageform(String engageform) 
    {
        this.engageform = engageform;
    }

    public String getEngageform() 
    {
        return engageform;
    }
    public void setTiptopdegree(String tiptopdegree) 
    {
        this.tiptopdegree = tiptopdegree;
    }

    public String getTiptopdegree() 
    {
        return tiptopdegree;
    }
    public void setSpecialty(String specialty) 
    {
        this.specialty = specialty;
    }

    public String getSpecialty() 
    {
        return specialty;
    }
    public void setSchool(String school) 
    {
        this.school = school;
    }

    public String getSchool() 
    {
        return school;
    }
    public void setBegindate(Date begindate) 
    {
        this.begindate = begindate;
    }

    public Date getBegindate() 
    {
        return begindate;
    }
    public void setWorkstate(String workstate) 
    {
        this.workstate = workstate;
    }

    public String getWorkstate() 
    {
        return workstate;
    }
    public void setWorkid(String workid) 
    {
        this.workid = workid;
    }

    public String getWorkid() 
    {
        return workid;
    }
    public void setContractterm(Long contractterm) 
    {
        this.contractterm = contractterm;
    }

    public Long getContractterm() 
    {
        return contractterm;
    }
    public void setConversiontime(Date conversiontime) 
    {
        this.conversiontime = conversiontime;
    }

    public Date getConversiontime() 
    {
        return conversiontime;
    }
    public void setNotworkdate(Date notworkdate) 
    {
        this.notworkdate = notworkdate;
    }

    public Date getNotworkdate() 
    {
        return notworkdate;
    }
    public void setBegincontract(Date begincontract) 
    {
        this.begincontract = begincontract;
    }

    public Date getBegincontract() 
    {
        return begincontract;
    }
    public void setEndcontract(Date endcontract) 
    {
        this.endcontract = endcontract;
    }

    public Date getEndcontract() 
    {
        return endcontract;
    }
    public void setWorkage(Long workage) 
    {
        this.workage = workage;
    }

    public Long getWorkage() 
    {
        return workage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("gender", getGender())
            .append("birthday", getBirthday())
            .append("idcard", getIdcard())
            .append("wedlock", getWedlock())
            .append("nationid", getNationid())
            .append("nativeplace", getNativeplace())
            .append("politicid", getPoliticid())
            .append("email", getEmail())
            .append("phone", getPhone())
            .append("address", getAddress())
            .append("departmentid", getDepartmentid())
            .append("joblevelid", getJoblevelid())
            .append("posid", getPosid())
            .append("engageform", getEngageform())
            .append("tiptopdegree", getTiptopdegree())
            .append("specialty", getSpecialty())
            .append("school", getSchool())
            .append("begindate", getBegindate())
            .append("workstate", getWorkstate())
            .append("workid", getWorkid())
            .append("contractterm", getContractterm())
            .append("conversiontime", getConversiontime())
            .append("notworkdate", getNotworkdate())
            .append("begincontract", getBegincontract())
            .append("endcontract", getEndcontract())
            .append("workage", getWorkage())
            .toString();
    }
}
