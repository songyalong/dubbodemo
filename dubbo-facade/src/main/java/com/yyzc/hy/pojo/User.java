package com.yyzc.hy.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: songyalong
 * @Description:
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
@Getter
@Setter
@ToString
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
}
