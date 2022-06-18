package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EmployeeecMapper;
import com.ruoyi.system.domain.Employeeec;
import com.ruoyi.system.service.IEmployeeecService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class EmployeeecServiceImpl implements IEmployeeecService 
{
    @Autowired
    private EmployeeecMapper employeeecMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Employeeec selectEmployeeecById(Long id)
    {
        return employeeecMapper.selectEmployeeecById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param employeeec 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Employeeec> selectEmployeeecList(Employeeec employeeec)
    {
        return employeeecMapper.selectEmployeeecList(employeeec);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param employeeec 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEmployeeec(Employeeec employeeec)
    {
        return employeeecMapper.insertEmployeeec(employeeec);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param employeeec 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEmployeeec(Employeeec employeeec)
    {
        return employeeecMapper.updateEmployeeec(employeeec);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeecByIds(Long[] ids)
    {
        return employeeecMapper.deleteEmployeeecByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeecById(Long id)
    {
        return employeeecMapper.deleteEmployeeecById(id);
    }
}
