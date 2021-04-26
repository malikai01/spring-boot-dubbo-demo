package com.mlk.dubbo.demo.service;

import com.mlk.dubbo.demo.model.Users;

/**
 * @author malikai
 * @version 1.0
 * @date 2021-4-26 14:16
 */
public interface UserApiService {
    Users queryUserById(Integer userId);
}
