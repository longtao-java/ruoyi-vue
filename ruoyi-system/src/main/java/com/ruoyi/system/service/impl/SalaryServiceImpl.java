package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SalaryMapper;
import com.ruoyi.system.domain.Salary;
import com.ruoyi.system.service.ISalaryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class SalaryServiceImpl implements ISalaryService 
{
    @Autowired
    private SalaryMapper salaryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Salary selectSalaryById(Long id)
    {
        return salaryMapper.selectSalaryById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param salary 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Salary> selectSalaryList(Salary salary)
    {
        return salaryMapper.selectSalaryList(salary);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param salary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSalary(Salary salary)
    {
        return salaryMapper.insertSalary(salary);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param salary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSalary(Salary salary)
    {
        return salaryMapper.updateSalary(salary);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSalaryByIds(Long[] ids)
    {
        return salaryMapper.deleteSalaryByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSalaryById(Long id)
    {
        return salaryMapper.deleteSalaryById(id);
    }
}
