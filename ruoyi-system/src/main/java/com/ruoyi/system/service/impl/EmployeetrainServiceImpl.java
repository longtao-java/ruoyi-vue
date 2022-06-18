package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EmployeetrainMapper;
import com.ruoyi.system.domain.Employeetrain;
import com.ruoyi.system.service.IEmployeetrainService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class EmployeetrainServiceImpl implements IEmployeetrainService 
{
    @Autowired
    private EmployeetrainMapper employeetrainMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Employeetrain selectEmployeetrainById(Long id)
    {
        return employeetrainMapper.selectEmployeetrainById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param employeetrain 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Employeetrain> selectEmployeetrainList(Employeetrain employeetrain)
    {
        return employeetrainMapper.selectEmployeetrainList(employeetrain);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param employeetrain 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEmployeetrain(Employeetrain employeetrain)
    {
        return employeetrainMapper.insertEmployeetrain(employeetrain);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param employeetrain 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEmployeetrain(Employeetrain employeetrain)
    {
        return employeetrainMapper.updateEmployeetrain(employeetrain);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeetrainByIds(Long[] ids)
    {
        return employeetrainMapper.deleteEmployeetrainByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeetrainById(Long id)
    {
        return employeetrainMapper.deleteEmployeetrainById(id);
    }
}
