package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.MailSendLog;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface MailSendLogMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param msgid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public MailSendLog selectMailSendLogByMsgid(String msgid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param mailSendLog 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<MailSendLog> selectMailSendLogList(MailSendLog mailSendLog);

    /**
     * 新增【请填写功能名称】
     * 
     * @param mailSendLog 【请填写功能名称】
     * @return 结果
     */
    public int insertMailSendLog(MailSendLog mailSendLog);

    /**
     * 修改【请填写功能名称】
     * 
     * @param mailSendLog 【请填写功能名称】
     * @return 结果
     */
    public int updateMailSendLog(MailSendLog mailSendLog);

    /**
     * 删除【请填写功能名称】
     * 
     * @param msgid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMailSendLogByMsgid(String msgid);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param msgids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMailSendLogByMsgids(String[] msgids);
}
