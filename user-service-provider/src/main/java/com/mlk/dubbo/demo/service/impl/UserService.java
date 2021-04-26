package com.mlk.dubbo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mlk.dubbo.demo.dao.UsersMapper;
import com.mlk.dubbo.demo.model.Users;
import com.mlk.dubbo.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author malikai
 * @version 1.0
 * @date 2021-4-25 16:45
 */
@Service
@Component
public class UserService implements IUserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users queryUserById(Integer userId) {
        return usersMapper.queryUserById(userId);
    }
}
