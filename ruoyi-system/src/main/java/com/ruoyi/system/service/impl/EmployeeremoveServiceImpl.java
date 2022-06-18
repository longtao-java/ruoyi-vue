package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EmployeeremoveMapper;
import com.ruoyi.system.domain.Employeeremove;
import com.ruoyi.system.service.IEmployeeremoveService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class EmployeeremoveServiceImpl implements IEmployeeremoveService 
{
    @Autowired
    private EmployeeremoveMapper employeeremoveMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Employeeremove selectEmployeeremoveById(Long id)
    {
        return employeeremoveMapper.selectEmployeeremoveById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param employeeremove 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Employeeremove> selectEmployeeremoveList(Employeeremove employeeremove)
    {
        return employeeremoveMapper.selectEmployeeremoveList(employeeremove);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param employeeremove 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEmployeeremove(Employeeremove employeeremove)
    {
        return employeeremoveMapper.insertEmployeeremove(employeeremove);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param employeeremove 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEmployeeremove(Employeeremove employeeremove)
    {
        return employeeremoveMapper.updateEmployeeremove(employeeremove);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeremoveByIds(Long[] ids)
    {
        return employeeremoveMapper.deleteEmployeeremoveByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeremoveById(Long id)
    {
        return employeeremoveMapper.deleteEmployeeremoveById(id);
    }
}
