package com.it.controller;

import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.models.PageSize;
import com.it.pojo.WasteInfo;
import com.it.service.WasteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
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
        String name = request.getParameter("aname");
        String feature = request.getParameter("afeature");
        String enterprise = request.getParameter("aenterprise");
        String workshop = request.getParameter("aworkshop");
        String machine = request.getParameter("amachine");
        String operator = request.getParameter("aoperator");
        wasteInfo.setWasteName(name);
        wasteInfo.setFeature(feature);
        wasteInfo.setSourceEnterprise(enterprise);
        wasteInfo.setSourceWorkshop(workshop);
        wasteInfo.setSourceMachine(machine);
        wasteInfo.setOperator(operator);
        List<WasteInfo> all = this.wasteInfoService.findAll(wasteInfo);
        PageInfo<WasteInfo> pageInfo =new PageInfo<>(all);
        request.setAttribute("pageInfo",pageInfo);
        return "waste_info_list";
    }

    @RequestMapping("/data")
    public String findOne(HttpServletRequest request,@RequestParam("id") int id){
        WasteInfo one = this.wasteInfoService.findOne(id);
        request.setAttribute("one",one);
        return "waste_info_update";
    }

    @PostMapping("/update")
    public String updateInfo(HttpServletRequest request,WasteInfo wasteInfo){
        String code = request.getParameter("code");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String amount = request.getParameter("amount");
        String measure = request.getParameter("measure");
        String operator = request.getParameter("operator");
        wasteInfo.setId(Integer.valueOf(id));
        wasteInfo.setBatchCode(code);
        wasteInfo.setWasteName(name);
        wasteInfo.setAmount(amount);
        wasteInfo.setMeasure(measure);
        wasteInfo.setOperator(operator);
        int i = this.wasteInfoService.updateInfo(wasteInfo);
        if (i > 0){
            WasteInfo wasteInfo1 = new WasteInfo();
            findWasteAll(wasteInfo1,request,1);
            return "waste_info_list";
        }else {
            return "error/404";
        }
    }

    @RequestMapping("delete")
    public  String deleteWaste(HttpServletRequest request,WasteInfo wasteInfo,
                               @RequestParam int id){
        wasteInfo.setIsDeleted(0);
        wasteInfo.setId(id);
        int i = this.wasteInfoService.updateInfo(wasteInfo);
        if (i>0){
            WasteInfo wasteInfo1 = new WasteInfo();
            findWasteAll(wasteInfo1,request,1);
            return "waste_info_list";
        }else {
            return "error/404";
        }
    }

    @RequestMapping("export")
    public void export(HttpServletResponse response,WasteInfo wasteInfo)throws Exception{
        List<WasteInfo> all = this.wasteInfoService.findAll(wasteInfo);
        ExcelWriter writer = ExcelUtil.getWriter(true);
        writer.addHeaderAlias("id","序号");
        writer.addHeaderAlias("batchCode","废料代号");
        writer.addHeaderAlias("wasteName","废料名称");
        writer.addHeaderAlias("wasteCategory","废料所属");
        writer.addHeaderAlias("amount","数量");
        writer.addHeaderAlias("measure","单位");
        writer.addHeaderAlias("sourceEnterprise","废物来源(公司)");
        writer.addHeaderAlias("sourceWorkshop","废物来源(仓库)");
        writer.addHeaderAlias("sourceMachine","废物来源(机器)");
        writer.addHeaderAlias("feature","废物类别");
        writer.addHeaderAlias("operator","经办人");
        writer.addHeaderAlias("createTime","产生时间");
        writer.addHeaderAlias("isDeleted","状态");
        writer.write(all,true);
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        String fileName = URLEncoder.encode("废料信息表","UTF-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName + ".xlsx");
        ServletOutputStream out = response.getOutputStream();
        writer.flush(out,true);
        out.close();
        writer.close();
    }
}
