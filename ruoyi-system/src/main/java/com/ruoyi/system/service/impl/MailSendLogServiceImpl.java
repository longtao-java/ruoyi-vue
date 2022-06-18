package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MailSendLogMapper;
import com.ruoyi.system.domain.MailSendLog;
import com.ruoyi.system.service.IMailSendLogService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class MailSendLogServiceImpl implements IMailSendLogService 
{
    @Autowired
    private MailSendLogMapper mailSendLogMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param msgid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public MailSendLog selectMailSendLogByMsgid(String msgid)
    {
        return mailSendLogMapper.selectMailSendLogByMsgid(msgid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param mailSendLog 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<MailSendLog> selectMailSendLogList(MailSendLog mailSendLog)
    {
        return mailSendLogMapper.selectMailSendLogList(mailSendLog);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param mailSendLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMailSendLog(MailSendLog mailSendLog)
    {
        return mailSendLogMapper.insertMailSendLog(mailSendLog);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param mailSendLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMailSendLog(MailSendLog mailSendLog)
    {
        return mailSendLogMapper.updateMailSendLog(mailSendLog);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param msgids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMailSendLogByMsgids(String[] msgids)
    {
        return mailSendLogMapper.deleteMailSendLogByMsgids(msgids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param msgid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMailSendLogByMsgid(String msgid)
    {
        return mailSendLogMapper.deleteMailSendLogByMsgid(msgid);
    }
}
