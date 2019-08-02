package com.atguigu.gulimall.oms.controller;

import com.atguigu.gulimall.oms.feign.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope// 从配置中心 动态获取配置
@RestController
public class HelloController {

    @Autowired
    WorldService worldService;

//    @Value("${my.content}")//从配置文件中获取my.content的值
//    private String content= "";
//
//    @Value("${url}")
//    private String redisUrl;
//
//
//    @Value("${dataurl}")
//    private String dbUrl;
    /**
     * feign声明式调用
     * @return
     */
    @GetMapping("/hello")
    public String hello(){

        String msg = "";


        //远程调用gulimall-pms服务的 /world 请求对应的方法,并接受返回值
        msg = worldService.world();
        return "hello "+ msg;
    }
}
