package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Politicsstatus;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface PoliticsstatusMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Politicsstatus selectPoliticsstatusById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param politicsstatus 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Politicsstatus> selectPoliticsstatusList(Politicsstatus politicsstatus);

    /**
     * 新增【请填写功能名称】
     * 
     * @param politicsstatus 【请填写功能名称】
     * @return 结果
     */
    public int insertPoliticsstatus(Politicsstatus politicsstatus);

    /**
     * 修改【请填写功能名称】
     * 
     * @param politicsstatus 【请填写功能名称】
     * @return 结果
     */
    public int updatePoliticsstatus(Politicsstatus politicsstatus);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePoliticsstatusById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePoliticsstatusByIds(Long[] ids);
}
