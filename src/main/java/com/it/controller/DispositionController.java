package com.it.controller;

import com.it.pojo.DispositionInfo;
import com.it.pojo.Menu;
import com.it.service.DispositionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/disposition")
public class DispositionController {
    @Autowired
    private DispositionInfoService dispositionInfoService;
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String dispositionRegister(HttpServletRequest request){
        DispositionInfo dispositionInfo = new DispositionInfo();
        String licence = request.getParameter("licence");
        if (!licence.equals("")&&licence!=null){
            request.getSession().setAttribute("licence",licence);
            System.out.println(licence);
            dispositionInfo.setLicence(licence);
        }

        String name = request.getParameter("name");
        if (!name.equals("")&&name!=null){
            request.getSession().setAttribute("name",name);
            System.out.println(name);
            dispositionInfo.setName(name);
        }
/*        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(System.currentTimeMillis());
        dispositionInfo.setCreateTime(sdf.parse(format));*/
        dispositionInfo.setIsdeleted(0);
        dispositionInfo.setStatus(0);
        dispositionInfoService.insertDispositionInfo(dispositionInfo);
        return "login";
    }
}
