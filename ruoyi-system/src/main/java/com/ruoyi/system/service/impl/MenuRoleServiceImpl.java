package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MenuRoleMapper;
import com.ruoyi.system.domain.MenuRole;
import com.ruoyi.system.service.IMenuRoleService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class MenuRoleServiceImpl implements IMenuRoleService 
{
    @Autowired
    private MenuRoleMapper menuRoleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public MenuRole selectMenuRoleById(Long id)
    {
        return menuRoleMapper.selectMenuRoleById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param menuRole 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<MenuRole> selectMenuRoleList(MenuRole menuRole)
    {
        return menuRoleMapper.selectMenuRoleList(menuRole);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param menuRole 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMenuRole(MenuRole menuRole)
    {
        return menuRoleMapper.insertMenuRole(menuRole);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param menuRole 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMenuRole(MenuRole menuRole)
    {
        return menuRoleMapper.updateMenuRole(menuRole);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMenuRoleByIds(Long[] ids)
    {
        return menuRoleMapper.deleteMenuRoleByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMenuRoleById(Long id)
    {
        return menuRoleMapper.deleteMenuRoleById(id);
    }
}
