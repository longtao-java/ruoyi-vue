package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.HrRole;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface IHrRoleService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public HrRole selectHrRoleById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hrRole 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HrRole> selectHrRoleList(HrRole hrRole);

    /**
     * 新增【请填写功能名称】
     * 
     * @param hrRole 【请填写功能名称】
     * @return 结果
     */
    public int insertHrRole(HrRole hrRole);

    /**
     * 修改【请填写功能名称】
     * 
     * @param hrRole 【请填写功能名称】
     * @return 结果
     */
    public int updateHrRole(HrRole hrRole);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteHrRoleByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteHrRoleById(Long id);
}
