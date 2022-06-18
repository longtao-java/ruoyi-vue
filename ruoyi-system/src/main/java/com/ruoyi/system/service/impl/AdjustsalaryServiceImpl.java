package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AdjustsalaryMapper;
import com.ruoyi.system.domain.Adjustsalary;
import com.ruoyi.system.service.IAdjustsalaryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class AdjustsalaryServiceImpl implements IAdjustsalaryService 
{
    @Autowired
    private AdjustsalaryMapper adjustsalaryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Adjustsalary selectAdjustsalaryById(Long id)
    {
        return adjustsalaryMapper.selectAdjustsalaryById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param adjustsalary 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Adjustsalary> selectAdjustsalaryList(Adjustsalary adjustsalary)
    {
        return adjustsalaryMapper.selectAdjustsalaryList(adjustsalary);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param adjustsalary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAdjustsalary(Adjustsalary adjustsalary)
    {
        return adjustsalaryMapper.insertAdjustsalary(adjustsalary);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param adjustsalary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAdjustsalary(Adjustsalary adjustsalary)
    {
        return adjustsalaryMapper.updateAdjustsalary(adjustsalary);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAdjustsalaryByIds(Long[] ids)
    {
        return adjustsalaryMapper.deleteAdjustsalaryByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAdjustsalaryById(Long id)
    {
        return adjustsalaryMapper.deleteAdjustsalaryById(id);
    }
}
