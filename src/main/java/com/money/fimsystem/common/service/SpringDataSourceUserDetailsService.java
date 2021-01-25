package com.money.fimsystem.common.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.money.fimsystem.common.Dto.User;
import com.money.fimsystem.common.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SpringDataSourceUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LambdaQueryWrapper<User> queryWrapper = Wrappers.<User>lambdaQuery().eq(User::getUsername, username);
        User user = userMapper.selectOne(queryWrapper);
        UserDetails userDetails = null;
        if(user != null){
            userDetails = org.springframework.security.core.userdetails.User.withUsername(user.getUsername()).password(user.getPassword()).authorities("p1").build();
        }

        return userDetails;
    }
}
