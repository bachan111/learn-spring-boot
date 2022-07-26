package com.bachan.security.service;

import com.bachan.security.entity.UserDetailsImpl;
import com.bachan.security.mapper.UserMapperMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapperMapper, UserDetailsImpl> implements UserService {
}
