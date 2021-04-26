
package com.mlk.dubbo.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.mlk.dubbo.demo.model.Users;
import com.mlk.dubbo.demo.service.IUserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author malikai
 * @version 1.0.0
 * @date 2021-4-26 14:04
 **/
@SpringBootApplication
@RestController
@MapperScan("com.mlk.dubbo.demo")
@EnableDubbo
public class ProviderApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

    @Autowired
    private IUserService userService;

    @GetMapping("getUserById")
    public Users queryUserById(@RequestParam Integer userId) {
        return userService.queryUserById(userId);
    }


    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
            