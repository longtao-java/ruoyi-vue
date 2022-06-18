package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NationMapper;
import com.ruoyi.system.domain.Nation;
import com.ruoyi.system.service.INationService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class NationServiceImpl implements INationService 
{
    @Autowired
    private NationMapper nationMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Nation selectNationById(Long id)
    {
        return nationMapper.selectNationById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param nation 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Nation> selectNationList(Nation nation)
    {
        return nationMapper.selectNationList(nation);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param nation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertNation(Nation nation)
    {
        return nationMapper.insertNation(nation);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param nation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateNation(Nation nation)
    {
        return nationMapper.updateNation(nation);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteNationByIds(Long[] ids)
    {
        return nationMapper.deleteNationByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteNationById(Long id)
    {
        return nationMapper.deleteNationById(id);
    }
}
