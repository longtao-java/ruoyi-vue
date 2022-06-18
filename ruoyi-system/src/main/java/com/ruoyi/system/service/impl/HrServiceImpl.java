package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.HrMapper;
import com.ruoyi.system.domain.Hr;
import com.ruoyi.system.service.IHrService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class HrServiceImpl implements IHrService 
{
    @Autowired
    private HrMapper hrMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Hr selectHrById(Long id)
    {
        return hrMapper.selectHrById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hr 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Hr> selectHrList(Hr hr)
    {
        return hrMapper.selectHrList(hr);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param hr 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHr(Hr hr)
    {
        return hrMapper.insertHr(hr);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param hr 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateHr(Hr hr)
    {
        return hrMapper.updateHr(hr);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteHrByIds(Long[] ids)
    {
        return hrMapper.deleteHrByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteHrById(Long id)
    {
        return hrMapper.deleteHrById(id);
    }
}
