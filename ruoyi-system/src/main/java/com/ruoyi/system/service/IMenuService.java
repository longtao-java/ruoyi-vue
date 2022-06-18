package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Menu;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface IMenuService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Menu selectMenuById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param menu 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Menu> selectMenuList(Menu menu);

    /**
     * 新增【请填写功能名称】
     * 
     * @param menu 【请填写功能名称】
     * @return 结果
     */
    public int insertMenu(Menu menu);

    /**
     * 修改【请填写功能名称】
     * 
     * @param menu 【请填写功能名称】
     * @return 结果
     */
    public int updateMenu(Menu menu);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteMenuByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMenuById(Long id);
}
