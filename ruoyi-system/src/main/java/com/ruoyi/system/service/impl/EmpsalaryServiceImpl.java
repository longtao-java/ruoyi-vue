package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EmpsalaryMapper;
import com.ruoyi.system.domain.Empsalary;
import com.ruoyi.system.service.IEmpsalaryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class EmpsalaryServiceImpl implements IEmpsalaryService 
{
    @Autowired
    private EmpsalaryMapper empsalaryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Empsalary selectEmpsalaryById(Long id)
    {
        return empsalaryMapper.selectEmpsalaryById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param empsalary 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Empsalary> selectEmpsalaryList(Empsalary empsalary)
    {
        return empsalaryMapper.selectEmpsalaryList(empsalary);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param empsalary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEmpsalary(Empsalary empsalary)
    {
        return empsalaryMapper.insertEmpsalary(empsalary);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param empsalary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEmpsalary(Empsalary empsalary)
    {
        return empsalaryMapper.updateEmpsalary(empsalary);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmpsalaryByIds(Long[] ids)
    {
        return empsalaryMapper.deleteEmpsalaryByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmpsalaryById(Long id)
    {
        return empsalaryMapper.deleteEmpsalaryById(id);
    }
}
