package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PoliticsstatusMapper;
import com.ruoyi.system.domain.Politicsstatus;
import com.ruoyi.system.service.IPoliticsstatusService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class PoliticsstatusServiceImpl implements IPoliticsstatusService 
{
    @Autowired
    private PoliticsstatusMapper politicsstatusMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Politicsstatus selectPoliticsstatusById(Long id)
    {
        return politicsstatusMapper.selectPoliticsstatusById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param politicsstatus 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Politicsstatus> selectPoliticsstatusList(Politicsstatus politicsstatus)
    {
        return politicsstatusMapper.selectPoliticsstatusList(politicsstatus);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param politicsstatus 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPoliticsstatus(Politicsstatus politicsstatus)
    {
        return politicsstatusMapper.insertPoliticsstatus(politicsstatus);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param politicsstatus 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePoliticsstatus(Politicsstatus politicsstatus)
    {
        return politicsstatusMapper.updatePoliticsstatus(politicsstatus);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePoliticsstatusByIds(Long[] ids)
    {
        return politicsstatusMapper.deletePoliticsstatusByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePoliticsstatusById(Long id)
    {
        return politicsstatusMapper.deletePoliticsstatusById(id);
    }
}
