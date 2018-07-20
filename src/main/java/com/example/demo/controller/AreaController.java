package com.example.demo.controller;


import com.example.demo.entity.Area;
import com.example.demo.service.impl.AreaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/superadmin")
@Controller
public class AreaController {
    @Autowired
    private AreaServiceImpl areaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    public String listArea(Model model){
        List<Area> list = areaService.getAreaList();
        model.addAttribute("lists",list);
        return "lookAllArea";

    }

    @RequestMapping(value = "/getareabyid",method = RequestMethod.GET)
    private Map<String,Object> getAreaByid(Integer areaId){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        Area area = areaService.getAreaById(areaId);
        modelMap.put("area",area);
        return modelMap;
    }
//    @RequestBody接收 的内容是除了x3wform之外的一些内容比如json或者xml
    @RequestMapping(value = "/addarea",method = RequestMethod.POST)
    private Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",areaService.addArea(area));
        return modelMap;
    }


    @RequestMapping(value = "/modifyarea",method = RequestMethod.POST)
    private Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String,Object>();
//        修改信息
        modelMap.put("success",areaService.modifyArea(area));
        return modelMap;
    }

    @RequestMapping(value = "/removearea",method = RequestMethod.GET)
    private Map<String,Object> removeArea(@RequestBody Integer areaId){
        Map<String,Object> modelMap = new HashMap<String,Object>();
//        删除
        modelMap.put("success",areaService.deleteArea(areaId));
        return modelMap;
    }



}
