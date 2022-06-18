package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Department;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface IDepartmentService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Department selectDepartmentById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param department 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Department> selectDepartmentList(Department department);

    /**
     * 新增【请填写功能名称】
     * 
     * @param department 【请填写功能名称】
     * @return 结果
     */
    public int insertDepartment(Department department);

    /**
     * 修改【请填写功能名称】
     * 
     * @param department 【请填写功能名称】
     * @return 结果
     */
    public int updateDepartment(Department department);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteDepartmentByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDepartmentById(Long id);
}
