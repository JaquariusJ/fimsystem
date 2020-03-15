package com.money.fimsystem.common.dao;

import com.money.fimsystem.common.vo.SysDict;
import org.apache.ibatis.annotations.Mapper;


public interface SysDictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);
}