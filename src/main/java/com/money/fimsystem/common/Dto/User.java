package com.money.fimsystem.common.Dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
@TableName("system_user")
public class User{

    @TableId
    private Long id;
    private String username;
    private String password;
}
