package com.it.mapper;

import com.it.pojo.Menu;
import com.it.pojo.MenuExample;

import java.util.Collection;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    /**
     * 查询角色的权限 一级菜单
     * @param id
     * @return
     */
    List<Menu> queryMenuByRoleId(Integer id);

    /**
     * 查询角色的二级菜单
     * @param roleId
     * @return
     */
    List<Menu> queryMenuLevel2ByRoleId(Integer roleId);

    /**
     * 根据parentId查询二级菜单
     * @param roleId
     * @param parentId
     * @return
     */
    List<Menu> queryMenuLevel2ByParentId(@Param("roleId") Integer roleId,@Param("parentId") Integer parentId);
}