package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Employeeec;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface IEmployeeecService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Employeeec selectEmployeeecById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param employeeec 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Employeeec> selectEmployeeecList(Employeeec employeeec);

    /**
     * 新增【请填写功能名称】
     * 
     * @param employeeec 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployeeec(Employeeec employeeec);

    /**
     * 修改【请填写功能名称】
     * 
     * @param employeeec 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployeeec(Employeeec employeeec);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteEmployeeecByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeeecById(Long id);
}
