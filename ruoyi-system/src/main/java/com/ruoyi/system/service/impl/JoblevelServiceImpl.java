package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.JoblevelMapper;
import com.ruoyi.system.domain.Joblevel;
import com.ruoyi.system.service.IJoblevelService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class JoblevelServiceImpl implements IJoblevelService 
{
    @Autowired
    private JoblevelMapper joblevelMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Joblevel selectJoblevelById(Long id)
    {
        return joblevelMapper.selectJoblevelById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param joblevel 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Joblevel> selectJoblevelList(Joblevel joblevel)
    {
        return joblevelMapper.selectJoblevelList(joblevel);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param joblevel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertJoblevel(Joblevel joblevel)
    {
        return joblevelMapper.insertJoblevel(joblevel);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param joblevel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateJoblevel(Joblevel joblevel)
    {
        return joblevelMapper.updateJoblevel(joblevel);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteJoblevelByIds(Long[] ids)
    {
        return joblevelMapper.deleteJoblevelByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteJoblevelById(Long id)
    {
        return joblevelMapper.deleteJoblevelById(id);
    }
}
