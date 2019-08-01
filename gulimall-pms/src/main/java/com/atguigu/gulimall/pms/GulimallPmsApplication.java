package com.atguigu.gulimall.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * 1、在配置文件中加入 mapper-locations
 *
 * 2、使用@MapperScan扫描所有mapper接口
 */

@EnableSwagger2
@MapperScan(basePackages = "com.atguigu.gulimall.pms.dao")
@SpringBootApplication
public class GulimallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallPmsApplication.class, args);
    }

}
