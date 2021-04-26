package com.mlk.dubbo.demo.controller;

import com.mlk.dubbo.demo.model.Users;
import com.mlk.dubbo.demo.service.UserApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author malikai
 * @version 1.0
 * @date 2021-4-26 14:14
 */
@RestController
public class UserController {
    @Autowired
    private UserApiService userApiService;

    @GetMapping("/api/getUserById")
    public Users queryUserById(@RequestParam Integer userId) {
        return userApiService.queryUserById(userId);
    }
}
