package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Joblevel;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface IJoblevelService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Joblevel selectJoblevelById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param joblevel 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Joblevel> selectJoblevelList(Joblevel joblevel);

    /**
     * 新增【请填写功能名称】
     * 
     * @param joblevel 【请填写功能名称】
     * @return 结果
     */
    public int insertJoblevel(Joblevel joblevel);

    /**
     * 修改【请填写功能名称】
     * 
     * @param joblevel 【请填写功能名称】
     * @return 结果
     */
    public int updateJoblevel(Joblevel joblevel);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteJoblevelByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteJoblevelById(Long id);
}
