package com.money.fimsystem.business.dao;

import com.money.fimsystem.business.vo.InvertKind;

public interface InvertKindMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InvertKind record);

    int insertSelective(InvertKind record);

    InvertKind selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InvertKind record);

    int updateByPrimaryKey(InvertKind record);
}