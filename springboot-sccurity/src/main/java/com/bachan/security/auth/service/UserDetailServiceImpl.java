package com.bachan.security.auth.service;

import com.bachan.security.service.UserService;
import com.bachan.security.entity.UserDetailsImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * UserDetailsService,用来加载用户特定数据的核心接口
 */
@Slf4j
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    final UserService userService;


    public UserDetailServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetailsImpl user = userService.getOne(new QueryWrapper<UserDetailsImpl>().eq("username", username));
        return user;
    }
}
