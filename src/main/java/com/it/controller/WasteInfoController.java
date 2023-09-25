package com.it.controller;

import com.it.pojo.WasteInfo;
import com.it.service.WasteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/waste_info")
public class WasteInfoController {

    @Autowired
    public WasteInfoService wasteInfoService;

    @RequestMapping("/list")
    public String findWasteAll(WasteInfo wasteInfo, HttpServletRequest request){
        List<WasteInfo> all = this.wasteInfoService.findAll(wasteInfo);
        request.setAttribute("all",all);
        return "waste_info_list";
    }

}
