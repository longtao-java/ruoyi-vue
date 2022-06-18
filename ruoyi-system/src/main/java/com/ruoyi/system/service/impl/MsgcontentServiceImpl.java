package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MsgcontentMapper;
import com.ruoyi.system.domain.Msgcontent;
import com.ruoyi.system.service.IMsgcontentService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class MsgcontentServiceImpl implements IMsgcontentService 
{
    @Autowired
    private MsgcontentMapper msgcontentMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Msgcontent selectMsgcontentById(Long id)
    {
        return msgcontentMapper.selectMsgcontentById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param msgcontent 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Msgcontent> selectMsgcontentList(Msgcontent msgcontent)
    {
        return msgcontentMapper.selectMsgcontentList(msgcontent);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param msgcontent 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMsgcontent(Msgcontent msgcontent)
    {
        return msgcontentMapper.insertMsgcontent(msgcontent);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param msgcontent 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMsgcontent(Msgcontent msgcontent)
    {
        return msgcontentMapper.updateMsgcontent(msgcontent);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMsgcontentByIds(Long[] ids)
    {
        return msgcontentMapper.deleteMsgcontentByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMsgcontentById(Long id)
    {
        return msgcontentMapper.deleteMsgcontentById(id);
    }
}
