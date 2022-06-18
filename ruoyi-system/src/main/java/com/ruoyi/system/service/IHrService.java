package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Hr;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface IHrService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Hr selectHrById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hr 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Hr> selectHrList(Hr hr);

    /**
     * 新增【请填写功能名称】
     * 
     * @param hr 【请填写功能名称】
     * @return 结果
     */
    public int insertHr(Hr hr);

    /**
     * 修改【请填写功能名称】
     * 
     * @param hr 【请填写功能名称】
     * @return 结果
     */
    public int updateHr(Hr hr);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteHrByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteHrById(Long id);
}
