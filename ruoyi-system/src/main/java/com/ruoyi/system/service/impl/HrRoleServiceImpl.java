package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.HrRoleMapper;
import com.ruoyi.system.domain.HrRole;
import com.ruoyi.system.service.IHrRoleService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class HrRoleServiceImpl implements IHrRoleService 
{
    @Autowired
    private HrRoleMapper hrRoleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public HrRole selectHrRoleById(Long id)
    {
        return hrRoleMapper.selectHrRoleById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hrRole 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HrRole> selectHrRoleList(HrRole hrRole)
    {
        return hrRoleMapper.selectHrRoleList(hrRole);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param hrRole 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHrRole(HrRole hrRole)
    {
        return hrRoleMapper.insertHrRole(hrRole);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param hrRole 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateHrRole(HrRole hrRole)
    {
        return hrRoleMapper.updateHrRole(hrRole);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteHrRoleByIds(Long[] ids)
    {
        return hrRoleMapper.deleteHrRoleByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteHrRoleById(Long id)
    {
        return hrRoleMapper.deleteHrRoleById(id);
    }
}
