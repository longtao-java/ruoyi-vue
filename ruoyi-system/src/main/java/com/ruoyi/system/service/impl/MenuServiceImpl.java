package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MenuMapper;
import com.ruoyi.system.domain.Menu;
import com.ruoyi.system.service.IMenuService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class MenuServiceImpl implements IMenuService 
{
    @Autowired
    private MenuMapper menuMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Menu selectMenuById(Long id)
    {
        return menuMapper.selectMenuById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param menu 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Menu> selectMenuList(Menu menu)
    {
        return menuMapper.selectMenuList(menu);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param menu 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMenu(Menu menu)
    {
        return menuMapper.insertMenu(menu);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param menu 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMenu(Menu menu)
    {
        return menuMapper.updateMenu(menu);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMenuByIds(Long[] ids)
    {
        return menuMapper.deleteMenuByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMenuById(Long id)
    {
        return menuMapper.deleteMenuById(id);
    }
}
