package com.money.fimsystem.common.controller;

import com.money.fimsystem.common.service.SysDictService;
import com.money.fimsystem.common.vo.SysDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SysDictController {
    @Autowired
    private SysDictService sysDictService;

    public String insert(SysDict sysDict){
        int insert = sysDictService.insert(sysDict);
        return "";
    }
}
