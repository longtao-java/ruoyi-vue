package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 hr
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public class Hr extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** hrID */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phone;

    /** 住宅电话 */
    @Excel(name = "住宅电话")
    private String telephone;

    /** 联系地址 */
    @Excel(name = "联系地址")
    private String address;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer enabled;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userface;

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
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setTelephone(String telephone) 
    {
        this.telephone = telephone;
    }

    public String getTelephone() 
    {
        return telephone;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setEnabled(Integer enabled) 
    {
        this.enabled = enabled;
    }

    public Integer getEnabled() 
    {
        return enabled;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setUserface(String userface) 
    {
        this.userface = userface;
    }

    public String getUserface() 
    {
        return userface;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("phone", getPhone())
            .append("telephone", getTelephone())
            .append("address", getAddress())
            .append("enabled", getEnabled())
            .append("username", getUsername())
            .append("password", getPassword())
            .append("userface", getUserface())
            .append("remark", getRemark())
            .toString();
    }
}
