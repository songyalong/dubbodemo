package com.yyzc.hy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yyzc.hy.pojo.User;
import com.yyzc.hy.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @Author: songyalong
 * @Description:
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
@Service(interfaceClass = UserService.class, version = "2.0.0")
@Component
public class UserServiceImpl2 implements UserService {

    @Override
    public User getUser(Integer id) {
        User user = new User();
        user.setId(123);
        user.setUsername("username_123");
        user.setPassword("password_123");
        System.out.println("user server impl 2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User getUserById() {
        User user = new User();
        user.setId(123);
        user.setUsername("username_id123");
        user.setPassword("password_id123");
        return user;
    }
}
