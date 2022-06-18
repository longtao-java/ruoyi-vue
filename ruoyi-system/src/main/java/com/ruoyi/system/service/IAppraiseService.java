package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Appraise;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface IAppraiseService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Appraise selectAppraiseById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param appraise 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Appraise> selectAppraiseList(Appraise appraise);

    /**
     * 新增【请填写功能名称】
     * 
     * @param appraise 【请填写功能名称】
     * @return 结果
     */
    public int insertAppraise(Appraise appraise);

    /**
     * 修改【请填写功能名称】
     * 
     * @param appraise 【请填写功能名称】
     * @return 结果
     */
    public int updateAppraise(Appraise appraise);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteAppraiseByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteAppraiseById(Long id);
}
