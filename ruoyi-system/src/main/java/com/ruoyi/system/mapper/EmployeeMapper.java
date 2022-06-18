package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Employee;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface EmployeeMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Employee selectEmployeeById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param employee 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Employee> selectEmployeeList(Employee employee);

    /**
     * 新增【请填写功能名称】
     * 
     * @param employee 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployee(Employee employee);

    /**
     * 修改【请填写功能名称】
     * 
     * @param employee 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployee(Employee employee);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeeById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeeByIds(Long[] ids);
}
