package com.mlk.dubbo.demo.service;

import com.mlk.dubbo.demo.model.Users;

public interface IUserService {
    Users queryUserById(Integer userId);
}
