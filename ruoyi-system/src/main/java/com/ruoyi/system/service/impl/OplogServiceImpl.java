package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OplogMapper;
import com.ruoyi.system.domain.Oplog;
import com.ruoyi.system.service.IOplogService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class OplogServiceImpl implements IOplogService 
{
    @Autowired
    private OplogMapper oplogMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Oplog selectOplogById(Long id)
    {
        return oplogMapper.selectOplogById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param oplog 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Oplog> selectOplogList(Oplog oplog)
    {
        return oplogMapper.selectOplogList(oplog);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param oplog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOplog(Oplog oplog)
    {
        return oplogMapper.insertOplog(oplog);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param oplog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOplog(Oplog oplog)
    {
        return oplogMapper.updateOplog(oplog);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOplogByIds(Long[] ids)
    {
        return oplogMapper.deleteOplogByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOplogById(Long id)
    {
        return oplogMapper.deleteOplogById(id);
    }
}
