package com.mlk.dubbo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mlk.dubbo.demo.model.Users;
import com.mlk.dubbo.demo.service.IUserService;
import com.mlk.dubbo.demo.service.UserApiService;
import org.springframework.stereotype.Service;

/**
 * @author malikai
 * @version 1.0
 * @date 2021-4-26 14:18
 */
@Service
public class UserApiServiceImpl implements UserApiService {

    @Reference
    IUserService userService;

    @Override
    public Users queryUserById(Integer userId) {
        return userService.queryUserById(userId);
    }
}
