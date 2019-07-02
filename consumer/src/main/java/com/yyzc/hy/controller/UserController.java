package com.yyzc.hy.controller;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.service.EchoService;
import com.yyzc.hy.pojo.User;
import com.yyzc.hy.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: songyalong
 * @Description:
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
@RestController
public class UserController {
    @Reference(version = "2.0.0", stub = "com.yyzc.hy.stub.UserServiceStub", mock = "true")
    private UserService userService;
    @GetMapping("user")
    public Object getUser(){
        User user = userService.getUser(1);
        System.out.println(user);
        return user;
    }
}
