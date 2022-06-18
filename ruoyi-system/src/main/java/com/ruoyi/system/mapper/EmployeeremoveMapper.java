package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Employeeremove;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface EmployeeremoveMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Employeeremove selectEmployeeremoveById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param employeeremove 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Employeeremove> selectEmployeeremoveList(Employeeremove employeeremove);

    /**
     * 新增【请填写功能名称】
     * 
     * @param employeeremove 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployeeremove(Employeeremove employeeremove);

    /**
     * 修改【请填写功能名称】
     * 
     * @param employeeremove 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployeeremove(Employeeremove employeeremove);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeeremoveById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeeremoveByIds(Long[] ids);
}
