package com.yyzc.hy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yyzc.hy.pojo.User;
import com.yyzc.hy.service.RoleService;
import org.springframework.stereotype.Component;

/**
 * @Author: songyalong
 * @Description:
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
@Service(interfaceClass = RoleService.class)
@Component
public class RoleServiceImpl implements RoleService {
    @Override
    public User getUser() {
        User user = new User();
        user.setId(123);
        user.setUsername("username_role");
        user.setPassword("password_role123");
        return user;
    }
}
