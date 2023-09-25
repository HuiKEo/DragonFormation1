package com.it.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.models.PageSize;
import com.it.pojo.WasteInfo;
import com.it.service.WasteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/waste_info")
public class WasteInfoController {

    @Autowired
    public WasteInfoService wasteInfoService;

    @RequestMapping("/list")
    public String findWasteAll(WasteInfo wasteInfo, HttpServletRequest request,
                               @RequestParam(defaultValue ="1") int pageNum){

        PageHelper.startPage(pageNum, PageSize.PAGESIZE);
        List<WasteInfo> all = this.wasteInfoService.findAll(wasteInfo);
        PageInfo<WasteInfo> pageInfo =new PageInfo<>(all);
        request.setAttribute("pageInfo",pageInfo);
        return "waste_info_list";
    }

}
