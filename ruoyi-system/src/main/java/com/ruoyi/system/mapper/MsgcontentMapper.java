package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Msgcontent;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface MsgcontentMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Msgcontent selectMsgcontentById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param msgcontent 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Msgcontent> selectMsgcontentList(Msgcontent msgcontent);

    /**
     * 新增【请填写功能名称】
     * 
     * @param msgcontent 【请填写功能名称】
     * @return 结果
     */
    public int insertMsgcontent(Msgcontent msgcontent);

    /**
     * 修改【请填写功能名称】
     * 
     * @param msgcontent 【请填写功能名称】
     * @return 结果
     */
    public int updateMsgcontent(Msgcontent msgcontent);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMsgcontentById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMsgcontentByIds(Long[] ids);
}
