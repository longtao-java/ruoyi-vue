package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PositionMapper;
import com.ruoyi.system.domain.Position;
import com.ruoyi.system.service.IPositionService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-28
 */
@Service
public class PositionServiceImpl implements IPositionService 
{
    @Autowired
    private PositionMapper positionMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Position selectPositionById(Long id)
    {
        return positionMapper.selectPositionById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param position 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Position> selectPositionList(Position position)
    {
        return positionMapper.selectPositionList(position);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param position 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPosition(Position position)
    {
        return positionMapper.insertPosition(position);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param position 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePosition(Position position)
    {
        return positionMapper.updatePosition(position);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePositionByIds(Long[] ids)
    {
        return positionMapper.deletePositionByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePositionById(Long id)
    {
        return positionMapper.deletePositionById(id);
    }
}
