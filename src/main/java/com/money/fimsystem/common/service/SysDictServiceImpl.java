package com.money.fimsystem.common.service;

import com.money.fimsystem.common.dao.SysDictMapper;
import com.money.fimsystem.common.vo.SysDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysDictServiceImpl implements SysDictService {

    @Autowired
    private SysDictMapper sysDictMapper;

    @Override
    public int insert(SysDict record) {
        return sysDictMapper.insert(record);
    }
}
