package com.bachan.security.mapper;

import com.bachan.security.entity.UserDetailsImpl;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapperMapper extends BaseMapper<UserDetailsImpl> {}
