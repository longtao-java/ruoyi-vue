package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Adjustsalary;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
public interface AdjustsalaryMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Adjustsalary selectAdjustsalaryById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param adjustsalary 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Adjustsalary> selectAdjustsalaryList(Adjustsalary adjustsalary);

    /**
     * 新增【请填写功能名称】
     * 
     * @param adjustsalary 【请填写功能名称】
     * @return 结果
     */
    public int insertAdjustsalary(Adjustsalary adjustsalary);

    /**
     * 修改【请填写功能名称】
     * 
     * @param adjustsalary 【请填写功能名称】
     * @return 结果
     */
    public int updateAdjustsalary(Adjustsalary adjustsalary);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteAdjustsalaryById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAdjustsalaryByIds(Long[] ids);
}
