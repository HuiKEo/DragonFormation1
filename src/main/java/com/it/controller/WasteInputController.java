package com.it.controller;

import com.it.pojo.WasteInfo;
import com.it.pojo.WasteInput;
import com.it.service.WasteInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/waste_input")
public class WasteInputController {

    @Autowired
    public WasteInputService wasteInputService;

    @RequestMapping("/list")
    public String findAll(WasteInput wasteInput, Model model){
        System.out.println(wasteInputService.findAll(wasteInput));
        List<WasteInput> all = this.wasteInputService.findAll(wasteInput);
        model.addAttribute("all",all);
        return "waste_input_list";
    }

}
