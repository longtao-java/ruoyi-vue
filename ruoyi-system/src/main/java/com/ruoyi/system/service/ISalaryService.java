package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Salary;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface ISalaryService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Salary selectSalaryById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param salary 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Salary> selectSalaryList(Salary salary);

    /**
     * 新增【请填写功能名称】
     * 
     * @param salary 【请填写功能名称】
     * @return 结果
     */
    public int insertSalary(Salary salary);

    /**
     * 修改【请填写功能名称】
     * 
     * @param salary 【请填写功能名称】
     * @return 结果
     */
    public int updateSalary(Salary salary);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSalaryByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSalaryById(Long id);
}
