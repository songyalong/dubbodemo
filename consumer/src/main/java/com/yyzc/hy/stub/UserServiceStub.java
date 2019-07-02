package com.yyzc.hy.stub;

import com.yyzc.hy.pojo.User;
import com.yyzc.hy.service.UserService;

/**
 * @Author: songyalong
 * @Description: 本地存根，需要构造方法
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
public class UserServiceStub implements UserService {
    private UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("UserServiceStub....");
        if(null != id){
           return  userService.getUser(id);
        }
        return null;
    }

    @Override
    public User getUserById() {
        return null;
    }
}
