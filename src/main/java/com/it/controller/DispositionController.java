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


    @RequestMapping(value = "/deletedisposition/{id}",method = RequestMethod.DELETE)
    public String deleteInfo(DispositionInfo dispositionInfo){
       /* dispositionInfoService.deleteDispositionInfo(id);
        System.out.println(id);*/
        dispositionInfo.setIsdeleted(0);
        dispositionInfoService.deleteDispositionInfo(dispositionInfo);
        return "redirect:/disposition/dispositionList";
    }

}


