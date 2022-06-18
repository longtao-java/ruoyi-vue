package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Employeetrain;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface IEmployeetrainService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Employeetrain selectEmployeetrainById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param employeetrain 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Employeetrain> selectEmployeetrainList(Employeetrain employeetrain);

    /**
     * 新增【请填写功能名称】
     * 
     * @param employeetrain 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployeetrain(Employeetrain employeetrain);

    /**
     * 修改【请填写功能名称】
     * 
     * @param employeetrain 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployeetrain(Employeetrain employeetrain);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteEmployeetrainByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeetrainById(Long id);
}
