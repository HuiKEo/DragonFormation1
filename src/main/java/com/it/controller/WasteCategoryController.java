package com.it.controller;

        import com.it.pojo.WasteCategory;
        import com.it.pojo.WasteCategoryExample;
        import com.it.service.WasteCategoryService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@Controller
@RequestMapping("/wasteCategories")
public class WasteCategoryController {

    private final WasteCategoryService wasteCategoryService;

    @Autowired
    public WasteCategoryController(WasteCategoryService wasteCategoryService) {
        this.wasteCategoryService = wasteCategoryService;
    }

    // 根据ID获取废物类别
    @GetMapping("/{id}")
    public WasteCategory getWasteCategoryById(@PathVariable Integer id) {
        return wasteCategoryService.selectByPrimaryKey(id);
    }

    // 获取所有废物类别
    @GetMapping("/all")
    public List<WasteCategory> getAllWasteCategories() {
        return wasteCategoryService.selectByExample(new WasteCategoryExample());
    }

    // 添加废物类别
    @PostMapping("/add")
    public String addWasteCategory(@RequestBody WasteCategory wasteCategory) {
        if (wasteCategoryService.insert(wasteCategory) > 0) {
            return "废物类别添加成功。";
        } else {
            return "废物类别添加失败。";
        }
    }

    // 更新废物类别
    @PutMapping("/update")
    public String updateWasteCategory(@RequestBody WasteCategory wasteCategory) {
        if (wasteCategoryService.updateByPrimaryKey(wasteCategory) > 0) {
            return "废物类别更新成功。";
        } else {
            return "废物类别更新失败。";
        }
    }

    // 删除废物类别
    @DeleteMapping("/delete/{id}")
    public String deleteWasteCategory(@PathVariable Integer id) {
        if (wasteCategoryService.deleteByPrimaryKey(id) > 0) {
            return "废物类别删除成功。";
        } else {
            return "废物类别删除失败。";
        }
    }

    @GetMapping("/list")
    public String listRoles(Model model) {
        // 处理列出所有废物类别的逻辑
        List<WasteCategory> wasteCategories = wasteCategoryService.selectByExample(new WasteCategoryExample());

        model.addAttribute("wasteCategories", wasteCategories);
        return "category_list"; // 返回视图名称
    }

}

