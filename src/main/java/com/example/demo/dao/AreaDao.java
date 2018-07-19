package com.example.demo.dao;

import com.example.demo.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
public interface AreaDao {
    /**
     * 查全部
     * @return
     */
    List<Area> queryArea();

    /**
     * 通过id返回
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 增加一条数据
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 改一条数据
     * @param area
     * @return
     */
    int updataArea(Area area);

    /**
     * 删除一条数据
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Area> pageAllArea(int pageNum,int pageSize);
}
