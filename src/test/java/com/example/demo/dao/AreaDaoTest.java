package com.example.demo.dao;

import com.example.demo.entity.Area;
import com.example.demo.service.AreaSercice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Autowired
    private AreaSercice areaSercice;

    @Test
    public void queryArea() {
        List<Area> areas = areaDao.queryArea();
        System.err.println(areas);
    }

    @Test
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
        assertEquals("苍井空",area.getAreaName());
        System.out.println(area);
    }

    @Test
    public void insertArea() {
        Area area = new Area();
        area.setPriority(3);
        area.setAreaName("苍井");
        int i = areaDao.insertArea(area);
        System.err.println(i);
    }

    @Test
    public void updataArea() {
        Area area = new Area();
        area.setAreaId(1);
        area.setPriority(3);
        area.setLastEditTime(new Date());
        area.setAreaName("颇多野结衣");
        int i = areaDao.updataArea(area);
        System.err.println(i);
    }

    @Test
    public void deleteArea() {
        int i = areaDao.deleteArea(3);
        System.err.println(i);
    }
//  测试回滚事物
    @Test
    public void addTransaction() {
        Area area = new Area();
        area.setPriority(5);
        area.setAreaName("小泽玛亚");
        areaSercice.addArea(area);
    }

}