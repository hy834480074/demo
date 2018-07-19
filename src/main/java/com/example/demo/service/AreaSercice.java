package com.example.demo.service;

import com.example.demo.entity.Area;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface AreaSercice {
    /**
     * 查询全部列表
     * @return
     */
    List<Area> getAreaList();

    /**
     * 通过id返回对应列表
     * @param areaId
     * @return
     */
    Area getAreaById(int areaId);

    /**
     * 增加信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 修改
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 删除一条信息
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<Area> lookPageAll(int pageNum, int pageSize);
}
