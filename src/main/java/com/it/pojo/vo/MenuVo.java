package com.it.pojo.vo;

import com.it.pojo.Menu;
import lombok.Data;

import java.util.List;

/**
 * @Author Chen
 * @Date 2023/10/3 11:28
 */
@Data
public class MenuVo {

    private Menu menu;
    private List<MenuVo> menuList;

}
