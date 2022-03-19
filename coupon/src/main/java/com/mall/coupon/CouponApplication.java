package com.mall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* 想要远程调用别的服务
* 引入oprn-feign
* 编写一个接口，告诉springcloud这个接口需要调用远程服务
* 声明接口的每一个方法都是调用哪个远程服务的哪个请求。
* 开启远程调用功能，注解：@EnableFeignClients
* */

@EnableFeignClients(basePackages = "com.mall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class CouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class, args);
    }

}
