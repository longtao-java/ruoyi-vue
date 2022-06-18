package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysmsgMapper;
import com.ruoyi.system.domain.Sysmsg;
import com.ruoyi.system.service.ISysmsgService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class SysmsgServiceImpl implements ISysmsgService 
{
    @Autowired
    private SysmsgMapper sysmsgMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Sysmsg selectSysmsgById(Long id)
    {
        return sysmsgMapper.selectSysmsgById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysmsg 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Sysmsg> selectSysmsgList(Sysmsg sysmsg)
    {
        return sysmsgMapper.selectSysmsgList(sysmsg);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysmsg 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysmsg(Sysmsg sysmsg)
    {
        return sysmsgMapper.insertSysmsg(sysmsg);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysmsg 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysmsg(Sysmsg sysmsg)
    {
        return sysmsgMapper.updateSysmsg(sysmsg);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysmsgByIds(Long[] ids)
    {
        return sysmsgMapper.deleteSysmsgByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysmsgById(Long id)
    {
        return sysmsgMapper.deleteSysmsgById(id);
    }
}
