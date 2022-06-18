package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Oplog;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface IOplogService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Oplog selectOplogById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param oplog 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Oplog> selectOplogList(Oplog oplog);

    /**
     * 新增【请填写功能名称】
     * 
     * @param oplog 【请填写功能名称】
     * @return 结果
     */
    public int insertOplog(Oplog oplog);

    /**
     * 修改【请填写功能名称】
     * 
     * @param oplog 【请填写功能名称】
     * @return 结果
     */
    public int updateOplog(Oplog oplog);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteOplogByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOplogById(Long id);
}
