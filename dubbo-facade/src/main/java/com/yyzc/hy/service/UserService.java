package com.yyzc.hy.service;


import com.yyzc.hy.pojo.User;

/**
 * @Author: songyalong
 * @Description:
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
public interface UserService {
    User getUser(Integer id);
    User getUserById();
}
