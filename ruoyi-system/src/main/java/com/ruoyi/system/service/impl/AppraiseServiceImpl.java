package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AppraiseMapper;
import com.ruoyi.system.domain.Appraise;
import com.ruoyi.system.service.IAppraiseService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class AppraiseServiceImpl implements IAppraiseService 
{
    @Autowired
    private AppraiseMapper appraiseMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Appraise selectAppraiseById(Long id)
    {
        return appraiseMapper.selectAppraiseById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param appraise 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Appraise> selectAppraiseList(Appraise appraise)
    {
        return appraiseMapper.selectAppraiseList(appraise);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param appraise 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAppraise(Appraise appraise)
    {
        return appraiseMapper.insertAppraise(appraise);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param appraise 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAppraise(Appraise appraise)
    {
        return appraiseMapper.updateAppraise(appraise);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAppraiseByIds(Long[] ids)
    {
        return appraiseMapper.deleteAppraiseByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAppraiseById(Long id)
    {
        return appraiseMapper.deleteAppraiseById(id);
    }
}
