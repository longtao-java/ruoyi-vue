package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Sysmsg;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface SysmsgMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Sysmsg selectSysmsgById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysmsg 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Sysmsg> selectSysmsgList(Sysmsg sysmsg);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysmsg 【请填写功能名称】
     * @return 结果
     */
    public int insertSysmsg(Sysmsg sysmsg);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysmsg 【请填写功能名称】
     * @return 结果
     */
    public int updateSysmsg(Sysmsg sysmsg);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysmsgById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysmsgByIds(Long[] ids);
}
