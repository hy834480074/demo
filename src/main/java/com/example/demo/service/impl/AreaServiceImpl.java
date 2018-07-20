package com.example.demo.service.impl;

import com.example.demo.dao.AreaDao;
import com.example.demo.entity.Area;
import com.example.demo.enums.MyEnum;
import com.example.demo.exception.AreaException;
import com.example.demo.service.AreaSercice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service("areaService")
@Repository
public class AreaServiceImpl implements AreaSercice {

    @Autowired(required = false)
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }

    @Override
    public Area getAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }


//    serviceImpl只处理逻辑不需要接受返回信息  引用了自定义AreaException异常有
//    异常就捕获  又写了一个捕获的类GlobalExceptionHandler
    @Transactional//当抛出RuntimeException事物会自动回滚默认的
    @Override
    public boolean addArea(Area area) {
        if(area.getAreaName() != null && ! "".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                 int effectedNum = areaDao.insertArea(area);
                 if(effectedNum>0){
                     return true;
                 }else {
                     throw new AreaException(MyEnum.ADD_ERROR);
                 }
            } catch (Exception e){
                     throw new AreaException(MyEnum.ADD_ERROR);
            }
        }else {
            throw new AreaException(MyEnum.ADD_ERROR);
        }
    }
    @Override
    public boolean modifyArea(Area area) {
        if(area.getAreaId() != null && ! "".equals(area.getAreaId())){
            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaDao.updataArea(area);
                if(effectedNum>0){
                    return true;
                }else {
                    throw new AreaException(MyEnum.UPDATAERROR);
                }
            } catch (Exception e){
                throw new AreaException(MyEnum.UPDATAERROR);
            }
        }else {
            throw new AreaException(MyEnum.IDNULL);
        }
    }

    @Override
    public boolean deleteArea(int areaId) {
        if(areaId > 0){
            try {
                int effectedNum = areaDao.deleteArea(areaId);
                if(effectedNum>0){
                    return true;
                }else {
                    throw new AreaException(MyEnum.DELETE_ERROR);
                }
            } catch (Exception e){
                throw new AreaException(MyEnum.DELETE_ERROR);
            }
        }else {
            throw new AreaException(MyEnum.IDNULL);
        }
    }


}
