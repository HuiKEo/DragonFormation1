package com.it.controller;

import com.github.pagehelper.PageInfo;
import com.it.pojo.DispositionInfo;
import com.it.pojo.Driver;
import com.it.pojo.dto.DispositionInfoDto;
import com.it.pojo.dto.DriverDto;
import com.it.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    private DriverService driverService;
    @RequestMapping(path = "driverList",method = {RequestMethod.GET,RequestMethod.DELETE})
    public ModelAndView dispositionList(DriverDto driverDto,
                                        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo) {
        PageInfo<Driver> pageInfo = driverService.getPageInfoCondition(driverDto, pageNo, 5);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("pageInfo", pageInfo);
        modelAndView.setViewName("driver_list");
        return modelAndView;
    }

    //获取修改时值
    @RequestMapping(value = "/toUpdate/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Driver infoDetail(@PathVariable("id") Integer id){
        return driverService.getDriverInfo(id);
    }

    //修改
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public String updateInfo(Driver driver,
                             HttpServletRequest request){
        String id = request.getParameter("id");
        driver.setId(Integer.parseInt(id));
        System.out.println("进来了");
        driverService.updateDriverInfo(driver);
        return "redirect:/driver/driverList";
    }

    //删除时逻辑删除
    @RequestMapping(value = "/deletedriver/{id}",method = RequestMethod.DELETE)
    public String deleteInfo(Driver driver){
        driver.setIsdeleted(0);
        driverService.deleteDriverInfo(driver);
        return "redirect:/driver/driverList";
    }
}
