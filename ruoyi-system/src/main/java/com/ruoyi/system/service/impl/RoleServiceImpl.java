package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RoleMapper;
import com.ruoyi.system.domain.Role;
import com.ruoyi.system.service.IRoleService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class RoleServiceImpl implements IRoleService 
{
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Role selectRoleById(Long id)
    {
        return roleMapper.selectRoleById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param role 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Role> selectRoleList(Role role)
    {
        return roleMapper.selectRoleList(role);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param role 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertRole(Role role)
    {
        return roleMapper.insertRole(role);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param role 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRole(Role role)
    {
        return roleMapper.updateRole(role);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRoleByIds(Long[] ids)
    {
        return roleMapper.deleteRoleByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRoleById(Long id)
    {
        return roleMapper.deleteRoleById(id);
    }
}
