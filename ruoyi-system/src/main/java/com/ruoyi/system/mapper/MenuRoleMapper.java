package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.MenuRole;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface MenuRoleMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public MenuRole selectMenuRoleById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param menuRole 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<MenuRole> selectMenuRoleList(MenuRole menuRole);

    /**
     * 新增【请填写功能名称】
     * 
     * @param menuRole 【请填写功能名称】
     * @return 结果
     */
    public int insertMenuRole(MenuRole menuRole);

    /**
     * 修改【请填写功能名称】
     * 
     * @param menuRole 【请填写功能名称】
     * @return 结果
     */
    public int updateMenuRole(MenuRole menuRole);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMenuRoleById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMenuRoleByIds(Long[] ids);
}
