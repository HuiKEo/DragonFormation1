package com.it.controller;

import com.github.pagehelper.PageInfo;
import com.it.pojo.DispositionInfo;
import com.it.pojo.DispositionInfoExample;
import com.it.pojo.Menu;
import com.it.pojo.dto.DispositionInfoDto;
import com.it.service.DispositionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/disposition")
public class DispositionController {
    @Autowired
    private DispositionInfoService dispositionInfoService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String dispositionRegister(HttpServletRequest request) {
        DispositionInfo dispositionInfo = new DispositionInfo();
        String licence = request.getParameter("licence");
        if (!licence.equals("") && licence != null) {
            request.getSession().setAttribute("licence", licence);
            System.out.println(licence);
            dispositionInfo.setLicence(licence);
        }

        String name = request.getParameter("name");
        if (!name.equals("") && name != null) {
            request.getSession().setAttribute("name", name);
            System.out.println(name);
            dispositionInfo.setName(name);
        }
        dispositionInfoService.insertDispositionInfo(dispositionInfo);
        return "login";
    }

    @RequestMapping(path = "dispositionList",method = {RequestMethod.GET,RequestMethod.DELETE})
    public ModelAndView dispositionList(DispositionInfoDto dispositionInfoDto,
                                        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo) {
        PageInfo<DispositionInfo> pageInfo = dispositionInfoService.getPageInfoCondition(dispositionInfoDto, pageNo, 5);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("pageInfo", pageInfo);
        modelAndView.setViewName("disposition_list");
        return modelAndView;
    }


    //删除时逻辑删除
    @RequestMapping(value = "/deletedisposition/{id}",method = RequestMethod.DELETE)
    public String deleteInfo(DispositionInfo dispositionInfo){
        dispositionInfo.setIsdeleted(0);
        dispositionInfoService.deleteDispositionInfo(dispositionInfo);
        return "redirect:/disposition/dispositionList";
    }

  /*  @RequestMapping(value = "/updatedisposition/{id}",method = RequestMethod.PUT)
    public String updateInfo(DispositionInfo dispositionInfo){
        dispositionInfoService.deleteDispositionInfo(dispositionInfo);
        return "redirect:/disposition/dispositionList";
    }*/


    //修改
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public String updateInfo(DispositionInfo dispositionInfo,
                             HttpServletRequest request){
        String id = request.getParameter("id");
        dispositionInfo.setId(Integer.parseInt(id));
        System.out.println("进来了");
        dispositionInfoService.updateDispositionInfo(dispositionInfo);
        return "redirect:/disposition/dispositionList";
    }


    //获取修改时值
    @RequestMapping(value = "/toUpdate/{id}",method = RequestMethod.GET)
    @ResponseBody
    public DispositionInfo infoDetail(@PathVariable("id") Integer id, Model model){
        return dispositionInfoService.updategetInfo(id);
    }

}


