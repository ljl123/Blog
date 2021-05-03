package com.ljl.service.impl;

import com.ljl.entity.User;
import com.ljl.mapper.UserMapper;
import com.ljl.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 关注ljl
 * @since 2021-04-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
