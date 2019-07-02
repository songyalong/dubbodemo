package com.yyzc.hy.service.impl;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.yyzc.hy.service.TestService;
import com.yyzc.hy.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: songyalong
 * @Description:
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
public class TestProvider {
    public static void main(String[] args) throws InterruptedException {
//        UserServiceImpl2 userServiceImpl2 = new UserServiceImpl2();
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("provider2");
//
//        // 连接注册中心配置
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("192.168.137.2:2181");
//
//        // 服务提供者协议
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setPort(12800);
//        protocolConfig.setName("dubbo");
//        protocolConfig.setThreads(200);
//
//        // 服务暴露
//        ServiceConfig<TestService> serviceConfig = new ServiceConfig<>();
//        serviceConfig.setApplication(applicationConfig);
//        serviceConfig.setRegistry(registryConfig);
//        serviceConfig.setProtocol(protocolConfig);
//        serviceConfig.setInterface(TestService.class);
//        serviceConfig.setRef(userServiceImpl2);
//
//        serviceConfig.export();
//
//        Thread.sleep(Integer.MAX_VALUE);

      Map<String, Object> test = new HashMap<>();
      test.put("tt", "tt");
      test.put("tt", "123");
      ConcurrentHashMap cc = new ConcurrentHashMap();

        testA();


    }


    public static void testA(){
        List<String> list = null;
        test2(list);
        System.out.println("ttttt");
        System.out.println("ttttt");
        System.out.println("ttttt");
        System.out.println("ttttt");
        System.out.println(list.size());
    }

    private static  void test2(List<String> list) {
        list = new ArrayList<>();
        list.add("ttt");
    }


}
