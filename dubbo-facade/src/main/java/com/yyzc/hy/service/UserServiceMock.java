package com.yyzc.hy.service;

import com.yyzc.hy.pojo.User;

/**
 * @Author: songyalong
 * @Description:
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
public class UserServiceMock implements UserService {
    @Override
    public User getUser(Integer id) {
        User user = new User();
        user.setUsername("服务降级啦");
        return user;
    }

    @Override
    public User getUserById() {
        return null;
    }
}
