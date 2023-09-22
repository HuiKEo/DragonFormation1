package com.it.pojo;

public class Menu {
    private Integer id;

    private String menu;

    private String path;

    private Integer parentid;

    private String icon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu == null ? null : menu.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menu='" + menu + '\'' +
                ", path='" + path + '\'' +
                ", parentid=" + parentid +
                ", icon='" + icon + '\'' +
                '}';
    }
}